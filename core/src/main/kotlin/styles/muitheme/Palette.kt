@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package styles.muitheme

import kotlinext.js.jsObject
import kotlinx.css.Color

data class CommonColorSets internal constructor(
    internal val jsObject: dynamic
) {
    var black: Color
        get() = Color(asDynamic()["black"] as String)
        set(value) { asDynamic()["black"] = value.toString() }
    var white: Color
        get() = Color(asDynamic()["white"] as String)
        set(value) { asDynamic()["white"] = value.toString() }
}

data class ColorSets internal constructor(
    internal val jsObject: dynamic
) {
    var light: Color
        get() = Color(asDynamic()["light"] as String)
        set(value) { asDynamic()["light"] = value.toString() }
    var main: Color
        get() = Color(asDynamic()["main"] as String)
        set(value) { asDynamic()["main"] = value.toString() }
    var dark: Color
        get() = Color(asDynamic()["dark"] as String)
        set(value) { asDynamic()["dark"] = value.toString() }
    var contrastText: Color
        get() = Color(asDynamic()["contrastText"] as String)
        set(value) { asDynamic()["contrastText"] = value.toString() }
}

fun colorSets(
    light: Color, main: Color, dark: Color, contrastText: Color
) = ColorSets(jsObject {}).also {
    it.light = light
    it.main = main
    it.dark = dark
    it.contrastText = contrastText
}

data class TextColorSets internal constructor(
    internal val jsObject: dynamic
) {
    var primary: Color
        get() = Color(asDynamic()["primary"] as String)
        set(value) { asDynamic()["primary"] = value.toString() }
    var secondary: Color
        get() = Color(asDynamic()["secondary"] as String)
        set(value) { asDynamic()["secondary"] = value.toString() }
    var disabled: Color
        get() = Color(asDynamic()["disabled"] as String)
        set(value) { asDynamic()["disabled"] = value.toString() }
    var hint: Color
        get() = Color(asDynamic()["hint"] as String)
        set(value) { asDynamic()["hint"] = value.toString() }
}

data class BackgroundColorSets internal constructor(
    internal val jsObject: dynamic
) {
    var paper: Color
        get() = Color(asDynamic()["paper"] as String)
        set(value) { asDynamic()["paper"] = value.toString() }
    var default: Color
        get() = Color(asDynamic()["default"] as String)
        set(value) { asDynamic()["default"] = value.toString() }
}

data class ActionColorSets internal constructor(
    internal val jsObject: dynamic
) {
   var active: Color
        get() = Color(asDynamic()["active"] as String)
        set(value) { asDynamic()["active"] = value.toString() }
   var hover: Color
        get() = Color(asDynamic()["hover"] as String)
        set(value) { asDynamic()["hover"] = value.toString() }
   var hoverOpacity: Color
        get() = Color(asDynamic()["hoverOpacity"] as String)
        set(value) { asDynamic()["hoverOpacity"] = value.toString() }
   var selected: Color
        get() = Color(asDynamic()["selected"] as String)
        set(value) { asDynamic()["selected"] = value.toString() }
   var disabled: Color
        get() = Color(asDynamic()["disabled"] as String)
        set(value) { asDynamic()["disabled"] = value.toString() }
   var disabledBackground: Color
        get() = Color(asDynamic()["disabledBackground"] as String)
        set(value) { asDynamic()["disabledBackground"] = value.toString() }
}

data class GreySets internal constructor(
    internal val jsObject: dynamic
) {
    var _50: Color
        get() = Color(jsObject["50"] as String)
        set(value) { jsObject["50"] = value.toString() }
    var _100: Color
        get() = Color(jsObject["_100"] as String)
        set(value) { jsObject["_100"] = value.toString() }
    var _200: Color
        get() = Color(jsObject["_200"] as String)
        set(value) { jsObject["_200"] = value.toString() }
    var _300: Color
        get() = Color(jsObject["_300"] as String)
        set(value) { jsObject["_300"] = value.toString() }
    var _400: Color
        get() = Color(jsObject["_400"] as String)
        set(value) { jsObject["_400"] = value.toString() }
    var _500: Color
        get() = Color(jsObject["_500"] as String)
        set(value) { jsObject["_500"] = value.toString() }
    var _600: Color
        get() = Color(jsObject["_600"] as String)
        set(value) { jsObject["_600"] = value.toString() }
    var _700: Color
        get() = Color(jsObject["_700"] as String)
        set(value) { jsObject["_700"] = value.toString() }
    var _800: Color
        get() = Color(jsObject["_800"] as String)
        set(value) { jsObject["_800"] = value.toString() }
    var _900: Color
        get() = Color(jsObject["_900"] as String)
        set(value) { jsObject["_900"] = value.toString() }
    var A100: Color
        get() = Color(jsObject["A100"] as String)
        set(value) { jsObject["A100"] = value.toString() }
    var A200: Color
        get() = Color(jsObject["A200"] as String)
        set(value) { jsObject["A200"] = value.toString() }
    var A400: Color
        get() = Color(jsObject["A400"] as String)
        set(value) { jsObject["A400"] = value.toString() }
    var A700: Color
        get() = Color(jsObject["A700"] as String)
        set(value) { jsObject["A700"] = value.toString() }
}

external interface Palette

fun Palette.common(handler: CommonColorSets.() -> Unit) {
    asDynamic()["common"] = common.apply(handler).jsObject
}

val Palette.common: CommonColorSets
    get() = CommonColorSets(asDynamic()["common"])

var Palette.type: String
    get() = asDynamic()["type"] as String
    set(value) { asDynamic()["type"] = value }

fun Palette.primary(handler: ColorSets.() -> Unit) {
    asDynamic()["primary"] = primary.apply(handler).jsObject
}

val Palette.primary: ColorSets
    get() = ColorSets(asDynamic()["primary"])

fun Palette.secondary(handler: ColorSets.() -> Unit) {
    asDynamic()["secondary"] = secondary.apply(handler).jsObject
}

val Palette.secondary: ColorSets
    get() = ColorSets(asDynamic()["secondary"])

fun Palette.error(handler: ColorSets.() -> Unit) {
    asDynamic()["error"] = error.apply(handler).jsObject
}

val Palette.error: ColorSets
    get() = ColorSets(asDynamic()["error"])

fun Palette.grey(handler: GreySets.() -> Unit) {
    asDynamic()["grey"] = grey.apply(handler).jsObject
}

val Palette.grey: GreySets
    get() = GreySets(asDynamic()["grey"])

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

fun Palette.text(handler: TextColorSets.() -> Unit) {
    asDynamic()["text"] = text.apply(handler).jsObject
}

val Palette.text: TextColorSets
    get() = TextColorSets(asDynamic()["text"])

var Palette.divider: Color
    get() = Color(asDynamic()["divider"] as String)
    set(value) { asDynamic()["divider"] = value.toString() }

fun Palette.background(handler: BackgroundColorSets.() -> Unit) {
    asDynamic()["background"] = background.apply(handler).jsObject
}

val Palette.background: BackgroundColorSets
    get() = BackgroundColorSets(asDynamic()["background"])

fun Palette.action(handler: ActionColorSets.() -> Unit) {
    asDynamic()["action"] = action.apply(handler).jsObject
}

val Palette.action: ActionColorSets
    get() = ActionColorSets(asDynamic()["action"])


