@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package materialui.styles

import kotlinext.js.js
import kotlinext.js.jsObject
import materialui.rawCreatePalette
import materialui.styles.palette.Palette
import materialui.styles.palette.options.PaletteOptions

@JsModule("@material-ui/core/styles/createPalette")
private external val createPaletteModule: dynamic

fun createPalette(handler: PaletteOptions.() -> Unit) = rawCreatePalette(jsObject(handler))

fun defaultPalette() = createPalette {  }
