package materialui.styles.palette.options

import kotlinext.js.jsObject
import kotlinx.css.Color
import materialui.styles.ColorDelegate
import materialui.styles.palette.GetContrastText
import materialui.styles.palette.PaletteType

external interface PaletteOptions {
    var common: CommonColorsOptions?
    var constraintThreshold: Number?
    var tonalOffset: Number?
    var primary: PaletteColorOptions?
    var secondary: PaletteColorOptions?
    var error: PaletteColorOptions?
    var grey: GreyColorsOptions?
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

fun PaletteOptions.common(block: CommonColorsOptions.() -> Unit) { common = (common ?: jsObject { }).apply(block) }
fun PaletteOptions.primary(block: PaletteColorOptions.() -> Unit) { primary = (primary ?: jsObject { }).apply(block) }
fun PaletteOptions.secondary(block: PaletteColorOptions.() -> Unit) { secondary = (secondary ?: jsObject { }).apply(block) }
fun PaletteOptions.error(block: PaletteColorOptions.() -> Unit) { error = (error ?: jsObject { }).apply(block) }
fun PaletteOptions.grey(block: GreyColorsOptions.() -> Unit) { grey = (grey ?: jsObject { }).apply(block) }
fun PaletteOptions.text(block: TypeTextOptions.() -> Unit) { text = (text ?: jsObject { }).apply(block) }
fun PaletteOptions.action(block: TypeActionOptions.() -> Unit) { action = (action ?: jsObject { }).apply(block) }
fun PaletteOptions.background(block: TypeBackgroundOptions.() -> Unit) { background = (background ?: jsObject { }).apply(block) }
