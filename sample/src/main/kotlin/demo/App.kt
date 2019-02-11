package demo

import demo.components.AppbarsDemo
import demo.components.ButtonsDemo
import demo.components.InputAdornmentsDemo
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.code
import react.dom.div
import react.dom.h2
import react.dom.p

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
            AppbarsDemo.render(this)
        }
        div {
            ButtonsDemo.render(this)
        }
        div {
            InputAdornmentsDemo.render(this)
        }
    }
}