package materialui.styles

import materialui.styles.muitheme.MuiTheme

@JsModule("@material-ui/core/styles/useTheme")
private external val useThemeModule: dynamic

@Suppress("UnsafeCastFromDynamic")
fun useTheme(): MuiTheme = useThemeModule.default()
