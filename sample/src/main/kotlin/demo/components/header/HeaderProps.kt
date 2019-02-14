package demo.components.header

import react.RProps

interface HeaderProps : RProps {
    val classes: dynamic

    val rootStyle: String
        get() = classes["root"] as String
}