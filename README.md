# 桂林医学院报修系统后台
> - 后台前端：[https://github.com/wuhonghui123/BxSystem-PC.git](https://github.com/wuhonghui123/BxSystem-PC.git)
> - 开发帮助文档：[https://notes.youngkbt.cn/rrs/details/](https://notes.youngkbt.cn/rrs/details/)
> - 后端源代码：[https://github.com/programmingwang/glyxybxxththd.git](https://github.com/programmingwang/glyxybxxththd.git)
> - 后台前端源代码：[https://github.com/programmingwang/glyxybxxtqdPC.git](https://github.com/programmingwang/glyxybxxtqdPC.git)
> - 手机端源代码：[https://github.com/programmingwang/glyxybxxtmobile.git](https://github.com/programmingwang/glyxybxxtmobile.git)
---
- ### 分工说明：
- > admin-service（吴鸿辉）: 登录、定时等杂项接口

- > baoxiudan-service（严纪远）:报修单相关接口

- > baoxiuquyu-service（易其延）:报修区域相关接口

- > ewm-service（吕翔）:二维码相关接口

- > haocai-service（欧安怡）:耗材相关接口

- > shenheyuan_jiedanren-service（何忠生）:审核员、接单人、签到接口

- > api-service :汇总接口，将所有微服务的接口汇总到同一端口：8800

---
- 分微服务的时候把源代码的接口基本都分到了各自的微服务，只需参照着源代码把相关接口实现
- 开发时需要使用其他微服务的功能通过openfeigon引用即可，一些工具类可以直接从源代码复制过来
- 有些功能需要引用源代码依赖，仔细看看源代码找到那个依赖

