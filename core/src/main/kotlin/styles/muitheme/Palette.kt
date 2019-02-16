@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package styles.muitheme

import kotlinx.css.Color
import styles.muitheme.palettes.*

external interface CommonColorSets

inline operator fun CommonColorSets.get(key: PaletteCommon): Color = Color(asDynamic()[key.toString()] as String)
inline operator fun CommonColorSets.set(key: PaletteCommon, value: Color) {
    asDynamic()[key.toString()] = value.toString()
}

external interface ColorSets

inline operator fun ColorSets.get(key: PaletteColor): Color = Color(asDynamic()[key.toString()] as String)
inline operator fun ColorSets.set(key: PaletteColor, value: Color) {
    asDynamic()[key.toString()] = value.toString()
}

external interface TextColorSets

inline operator fun TextColorSets.get(key: PaletteText): Color = Color(asDynamic()[key.toString()] as String)
inline operator fun TextColorSets.set(key: PaletteText, value: Color) {
    asDynamic()[key.toString()] = value.toString()
}

external interface BackgroundColorSets

inline operator fun BackgroundColorSets.get(key: PaletteBackground): Color = Color(asDynamic()[key.toString()] as String)
inline operator fun BackgroundColorSets.set(key: PaletteBackground, value: Color) {
    asDynamic()[key.toString()] = value.toString()
}

external interface ActionColorSets

inline operator fun ActionColorSets.get(key: PaletteAction): Color = Color(asDynamic()[key.toString()] as String)
inline operator fun ActionColorSets.set(key: PaletteAction, value: Color) {
    asDynamic()[key.toString()] = value.toString()
}

external interface GreySets

inline operator fun GreySets.get(key: PaletteGrey): Color = Color(asDynamic()[key.toString()] as String)
inline operator fun GreySets.set(key: PaletteGrey, value: Color) {
    asDynamic()[key.toString()] = value.toString()
}

external interface Palette

inline fun Palette.common(handler: CommonColorSets.() -> Unit) {
    asDynamic()["common"] = common.apply(handler)
}

val Palette.common: CommonColorSets
    get() = asDynamic()["common"] as CommonColorSets

var Palette.type: String
    get() = asDynamic()["type"] as String
    set(value) { asDynamic()["type"] = value }

inline fun Palette.primary(handler: ColorSets.() -> Unit) {
    asDynamic()["primary"] = primary.apply(handler)
}

val Palette.primary: ColorSets
    get() = asDynamic()["primary"] as ColorSets

inline fun Palette.secondary(handler: ColorSets.() -> Unit) {
    asDynamic()["secondary"] = secondary.apply(handler)
}

val Palette.secondary: ColorSets
    get() = asDynamic()["secondary"] as ColorSets

inline fun Palette.error(handler: ColorSets.() -> Unit) {
    asDynamic()["error"] = error.apply(handler)
}

val Palette.error: ColorSets
    get() = asDynamic()["error"] as ColorSets

inline fun Palette.grey(handler: ColorSets.() -> Unit) {
    asDynamic()["grey"] = grey.apply(handler)
}

val Palette.grey: ColorSets
    get() = asDynamic()["grey"] as ColorSets

var Palette.contrastThreshold: Int
    get() = asDynamic()["contrastThreshold"] as Int
    set(value) { asDynamic()["contrastThreshold"] = value }

var Palette.getContrastText: (Color) -> Color
    get() = { color -> Color(asDynamic()["getContrastText"](color.toString()) as String) }
    set(value) { asDynamic()["getContrastText"] = { colorStr: String -> value(Color(colorStr)).toString() }  }

var Palette.augmentColor: (Color, Int, Int, Int) -> ColorSets
    get() = { color, mainShade, lightShade, darkShade ->
        asDynamic()["augmentColor"](color.toString(), mainShade, lightShade, darkShade) as ColorSets
    }
    set(value) {
        asDynamic()["augmentColor"] = { colorStr: String, mainShade: Int, lightShade: Int, darkShade: Int ->
            value(Color(colorStr), mainShade, lightShade, darkShade)
        }
    }

var Palette.tonalOffset: Float
    get() = asDynamic()["tonalOffset"] as Float
    set(value) { asDynamic()["tonalOffset"] = value }

inline fun Palette.text(handler: TextColorSets.() -> Unit) {
    asDynamic()["text"] = text.apply(handler)
}

val Palette.text: TextColorSets
    get() = asDynamic()["text"] as TextColorSets

var Palette.divider: Color
    get() = Color(asDynamic()["divider"] as String)
    set(value) { asDynamic()["divider"] = value.toString() }

inline fun Palette.background(handler: BackgroundColorSets.() -> Unit) {
    asDynamic()["background"] = background.apply(handler)
}

val Palette.background: BackgroundColorSets
    get() = asDynamic()["background"] as BackgroundColorSets

inline fun Palette.action(handler: ActionColorSets.() -> Unit) {
    asDynamic()["action"] = action.apply(handler)
}

val Palette.action: ActionColorSets
    get() = asDynamic()["action"] as ActionColorSets


