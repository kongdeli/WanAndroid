# WanAndroid
学习
#### 2018-08-04

1. `menu.performIdentifierAction(menuId, flag) ` 用于触发menu的点击。
2. 一开始的 `toolbar.setTitle(resId)` 似乎没生效，是因为在 inflate 了 MainActivity 中的布局以后，调用了  `setSurpportActionbar()` 方法，该方法会将 toolbar 的标题重置为 applicationName（或者 activity 的 label?）。
3. 善用 `if return ` 来进行流程控制可以写出更优雅的代码，在 NavHelper 类中得以体现。
4. 如何处理 AndroidStudio 中关于泛型的 warning ？