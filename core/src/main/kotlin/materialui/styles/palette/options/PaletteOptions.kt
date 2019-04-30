package materialui.styles.palette.options

import kotlinx.css.Color
import materialui.styles.ColorDelegate
import materialui.styles.palette.GetContrastText
import materialui.styles.palette.GreyColors
import materialui.styles.palette.PaletteType

external interface PaletteOptions {
    var common: CommonColorsOptions?
    var constraintThreshold: Number?
    var tonalOffset: Number?
    var primary: PaletteColorOptions?
    var secondary: PaletteColorOptions?
    var error: PaletteColorOptions?
    var grey: GreyColors?
    var text: TypeTextOptions?
    var action: TypeActionOptions?
    var background: TypeBackgroundOptions?
    var augmentColor: ((String, Number, Number, Number) -> PaletteColorOptions)?
}

var PaletteOptions.type: PaletteType?
    get() = (asDynamic()["type"] as String?)?.let { PaletteType.valueOf(it) }
    set(value) { asDynamic()["type"] = value.toString() }

var PaletteOptions.divider: Color? by ColorDelegate

var PaletteOptions.getContrastText: ((Color) -> Color)?
    get() = { color: Color ->
        Color((asDynamic()["getContrastText"] as GetContrastText).invoke(color.toString()))
    }
    set(value) {
        asDynamic()["getContrastText"] = { color: String ->
            value?.invoke(Color(color))?.toString()
        }
    }
