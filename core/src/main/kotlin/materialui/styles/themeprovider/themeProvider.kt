package materialui.styles.themeprovider

import materialui.styles.muitheme.MuiTheme
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/styles")
private external val stylesModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val themeProviderComponent: RComponent<RProps, RState> = stylesModule.ThemeProvider

fun RBuilder.themeProvider(theme: MuiTheme, block: ThemeProviderBuilder.() -> Unit)
    = child(ThemeProviderBuilder(themeProviderComponent, theme).apply(block).create())
