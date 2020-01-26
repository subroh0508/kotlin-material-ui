package materialui.styles.muithemeprovider

import materialui.styles.muitheme.MuiTheme
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/styles")
private external val stylesModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val themeProviderComponent: RComponent<RProps, RState> = stylesModule.ThemeProvider

fun RBuilder.muiThemeProvider(theme: MuiTheme, block: MuiThemeProviderBuilder.() -> Unit)
    = child(MuiThemeProviderBuilder(themeProviderComponent, theme).apply(block).create())
