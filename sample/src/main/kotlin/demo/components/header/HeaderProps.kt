package demo.components.header

import react.RProps

interface HeaderProps : RProps {
    val classes: dynamic

    val rootStyle: String
        get() = classes["root"] as String

    val appBar: String
        get() = classes["appBar"] as String
    val appBarHome: String
        get() = classes["appBarHome"] as String
    val appBarShift: String
        get() = classes["appBarShift"] as String
    val drawer: String
        get() = classes["drawer"] as String
    val growStyle: String
        get() = classes["grow"] as String
    val titleStyle: String
        get() = classes["title"] as String
    val navIconHide: String
        get() = classes["navIconHide"] as String
}