package demo

import demo.components.AppbarsDemo
import demo.components.ButtonsDemo
import demo.components.InputAdornmentsDemo
import demo.components.header.Header
import kotlinx.css.Color
import materialui.styles.createMuiTheme
import materialui.styles.muitheme.MuiTheme
import materialui.styles.muitheme.options.palette
import materialui.styles.palette.options.main
import materialui.styles.palette.options.primary
import materialui.styles.themeprovider.themeProvider
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        themeProvider(theme) {
            header {
                Header.render(this)
            }
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
