@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package materialui.styles

import kotlinext.js.js
import materialui.styles.palette.Palette
import materialui.styles.palette.options.PaletteOptions

@JsModule("@material-ui/core/styles/createPalette")
private external val createPaletteModule: dynamic

fun createPalette(options: PaletteOptions): Palette = createPaletteModule.default(options) as Palette

fun defaultPalette(): Palette = createPaletteModule.default(js { }) as Palette
