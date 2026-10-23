<div align="center">

# ☁️ CloudPhone & MetaScreen
### 全栈移动云基础设施 • 云游戏沙盒 • 移动系统安全与实时推流技术服务商

[English](README_en.md) | [访问官网](https://metascreen.io/) | [在线演示 | Agent无仿真版本](https://cloudplay.live/screen-index-phone-2-agent)

[![Android](https://img.shields.io/badge/Android-VMOS_Cloud-blue?style=for-the-badge&logo=android)](https://www.vmoscloud.com)
[![iOS](https://img.shields.io/badge/iOS-iModular-lightgrey?style=for-the-badge&logo=apple)](https://imodular.cloud)
[![AIGC](https://img.shields.io/badge/AIGC-算力云平台-orange?style=for-the-badge&logo=openai)](https://api.autodl.com/home)

</div>

---

## 📌 关于我们 (About Us)

**CloudPhone & MetaScreen** 是 **移动云基础设施与系统安全解决方案提供商**。

我们专注于 ARM & 商用显卡异构虚拟化、原生 WebRTC 低延迟推流、系统级安全攻防对抗及 Play Integrity 认证技术。为伙伴提供从**底层 ROM 镜像定制、云手机/游戏沙盒搭建，到高级风控引擎与 AI Agent 自动化**的技术服务。

---

## 🛠️ 四大核心技术服务

### 1. 📱 云手机系统与异构虚拟化 (CloudPhone Infrastructure)
* **定制 ROM 镜像**：基于 Android 15/16 官方 ROM 及 QEMU 架构，深度定制系统内核。
* **异构平台部署**：无缝适配 Apple Mac Silicon、瑞芯微 RK3588、华为鲲鹏 920、Ampere 及 AWS/GCP 等主流 ARM/x86 硬件。
* **弹性云控集群**：提供毫秒级实例启动、多实例并发调度、远程剪贴板与全量传感器仿真。

### 2. 🎮 云游戏沙盒系统 (Game Sandbox & Performance)
* **高帧率&低功耗**：专为 H5 / 网页即点即玩、云试玩定制，支持 GPU 渲染加速与高帧率串流。
* **极速并发**：支持 DockerDroid 容器化轻量部署，降低硬件投入与部署成本。
* **商业化变现**：提供云游戏变现渠道聚合与高并发试玩场景集成方案。

### 3. 🛡️ 移动系统安全与风控引擎 (Mobile Security & Integrity)
* **VM 指令级虚拟执行引擎**：自研 runtime 引擎，支持指令 Hooking、重定向与 Syscall 行为语义解析。
* **Play Integrity 代签 & 过检测**：完整通过官方 Play Integrity 认证，提供协议级风控对抗与定制 ROM 方案。
* **安全沙盒与蜜罐**：内核级隔离环境，适用于威胁分析、病毒诱捕、黑灰产攻防与自动化安全评估。

### 4. 📡 实时推流与云控交互 (WebRTC Stream & Control)
* **原生 WebRTC 超低延迟**：提供音视频实时推流（WebRTC / RTSP），优化网络抖动，保证极低时延体验。
* **云控与自动化控制**：底层输入链路控制，无缝集成 AI 视觉 Agent（AgentPhone），实现 UI 自主规划与自动化养号。

---

## 🏛️ 产品矩阵 (Product Ecosystem)

| 产品名称 | 技术分类 | 核心定位与场景 |
| :--- | :--- | :--- |
| **SandBox Phone** | 🛡️ 移动安全 | **[攻防对抗]** 内核级隔离环境，专为高风险应用运行、病毒分析与安全研究打造。 |
| **Real Device Cloud** | 📱 云真机系统 | **[物理真机集群]** 提供真实硬件传感器与系统行为，专为高强度风控与测试设计。 |
| **HyperDroid K** | 📱 云手机系统 | **[KVM 架构]** 高性能 Android 云手机，强调内核隔离、安全性与服务器高密度部署。 |
| **DockerDroid OS** | 🎮 云游戏沙盒 | **[容器技术]** 基于 Docker 的轻量级 Android 环境，毫秒级启动，适合高并发任务调度。 |
| **MetaStream Phone**| 📡 实时推流 | **[低延迟推流]** 以音视频流为核心，支持 WebRTC/RTSP，不仅是手机，更是实时互动的屏幕。 |
| **AgentPhone** | 🤖 AI 自动化 | **[AI Agent]** 具备视觉理解能力的智能云手机，自主规划 UI 操作，实现"听令而动"。 |
| **iSilicon Cloud** | 🍏 iOS 云方案 | **[iOS 虚拟化]** 支持远程调试、插件化控制与 iOS 设备批量管理的云平台。 |

---

## 🌐 行业解决方案 (Solutions)

* **🌏 社媒矩阵与跨境出海**：多账号独立隔离、独享 IP、虚拟定位与自动化养号。
* **🎮 云游戏与试玩广告**：H5 即点即玩，极低渲染延迟，大幅降低广告获客成本 (CAC)。
* **🛡️ 金融科技与应用风控**：设备指纹伪装、反分身/反模拟器检测、Play Integrity 代签服务。
* **🕷️ 自动化数据采集**：高并发沙盒实例支持，配合 AI Agent 实现全自动数据抓取与交互。

---

## 💻 硬件与部署架构

<details>
<summary><strong>👉 点击展开硬件兼容性列表</strong></summary>

### 🟢 ARM 架构（推荐：高密度、高兼容）
* **消费级/边缘板卡：** 瑞芯微 RK3588 (香橙派 OrangePi 5 全系等)
* **服务器级芯片：** 华为鲲鹏 920, Ampere Altra (Oracle/AWS), 阿里云 G6r
* **移动芯片定制：** 天玑 9000 / 高通骁龙 845 / 865 集群

### 🔵 X86 架构 + GPU 加速
* **图形加速卡：** NVIDIA GeForce/Tesla 系列, AMD Radeon 系列
* **应用场景：** 高性能云游戏渲染、3D 渲染与 AI 视觉模型推理
</details>

### 🔗 开源与工具支持
* [OrangePi 5 内核补丁](https://github.com/lloves/OrangePi5-support)
* [云手机开源代理 (redsocks)](https://github.com/lloves/proxy_android)
* [WebRTC + 联系人开源分享](https://github.com/lloves/WebrtcScreen)


---

## 🤝 技术交流 / 商务合作
**基于 ARM 虚拟化，构建高仿真、可执行的移动云与 AI 世界**
</br>

<div style="display: flex; align-items: center; gap: 20px;">
  <img src="https://github-cloud-phone.oss-cn-hangzhou.aliyuncs.com/games/20221020/136.png" width="120" height="120" alt="WeChat QR">
  <div>
    <ul style="list-style: none; padding: 0;">
      <li>💬 <strong>WeChat:</strong> <code>smbbbla</code></li>
      <li>✈️ <strong>Telegram:</strong> <a href="https://t.me/metascreenbi">@metascreenbi</a> (仅限技术交流)</li>
      <li>⚠️ <strong>注意:</strong> 谨防冒充账号，谢谢审核。</li>
    </ul>
  </div>
</div>

---

<div align="center">
  <sub>Copyright © 2025-2026 CloudPhone Project. All Rights Reserved.</sub>
</div>
