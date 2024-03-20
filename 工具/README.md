# 常用的工具/脚本

- Clone 读取真机信息的方法
```
A_DIR="/sys/devices/system/cpu"
B_DIR="/sdcard/device_info"

rm -rf $B_DIR
mkdir $B_DIR
# GPU
dumpsys SurfaceFlinger | grep GLES > $B_DIR/gpuinfo
# System prop
getprop > $B_DIR/system.prop
# Display
dumpsys display | grep mBaseDisplayInfo > $B_DIR/display_size
# sensor
dumpsys sensorservice > $B_DIR/sensor_info
# Battery
dumpsys battery > $B_DIR/battery_info
# input_methods
settings get secure enabled_input_methods > $B_DIR/input_methods
# app list
pm list packages -f | grep "data" > $B_DIR/3_app_list
# service list
service list > $B_DIR/3_system_service_list
# cpu
cat /proc/cpuinfo > $B_DIR/cpuinfo
# meminfo
cat /proc/meminfo > $B_DIR/meminfo
# cpu 
find -L "$A_DIR" -type f | while read file; do
    rel_path="${file#$A_DIR}"
    mkdir -p "$B_DIR$rel_path"    
    cat "$file" > "$B_DIR$rel_path/$(basename "$file")"
done


```
