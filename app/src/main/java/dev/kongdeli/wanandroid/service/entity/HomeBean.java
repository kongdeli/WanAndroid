package dev.kongdeli.wanandroid.service.entity;

import java.util.List;

public class HomeBean {

    /**
     * data : {"curPage":2,"datas":[{"apkLink":"","author":"lizixian18","chapterId":385,"chapterName":"架构",
     * "collect":false,"courseId":13,"desc":"一个简单强大且灵活的MVP框架","envelopePic":"http://www.wanandroid
     * .com/resources/image/pc/default_project_img.jpg","fresh":false,"id":3196,"link":"http://www.wanandroid
     * .com/blog/show/2253","niceDate":"2018-07-29","origin":"","projectLink":"https://github
     * .com/lizixian18/EasyMvp","publishTime":1532870374000,"superChapterId":294,"superChapterName":"开源项目主Tab",
     * "tags":[{"name":"项目","url":"/project/list/1?cid=385"}],"title":"EasyMvp 一个简单强大且灵活的MVP框架","type":0,"userId":-1,
     * "visible":1,"zan":0},{"apkLink":"","author":"CodingEnding","chapterId":387,"chapterName":"对话框",
     * "collect":false,"courseId":13,"desc":"PopupLayout是通用弹出布局辅助库，允许开发者从顶部、底部、左侧、右侧和中心这五个位置弹出自己指定的View
     * ，此外还提供圆角和动画特性。","envelopePic":"http://www.wanandroid.com/blogimgs/4838a40c-f56c-4a0e-bcb9-3c1aecb45c21.png",
     * "fresh":false,"id":3195,"link":"http://www.wanandroid.com/blog/show/2252","niceDate":"2018-07-29","origin":"",
     * "projectLink":"https://github.com/CodingEnding/PopupLayout","publishTime":1532870351000,"superChapterId":294,
     * "superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=387"}],"title":"PopupLayout
     * 通用弹出布局辅助库","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"CarGuo","chapterId":371,
     * "chapterName":"Flutter项目","collect":false,"courseId":13,"desc":"超完整的Flutter项目，功能丰富，适合学习和日常使用，已有同款开源React
     * Native、Weex版本。旨在更好的日常管理和维护个人Github。同款Weex版本 ： https://github.com/CarGuo/GSYGithubAppWeex 、同款React Native版本 ：
     * https://github.com/CarGuo/GSYGithubApp。","envelopePic":"http://www.wanandroid
     * .com/blogimgs/f5012c76-735c-4128-a820-cde2ea20bfee.png","fresh":false,"id":3194,"link":"http://www.wanandroid
     * .com/blog/show/2251","niceDate":"2018-07-29","origin":"","projectLink":"https://github
     * .com/CarGuo/GSYGithubAppFlutter","publishTime":1532870236000,"superChapterId":294,
     * "superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=371"}],"title":"超完整开源Flutter
     * Github客户端App GSYGithubAppFlutter","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"轶匠",
     * "chapterId":399,"chapterName":"抓包","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,
     * "id":3192,"link":"https://www.jianshu.com/p/276bb5a49e59","niceDate":"2018-07-29","origin":"",
     * "projectLink":"","publishTime":1532837367000,"superChapterId":135,"superChapterName":"项目必备","tags":[],
     * "title":"Charles修改返回值和返回状态","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"于卫国",
     * "chapterId":398,"chapterName":"速查","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,
     * "id":3191,"link":"https://www.jianshu.com/p/a106e8c72eed","niceDate":"2018-07-29","origin":"",
     * "projectLink":"","publishTime":1532835962000,"superChapterId":398,"superChapterName":"速查知识表","tags":[],
     * "title":"速查 | Android 混淆流程及产物（译文）","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"",
     * "author":"JerryloveEmily","chapterId":182,"chapterName":"JNI编程","collect":false,"courseId":13,"desc":"",
     * "envelopePic":"","fresh":false,"id":3190,"link":"https://juejin.im/post/5b5b16535188251afe7b99e5",
     * "niceDate":"2018-07-28","origin":"","projectLink":"","publishTime":1532784829000,"superChapterId":149,
     * "superChapterName":"JNI","tags":[],"title":"JNI系列之入门Hello JNI C（一）","type":0,"userId":-1,"visible":1,"zan":0},
     * {"apkLink":"","author":"iceCola7","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,
     * "desc":"项目采用 Kotlin 语言，基于 MVP + RxJava + Retrofit + Glide + EventBus 等架构设计，努力打造一款优秀的 http://www.wanandroid
     * .com/ 客户端","envelopePic":"http://www.wanandroid.com/blogimgs/d6746246-55b0-4925-a401-7b2e85d7933d.png",
     * "fresh":false,"id":3189,"link":"http://www.wanandroid.com/blog/show/2250","niceDate":"2018-07-28","origin":"",
     * "projectLink":"https://github.com/iceCola7/WanAndroid","publishTime":1532751694000,"superChapterId":294,
     * "superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],
     * "title":"Kotlin版WanAndroid客户端","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"guanpj",
     * "chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"API 来自官网 https://readhub.me，采用 MVP
     * + Dagger 架构进行开发，网络请求使用 Retrofit + RxJava 2 框架，数据库存储使用 Room + RxJava 2 框架。项目模块不多，但是麻雀虽小五脏俱全。适合 Dagger
     * 、RxJava、Room 等框架的入门学习，没什么意外的话会一直维护。","envelopePic":"http://www.wanandroid
     * .com/blogimgs/251b4ff8-5f8c-4435-aa7f-baf404ffa273.png","fresh":false,"id":3188,"link":"http://www.wanandroid
     * .com/blog/show/2249","niceDate":"2018-07-28","origin":"","projectLink":"https://github.com/guanpj/JReadHub",
     * "publishTime":1532751544000,"superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目",
     * "url":"/project/list/1?cid=294"}],"title":"目前功能最完整的 Readhub 客户端","type":0,"userId":-1,"visible":1,"zan":0},
     * {"apkLink":"","author":"会撒娇的犀犀利","chapterId":329,"chapterName":"Android 8.0","collect":false,"courseId":13,
     * "desc":"","envelopePic":"","fresh":false,"id":3187,"link":"https://www.jianshu.com/p/ca88fcbbf6c5",
     * "niceDate":"2018-07-26","origin":"","projectLink":"","publishTime":1532583408000,"superChapterId":179,
     * "superChapterName":"5.+高新技术","tags":[],"title":"Android 8.0 解决不能自动安装APK问题","type":0,"userId":-1,"visible":1,
     * "zan":0},{"apkLink":"","author":" JerryloveEmily","chapterId":260,"chapterName":"RxJava & Retrofit & MVP",
     * "collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3186,"link":"https://juejin
     * .im/post/5b5927eae51d4518e311a93f","niceDate":"2018-07-26","origin":"","projectLink":"",
     * "publishTime":1532581803000,"superChapterId":135,"superChapterName":"项目必备","tags":[],"title":"RxJava
     * 2.x入门新姿势一","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"齐翊","chapterId":185,
     * "chapterName":"组件化","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3185,
     * "link":"https://juejin.im/post/5b255f6ce51d45588f2d1f89","niceDate":"2018-07-26","origin":"","projectLink":"",
     * "publishTime":1532581063000,"superChapterId":186,"superChapterName":"热门专题","tags":[],
     * "title":"业内首个支持渐进式组件化的开源框架","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"速查小编",
     * "chapterId":398,"chapterName":"速查","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,
     * "id":3184,"link":"http://www.wanandroid.com/blog/show/2248","niceDate":"2018-07-26","origin":"",
     * "projectLink":"","publishTime":1532576732000,"superChapterId":398,"superChapterName":"速查知识表","tags":[],
     * "title":"速查 | GitFlow 流程","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"myqianlan",
     * "chapterId":390,"chapterName":"Git","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,
     * "id":3183,"link":"https://www.cnblogs.com/myqianlan/p/4195994.html","niceDate":"2018-07-26","origin":"",
     * "projectLink":"","publishTime":1532576348000,"superChapterId":390,"superChapterName":"项目管理","tags":[],
     * "title":"git 团队协作的一些命令","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"腾讯移动品质中心TMQ",
     * "chapterId":304,"chapterName":"基础源码","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,
     * "id":3182,"link":"https://mp.weixin.qq.com/s/5V9VhkfEif22ZvYWeOKWoA","niceDate":"2018-07-25","origin":"",
     * "projectLink":"","publishTime":1532510362000,"superChapterId":245,"superChapterName":"Java深入","tags":[],
     * "title":"从Java乱码谈起","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"字节跳动技术团队",
     * "chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,
     * "id":3181,"link":"https://www.jianshu.com/p/09dc7e734346","niceDate":"2018-07-25","origin":"",
     * "projectLink":"","publishTime":1532504808000,"superChapterId":186,"superChapterName":"热门专题","tags":[],
     * "title":"头条APK瘦身之路","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Jdqm","chapterId":61,
     * "chapterName":"Android测试相关","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3180,
     * "link":"https://www.jianshu.com/p/aa51a3e007e2","niceDate":"2018-07-25","origin":"","projectLink":"",
     * "publishTime":1532503983000,"superChapterId":186,"superChapterName":"热门专题","tags":[],
     * "title":"Android单元测试只看这一篇就够了","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"Mobcase",
     * "chapterId":358,"chapterName":"项目基础功能","collect":false,"courseId":13,"desc":" 轻量级的Android图片压缩插件，采用Hook Gradle
     * Task的方式，压缩module，jar，aar中所有的png图片并有策略的转换成webp（已考虑各种情况），全自动压缩无需认为干涉，简单集成，所有开关可配置。已应用在大型商业App中",
     * "envelopePic":"http://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"id":3179,
     * "link":"http://www.wanandroid.com/blog/show/2247","niceDate":"2018-07-25","origin":"",
     * "projectLink":"https://github.com/Mobcase/McImage","publishTime":1532503000000,"superChapterId":294,
     * "superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=358"}],"title":"McImage
     * Android端自动化图片压缩插件","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"鸿洋公众号","chapterId":73,
     * "chapterName":"面试相关","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3177,
     * "link":"https://mp.weixin.qq.com/s/haZRurfMHQzzr-ffxAh20w","niceDate":"2018-07-24","origin":"",
     * "projectLink":"","publishTime":1532442910000,"superChapterId":186,"superChapterName":"热门专题","tags":[],
     * "title":"我的杭州面试之旅","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"像一只狗","chapterId":321,
     * "chapterName":"算法","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3176,
     * "link":"https://juejin.im/post/5b5536825188251af6622815","niceDate":"2018-07-24","origin":"","projectLink":"",
     * "publishTime":1532442375000,"superChapterId":245,"superChapterName":"Java深入","tags":[],"title":"了解面试算法之 -
     * 栈&amp;队列&amp;位运算","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"weizongwei5",
     * "chapterId":363,"chapterName":"创意汇","collect":false,"courseId":13,"desc":"非常优雅的方案实现屏幕截图，利用android
     * 5.0之后的录屏API实现截屏。\r\n","envelopePic":"http://www.wanandroid.com/resources/image/pc/default_project_img.jpg",
     * "fresh":false,"id":3154,"link":"http://www.wanandroid.com/blog/show/2233","niceDate":"2018-07-24","origin":"",
     * "projectLink":"https://github.com/weizongwei5/AndroidScreenShot_SysApi","publishTime":1532415791000,
     * "superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=363"}],
     * "title":"优雅的方案实现屏幕截图  AndroidScreenShot_SysApi","type":0,"userId":-1,"visible":1,"zan":0}],"offset":20,
     * "over":false,"pageCount":76,"size":20,"total":1515}
     * errorCode : 0
     * errorMsg :
     */

    public DataBean data;
    public int errorCode;
    public String errorMsg;

    public static class DataBean {
        /**
         * curPage : 2
         * datas : [{"apkLink":"","author":"lizixian18","chapterId":385,"chapterName":"架构","collect":false,
         * "courseId":13,"desc":"一个简单强大且灵活的MVP框架","envelopePic":"http://www.wanandroid
         * .com/resources/image/pc/default_project_img.jpg","fresh":false,"id":3196,"link":"http://www.wanandroid
         * .com/blog/show/2253","niceDate":"2018-07-29","origin":"","projectLink":"https://github
         * .com/lizixian18/EasyMvp","publishTime":1532870374000,"superChapterId":294,"superChapterName":"开源项目主Tab",
         * "tags":[{"name":"项目","url":"/project/list/1?cid=385"}],"title":"EasyMvp 一个简单强大且灵活的MVP框架","type":0,
         * "userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"CodingEnding","chapterId":387,
         * "chapterName":"对话框","collect":false,"courseId":13,
         * "desc":"PopupLayout是通用弹出布局辅助库，允许开发者从顶部、底部、左侧、右侧和中心这五个位置弹出自己指定的View，此外还提供圆角和动画特性。",
         * "envelopePic":"http://www.wanandroid.com/blogimgs/4838a40c-f56c-4a0e-bcb9-3c1aecb45c21.png","fresh":false,
         * "id":3195,"link":"http://www.wanandroid.com/blog/show/2252","niceDate":"2018-07-29","origin":"",
         * "projectLink":"https://github.com/CodingEnding/PopupLayout","publishTime":1532870351000,
         * "superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=387"}],
         * "title":"PopupLayout 通用弹出布局辅助库","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"CarGuo",
         * "chapterId":371,"chapterName":"Flutter项目","collect":false,"courseId":13,
         * "desc":"超完整的Flutter项目，功能丰富，适合学习和日常使用，已有同款开源React Native、Weex版本。旨在更好的日常管理和维护个人Github。同款Weex版本 ：
         * https://github.com/CarGuo/GSYGithubAppWeex 、同款React Native版本 ： https://github.com/CarGuo/GSYGithubApp。",
         * "envelopePic":"http://www.wanandroid.com/blogimgs/f5012c76-735c-4128-a820-cde2ea20bfee.png","fresh":false,
         * "id":3194,"link":"http://www.wanandroid.com/blog/show/2251","niceDate":"2018-07-29","origin":"",
         * "projectLink":"https://github.com/CarGuo/GSYGithubAppFlutter","publishTime":1532870236000,
         * "superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=371"}],
         * "title":"超完整开源Flutter Github客户端App GSYGithubAppFlutter","type":0,"userId":-1,"visible":1,"zan":0},
         * {"apkLink":"","author":"轶匠","chapterId":399,"chapterName":"抓包","collect":false,"courseId":13,"desc":"",
         * "envelopePic":"","fresh":false,"id":3192,"link":"https://www.jianshu.com/p/276bb5a49e59",
         * "niceDate":"2018-07-29","origin":"","projectLink":"","publishTime":1532837367000,"superChapterId":135,
         * "superChapterName":"项目必备","tags":[],"title":"Charles修改返回值和返回状态","type":0,"userId":-1,"visible":1,"zan":0},
         * {"apkLink":"","author":"于卫国","chapterId":398,"chapterName":"速查","collect":false,"courseId":13,"desc":"",
         * "envelopePic":"","fresh":false,"id":3191,"link":"https://www.jianshu.com/p/a106e8c72eed",
         * "niceDate":"2018-07-29","origin":"","projectLink":"","publishTime":1532835962000,"superChapterId":398,
         * "superChapterName":"速查知识表","tags":[],"title":"速查 | Android 混淆流程及产物（译文）","type":0,"userId":-1,"visible":1,
         * "zan":0},{"apkLink":"","author":"JerryloveEmily","chapterId":182,"chapterName":"JNI编程","collect":false,
         * "courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3190,"link":"https://juejin
         * .im/post/5b5b16535188251afe7b99e5","niceDate":"2018-07-28","origin":"","projectLink":"",
         * "publishTime":1532784829000,"superChapterId":149,"superChapterName":"JNI","tags":[],"title":"JNI系列之入门Hello
         * JNI C（一）","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"iceCola7","chapterId":294,
         * "chapterName":"完整项目","collect":false,"courseId":13,"desc":"项目采用 Kotlin 语言，基于 MVP + RxJava + Retrofit +
         * Glide + EventBus 等架构设计，努力打造一款优秀的 http://www.wanandroid.com/ 客户端","envelopePic":"http://www.wanandroid
         * .com/blogimgs/d6746246-55b0-4925-a401-7b2e85d7933d.png","fresh":false,"id":3189,"link":"http://www
         * .wanandroid.com/blog/show/2250","niceDate":"2018-07-28","origin":"","projectLink":"https://github
         * .com/iceCola7/WanAndroid","publishTime":1532751694000,"superChapterId":294,"superChapterName":"开源项目主Tab",
         * "tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"Kotlin版WanAndroid客户端","type":0,
         * "userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"guanpj","chapterId":294,"chapterName":"完整项目",
         * "collect":false,"courseId":13,"desc":"API 来自官网 https://readhub.me，采用 MVP + Dagger 架构进行开发，网络请求使用 Retrofit +
         * RxJava 2 框架，数据库存储使用 Room + RxJava 2 框架。项目模块不多，但是麻雀虽小五脏俱全。适合 Dagger 、RxJava、Room 等框架的入门学习，没什么意外的话会一直维护。",
         * "envelopePic":"http://www.wanandroid.com/blogimgs/251b4ff8-5f8c-4435-aa7f-baf404ffa273.png","fresh":false,
         * "id":3188,"link":"http://www.wanandroid.com/blog/show/2249","niceDate":"2018-07-28","origin":"",
         * "projectLink":"https://github.com/guanpj/JReadHub","publishTime":1532751544000,"superChapterId":294,
         * "superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"目前功能最完整的
         * Readhub 客户端","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"会撒娇的犀犀利","chapterId":329,
         * "chapterName":"Android 8.0","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,
         * "id":3187,"link":"https://www.jianshu.com/p/ca88fcbbf6c5","niceDate":"2018-07-26","origin":"",
         * "projectLink":"","publishTime":1532583408000,"superChapterId":179,"superChapterName":"5.+高新技术","tags":[],
         * "title":"Android 8.0 解决不能自动安装APK问题","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"
         * JerryloveEmily","chapterId":260,"chapterName":"RxJava & Retrofit & MVP","collect":false,"courseId":13,
         * "desc":"","envelopePic":"","fresh":false,"id":3186,"link":"https://juejin
         * .im/post/5b5927eae51d4518e311a93f","niceDate":"2018-07-26","origin":"","projectLink":"",
         * "publishTime":1532581803000,"superChapterId":135,"superChapterName":"项目必备","tags":[],"title":"RxJava
         * 2.x入门新姿势一","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"齐翊","chapterId":185,
         * "chapterName":"组件化","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":3185,
         * "link":"https://juejin.im/post/5b255f6ce51d45588f2d1f89","niceDate":"2018-07-26","origin":"",
         * "projectLink":"","publishTime":1532581063000,"superChapterId":186,"superChapterName":"热门专题","tags":[],
         * "title":"业内首个支持渐进式组件化的开源框架","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"速查小编",
         * "chapterId":398,"chapterName":"速查","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,
         * "id":3184,"link":"http://www.wanandroid.com/blog/show/2248","niceDate":"2018-07-26","origin":"",
         * "projectLink":"","publishTime":1532576732000,"superChapterId":398,"superChapterName":"速查知识表","tags":[],
         * "title":"速查 | GitFlow 流程","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"myqianlan",
         * "chapterId":390,"chapterName":"Git","collect":false,"courseId":13,"desc":"","envelopePic":"",
         * "fresh":false,"id":3183,"link":"https://www.cnblogs.com/myqianlan/p/4195994.html","niceDate":"2018-07-26",
         * "origin":"","projectLink":"","publishTime":1532576348000,"superChapterId":390,"superChapterName":"项目管理",
         * "tags":[],"title":"git 团队协作的一些命令","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"",
         * "author":"腾讯移动品质中心TMQ","chapterId":304,"chapterName":"基础源码","collect":false,"courseId":13,"desc":"",
         * "envelopePic":"","fresh":false,"id":3182,"link":"https://mp.weixin.qq.com/s/5V9VhkfEif22ZvYWeOKWoA",
         * "niceDate":"2018-07-25","origin":"","projectLink":"","publishTime":1532510362000,"superChapterId":245,
         * "superChapterName":"Java深入","tags":[],"title":"从Java乱码谈起","type":0,"userId":-1,"visible":1,"zan":0},
         * {"apkLink":"","author":"字节跳动技术团队","chapterId":78,"chapterName":"性能优化","collect":false,"courseId":13,
         * "desc":"","envelopePic":"","fresh":false,"id":3181,"link":"https://www.jianshu.com/p/09dc7e734346",
         * "niceDate":"2018-07-25","origin":"","projectLink":"","publishTime":1532504808000,"superChapterId":186,
         * "superChapterName":"热门专题","tags":[],"title":"头条APK瘦身之路","type":0,"userId":-1,"visible":1,"zan":0},
         * {"apkLink":"","author":"Jdqm","chapterId":61,"chapterName":"Android测试相关","collect":false,"courseId":13,
         * "desc":"","envelopePic":"","fresh":false,"id":3180,"link":"https://www.jianshu.com/p/aa51a3e007e2",
         * "niceDate":"2018-07-25","origin":"","projectLink":"","publishTime":1532503983000,"superChapterId":186,
         * "superChapterName":"热门专题","tags":[],"title":"Android单元测试只看这一篇就够了","type":0,"userId":-1,"visible":1,
         * "zan":0},{"apkLink":"","author":"Mobcase","chapterId":358,"chapterName":"项目基础功能","collect":false,
         * "courseId":13,"desc":" 轻量级的Android图片压缩插件，采用Hook Gradle
         * Task的方式，压缩module，jar，aar中所有的png图片并有策略的转换成webp（已考虑各种情况），全自动压缩无需认为干涉，简单集成，所有开关可配置。已应用在大型商业App中",
         * "envelopePic":"http://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,
         * "id":3179,"link":"http://www.wanandroid.com/blog/show/2247","niceDate":"2018-07-25","origin":"",
         * "projectLink":"https://github.com/Mobcase/McImage","publishTime":1532503000000,"superChapterId":294,
         * "superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=358"}],"title":"McImage
         * Android端自动化图片压缩插件","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"鸿洋公众号",
         * "chapterId":73,"chapterName":"面试相关","collect":false,"courseId":13,"desc":"","envelopePic":"",
         * "fresh":false,"id":3177,"link":"https://mp.weixin.qq.com/s/haZRurfMHQzzr-ffxAh20w",
         * "niceDate":"2018-07-24","origin":"","projectLink":"","publishTime":1532442910000,"superChapterId":186,
         * "superChapterName":"热门专题","tags":[],"title":"我的杭州面试之旅","type":0,"userId":-1,"visible":1,"zan":0},
         * {"apkLink":"","author":"像一只狗","chapterId":321,"chapterName":"算法","collect":false,"courseId":13,"desc":"",
         * "envelopePic":"","fresh":false,"id":3176,"link":"https://juejin.im/post/5b5536825188251af6622815",
         * "niceDate":"2018-07-24","origin":"","projectLink":"","publishTime":1532442375000,"superChapterId":245,
         * "superChapterName":"Java深入","tags":[],"title":"了解面试算法之 - 栈&amp;队列&amp;位运算","type":0,"userId":-1,
         * "visible":1,"zan":0},{"apkLink":"","author":"weizongwei5","chapterId":363,"chapterName":"创意汇",
         * "collect":false,"courseId":13,"desc":"非常优雅的方案实现屏幕截图，利用android 5.0之后的录屏API实现截屏。\r\n",
         * "envelopePic":"http://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,
         * "id":3154,"link":"http://www.wanandroid.com/blog/show/2233","niceDate":"2018-07-24","origin":"",
         * "projectLink":"https://github.com/weizongwei5/AndroidScreenShot_SysApi","publishTime":1532415791000,
         * "superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=363"}],
         * "title":"优雅的方案实现屏幕截图  AndroidScreenShot_SysApi","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : 20
         * over : false
         * pageCount : 76
         * size : 20
         * total : 1515
         */

        public int curPage;
        public int offset;
        public boolean over;
        public int pageCount;
        public int size;
        public int total;
        public List<DatasBean> datas;

        public static class DatasBean {
            /**
             * apkLink :
             * author : lizixian18
             * chapterId : 385
             * chapterName : 架构
             * collect : false
             * courseId : 13
             * desc : 一个简单强大且灵活的MVP框架
             * envelopePic : http://www.wanandroid.com/resources/image/pc/default_project_img.jpg
             * fresh : false
             * id : 3196
             * link : http://www.wanandroid.com/blog/show/2253
             * niceDate : 2018-07-29
             * origin :
             * projectLink : https://github.com/lizixian18/EasyMvp
             * publishTime : 1532870374000
             * superChapterId : 294
             * superChapterName : 开源项目主Tab
             * tags : [{"name":"项目","url":"/project/list/1?cid=385"}]
             * title : EasyMvp 一个简单强大且灵活的MVP框架
             * type : 0
             * userId : -1
             * visible : 1
             * zan : 0
             */

            public String apkLink;
            public String author;
            public int chapterId;
            public String chapterName;
            public boolean collect;
            public int courseId;
            public String desc;
            public String envelopePic;
            public boolean fresh;
            public int id;
            public String link;
            public String niceDate;
            public String origin;
            public String projectLink;
            public long publishTime;
            public int superChapterId;
            public String superChapterName;
            public String title;
            public int type;
            public int userId;
            public int visible;
            public int zan;
            public List<TagsBean> tags;

            public static class TagsBean {
                /**
                 * name : 项目
                 * url : /project/list/1?cid=385
                 */

                public String name;
                public String url;
            }
        }
    }
}
