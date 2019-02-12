package styles

import kotlinext.js.jsObject
import styles.muitheme.MuiTheme

@JsModule("@material-ui/core/styles/createMuiTheme")
private external val createMuiThemeModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val createDynamicMuiTheme: (dynamic) -> (dynamic) = createMuiThemeModule.default


val defaultMuiTheme: MuiTheme
    get() = MuiTheme(createDynamicMuiTheme(jsObject {}))

fun createMuiTheme(handler: MuiTheme.() -> Unit) = MuiTheme(createDynamicMuiTheme(defaultMuiTheme.apply(handler)))