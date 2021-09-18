package demo.components.header

import react.PropsWithChildren

external interface HeaderProps : PropsWithChildren {
    val classes: dynamic
}

val HeaderProps.rootStyle: String
    get() = classes["root"] as String

val HeaderProps.appBar: String
    get() = classes["appBar"] as String
val HeaderProps.appBarHome: String
    get() = classes["appBarHome"] as String
val HeaderProps.appBarShift: String
    get() = classes["appBarShift"] as String
val HeaderProps.drawer: String
    get() = classes["drawer"] as String
val HeaderProps.growStyle: String
    get() = classes["grow"] as String
val HeaderProps.titleStyle: String
    get() = classes["title"] as String
val HeaderProps.navIconHide: String
    get() = classes["navIconHide"] as String
