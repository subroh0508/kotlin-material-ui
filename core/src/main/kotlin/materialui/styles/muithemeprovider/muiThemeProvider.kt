package materialui.styles.muithemeprovider

import materialui.styles.muitheme.MuiTheme
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/styles/MuiThemeProvider")
private external val muiThemeProviderModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val muiThemeProviderComponent: RComponent<RProps, RState> = muiThemeProviderModule.default

fun RBuilder.muiThemeProvider(theme: MuiTheme, block: MuiThemeProviderBuilder.() -> Unit)
    = child(MuiThemeProviderBuilder(muiThemeProviderComponent, theme).apply(block).create())
