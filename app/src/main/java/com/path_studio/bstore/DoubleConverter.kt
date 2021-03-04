package com.path_studio.bstore

object DoubleConverter {
    private var appSizeResult: String = ""

    fun convertSizeToText(tempSize: Double):String{
        if(tempSize>=1000)
            appSizeResult = "${tempSize.toString()} GB"
        else
            appSizeResult = "${tempSize.toString()} MB"
        return appSizeResult
    }
}