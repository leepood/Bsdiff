Bsdiff
======
###Android增量更新实现的代码，自己编译了zlib
---


如何使用:

- 配置好ndk环境
- 执行ndk-build生成so文件
- 	调用 `PatchTools.applay_patch("/mnt/sdcard/reader3.apk", "/mnt/sdcard/newreader.apk", "/mnt/sdcard/ireader.p");` 方法，合成一个新的apk文件，其中ireader.p是生成的一个增量文件

**如果编译无法通过请先`ndk-build clean`**

**建议在ubuntu或者mac下编译,cygwin或许有问题**

###联系我
---
Email:leepood@gmail.com

Blog:[http://blog.leepood.com](http://blog.leepood.com)