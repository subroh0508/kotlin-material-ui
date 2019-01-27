package test

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.code
import react.dom.div
import react.dom.h2
import react.dom.p
import test.components.ButtonsDemo

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div {
            h2 {
                +"Welcome to React with Kotlin"
            }
        }
        p {
            +"To get started, edit "
            code { +"app/App.kt" }
            +" and save to reload."
        }

        div {
            child(ButtonsDemo::class) { }
        }
    }
}