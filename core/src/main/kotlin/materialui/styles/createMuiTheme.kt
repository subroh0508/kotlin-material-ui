@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package materialui.styles

import kotlinext.js.jsObject
import materialui.rawCreateMuiTheme
import materialui.styles.muitheme.options.MuiThemeOptions

fun createMuiTheme(handler: MuiThemeOptions.() -> Unit) = rawCreateMuiTheme(jsObject<MuiThemeOptions> { }.apply(handler))

val defaultMuiTheme get() = createMuiTheme { }
