package demo.components.appsearch

import react.RProps

interface AppSearchProps : RProps {
    val classes: dynamic

    val rootStyle: String
        get() = classes["rootStyle"] as String
    val searchStyle: String
        get() = classes["searchStyle"] as String
    val inputRootStyle: String
        get() = classes["inputRootStyle"] as String
    val inputInputStyle: String
        get() = classes["inputInputStyle"] as String
}