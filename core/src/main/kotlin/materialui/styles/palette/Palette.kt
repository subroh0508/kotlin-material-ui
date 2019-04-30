@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package materialui.styles.palette

import kotlinx.css.Color
import materialui.styles.ReadOnlyColorDelegate

external interface Palette {
    val common: CommonColors
    val constraintThreshold: Number
    val tonalOffset: Number
    val primary: PaletteColor
    val secondary: PaletteColor
    val error: PaletteColor
    val grey: GreyColors
    val text: TypeText
    val action: TypeAction
    val background: TypeBackground
    val augmentColor: (GreyColors, Number, Number, Number) -> PaletteColor
}

val Palette.type: PaletteType
    get() = PaletteType.valueOf(asDynamic()["type"] as String)

val Palette.divider: Color by ReadOnlyColorDelegate

val Palette.getContrastText: (Color) -> Color
    get() = { color ->
        Color((asDynamic()["getContrastText"] as GetContrastText).invoke(color.toString()))
    }

typealias GetContrastText = (String) -> String
