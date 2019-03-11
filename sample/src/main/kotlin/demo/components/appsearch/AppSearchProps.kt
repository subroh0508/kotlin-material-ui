package demo.components.appsearch

import react.RProps

external interface AppSearchProps : RProps {
    val classes: dynamic
}

val AppSearchProps.rootStyle: String
    get() = classes["root"] as String
val AppSearchProps.searchStyle: String
    get() = classes["search"] as String
val AppSearchProps.inputRootStyle: String
    get() = classes["inputRoot"] as String
val AppSearchProps.inputInputStyle: String
    get() = classes["inputInput"] as String