@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package materialui.styles

import kotlinext.js.jsObject
import materialui.styles.muitheme.MuiTheme
import materialui.styles.muitheme.options.MuiThemeOptions

@JsModule("@material-ui/core/styles/createMuiTheme")
private external val createMuiThemeModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val createMuiTheme: (MuiThemeOptions) -> (MuiTheme) = createMuiThemeModule.default


val defaultMuiTheme: MuiTheme
    get() = createMuiTheme(jsObject { })

fun createMuiTheme(handler: MuiThemeOptions.() -> Unit): MuiTheme
    = createMuiTheme(jsObject<MuiThemeOptions> { }.apply(handler))
