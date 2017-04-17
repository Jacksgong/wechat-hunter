# Wechat Hunter

![][wechat_hunter_svg]
![][xposed_module_svg]

这个模块是因为这几天都在玩王者荣耀游戏，后面老是被坑怒卸了，后来老是想要打开微信的游戏中心，看看好友动态，但是看了又想玩，于是就在设置->通用->功能里面找，却没有找到关闭游戏模块的地方，所以就看了下[Xposed文档](https://github.com/rovo89/XposedBridge/wiki/Development-tutorial)，隐藏了微信的游戏中心。你也可以通过安装[crash-pvp](https://github.com/Jacksgong/crash-pvp)这个模块，让一启动王者荣耀程序就立马Crash。

#### 目前支持功能:

> 已经在[Xposed Module Repository](http://repo.xposed.info/module/cn.dreamtobe.xposed.wechathunter)中发布。

- 隐藏发现页面的游戏中心 -- added since v1.0

<img src="https://raw.githubusercontent.com/Jacksgong/wechat-hunter/master/arts/no-game.png" height="500px"/>

## LICENSE

```
Copyright (C) 2017 Jacksgong(blog.dreamtobe.cn)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

[xposed_module_svg]: https://img.shields.io/badge/Xposed-Module-orange.svg
[wechat_hunter_svg]: https://img.shields.io/badge/Wechat-Hunter-green.svg
