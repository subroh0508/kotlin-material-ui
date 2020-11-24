package materialui.styles.stylesprovider

import kotlinext.js.Object
import materialui.StylesProvider
import materialui.ThemeProvider
import materialui.styles.muitheme.MuiTheme
import materialui.styles.themeprovider.ThemeProviderBuilder
import react.RBuilder
import react.RProps

typealias GenerateId = Object
typealias Jss = Object

external interface StylesProviderProps: RProps{
    var disableGeneration: Boolean?
    var generateClassName: GenerateId?
    var injectFirst: Boolean?
    var jss: Jss
    var sheetsCache: dynamic
    var sheetsManager: dynamic
    var sheetsRegistry: dynamic
}

fun RBuilder.styleProvider(block: StyleProviderBuilder.() -> Unit) =
    child(StyleProviderBuilder(StylesProvider).apply(block).create())