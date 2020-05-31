@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package materialui.styles

import kotlinext.js.jsObject
import materialui.rawCreatePalette
import materialui.styles.palette.options.PaletteOptions

fun createPalette(handler: PaletteOptions.() -> Unit) = rawCreatePalette(jsObject(handler))

fun defaultPalette() = createPalette {  }
