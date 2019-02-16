package demo

import demo.components.AppbarsDemo
import demo.components.ButtonsDemo
import demo.components.InputAdornmentsDemo
import kotlinx.css.Color
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.code
import react.dom.div
import react.dom.h2
import react.dom.p
import styles.createMuiTheme
import styles.muitheme.MuiTheme
import styles.muitheme.primary
import styles.muithemeprovider.muiThemeProvider

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        muiThemeProvider(theme) {
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

    companion object {
        private val theme: MuiTheme = createMuiTheme {
            palette {
                primary {
                    main = Color("#2196f3")
                }
            }
        }
    }
}