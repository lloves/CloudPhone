import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

import org.jetbrains.annotations.Nullable;

import java.net.NetworkInterface;
import java.util.Collections;
import java.util.List;

public class NetworkInfoActivity extends AppCompatActivity {

    private static final int PERMISSIONS_REQUEST_CODE = 1;
    private TextView networkInfoTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network_info);

        networkInfoTextView = findViewById(R.id.network_info_text_view);

        // Check for permissions
        if (ActivityCompat.checkSelfPermission(this, "android.permission.ACCESS_NETWORK_STATE") != PackageManager.PERMISSION_GRANTED ||
                ActivityCompat.checkSelfPermission(this, "android.permission.READ_PHONE_STATE") != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{
                    "android.permission.ACCESS_NETWORK_STATE",
                    "android.permission.READ_PHONE_STATE"
            }, PERMISSIONS_REQUEST_CODE);
        } else {
            displayNetworkInfo();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == PERMISSIONS_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                displayNetworkInfo();
            }
        }
    }

    private void displayNetworkInfo() {
        StringBuilder sb = new StringBuilder();

        // Get ConnectivityManager
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null) {
            // getActiveNetworkInfo (deprecated in API level 29)
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if (networkInfo != null) {
                sb.append("Active Network Info: ").append(networkInfo.toString()).append("\n\n\n");
            }

            // getActiveNetwork
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null) {
                sb.append("Active Network: ").append(activeNetwork.toString()).append("\n\n\n");

                // getNetworkCapabilities
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities != null) {
                    sb.append("Network Capabilities: ").append(networkCapabilities.toString()).append("\n\n\n");
                }
            }
        }

        // Get NetworkInterface information
        try {
            List<NetworkInterface> networkInterfaces = Collections.list(NetworkInterface.getNetworkInterfaces());
            for (NetworkInterface networkInterface : networkInterfaces) {
                sb.append("Network Interface: ").append(networkInterface.getDisplayName()).append("\n\n\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Get TelephonyManager
        TelephonyManager telephonyManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        if (telephonyManager != null) {
            int networkType = telephonyManager.getNetworkType();
            sb.append("Network Type: ").append(getNetworkTypeString(networkType)).append("\n\n\n");
        }

        networkInfoTextView.setText(sb.toString());
    }

    private String getNetworkTypeString(int networkType) {
        switch (networkType) {
            case TelephonyManager.NETWORK_TYPE_GPRS:
                return "GPRS";
            case TelephonyManager.NETWORK_TYPE_EDGE:
                return "EDGE";
            case TelephonyManager.NETWORK_TYPE_UMTS:
                return "UMTS";
            case TelephonyManager.NETWORK_TYPE_HSDPA:
                return "HSDPA";
            case TelephonyManager.NETWORK_TYPE_HSUPA:
                return "HSUPA";
            case TelephonyManager.NETWORK_TYPE_HSPA:
                return "HSPA";
            case TelephonyManager.NETWORK_TYPE_LTE:
                return "LTE";
            case TelephonyManager.NETWORK_TYPE_NR:
                return "5G";
            default:
                return "UNKNOWN";
        }
    }
