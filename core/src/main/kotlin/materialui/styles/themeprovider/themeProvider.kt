package materialui.styles.themeprovider

import materialui.ThemeProvider
import materialui.styles.muitheme.MuiTheme
import react.RBuilder

fun RBuilder.themeProvider(theme: MuiTheme, block: ThemeProviderBuilder.() -> Unit) =
    child(ThemeProviderBuilder(ThemeProvider, theme).apply(block).create())
