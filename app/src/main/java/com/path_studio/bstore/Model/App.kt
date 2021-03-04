package com.path_studio.bstore.Model

data class App(
    var appName: String = "",
    var appSize: Double = 0.0, //size is in MB
    var appLogo: String = "",
    var devName: String = "",
    var appCategory: String = "",
    var detail: String = "",
    var ratting:Double = 0.0, //Max is 5.0
)