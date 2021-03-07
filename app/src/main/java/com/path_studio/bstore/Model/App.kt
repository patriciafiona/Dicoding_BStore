package com.path_studio.bstore.Model

data class App(
    var appID: Int = 0,
    var appName: String = "",
    var appSize: Double = 0.0, //size is in MB
    var appRate: Int = 3,
    var appLogo: String = "",
    var devName: String = "",
    var appCategory: String = "",
    var appDesc: String = "",
    var detail: String = "",
    var ratting:Double = 0.0, //Max is 5.0
    var appBgDetail: String = "",
    var detailBannerType: String = "",
    var arrayDetailBanner: Array<String> = emptyArray(),
)