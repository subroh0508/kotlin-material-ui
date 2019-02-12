@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package styles.muitheme

import kotlinx.css.Color
import styles.muitheme.palettes.Grey

external interface CommonColorSets

var CommonColorSets.black: Color
    get() = Color(asDynamic()["black"] as String)
    set(value) { asDynamic()["black"] = value.toString() }

var CommonColorSets.white: Color
    get() = Color(asDynamic()["white"] as String)
    set(value) { asDynamic()["white"] = value.toString() }

external interface ColorSets

var ColorSets.light: Color
    get() = Color(asDynamic()["light"] as String)
    set(value) { asDynamic()["light"] = value.toString() }

var ColorSets.main: Color
    get() = Color(asDynamic()["main"] as String)
    set(value) { asDynamic()["main"] = value.toString() }

var ColorSets.dark: Color
    get() = Color(asDynamic()["dark"] as String)
    set(value) { asDynamic()["dark"] = value.toString() }

var ColorSets.contrastText: Color
    get() = Color(asDynamic()["contrastText"] as String)
    set(value) { asDynamic()["contrastText"] = value.toString() }

external interface TextColorSets

var TextColorSets.primary: Color
    get() = Color(asDynamic()["primary"] as String)
    set(value) { asDynamic()["primary"] = value.toString() }

var TextColorSets.secondary: Color
    get() = Color(asDynamic()["secondary"] as String)
    set(value) { asDynamic()["secondary"] = value.toString() }

var TextColorSets.disabled: Color
    get() = Color(asDynamic()["disabled"] as String)
    set(value) { asDynamic()["disabled"] = value.toString() }

var TextColorSets.hint: Color
    get() = Color(asDynamic()["hint"] as String)
    set(value) { asDynamic()["hint"] = value.toString() }

external interface BackgroundColorSets

var BackgroundColorSets.paper: Color
    get() = Color(asDynamic()["paper"] as String)
    set(value) { asDynamic()["paper"] = value.toString() }

var BackgroundColorSets.default: Color
    get() = Color(asDynamic()["default"] as String)
    set(value) { asDynamic()["default"] = value.toString() }

external interface ActionColorSets

var ActionColorSets.active: Color
    get() = Color(asDynamic()["active"] as String)
    set(value) { asDynamic()["active"] = value.toString() }

var ActionColorSets.hover: Color
    get() = Color(asDynamic()["hover"] as String)
    set(value) { asDynamic()["hover"] = value.toString() }

var ActionColorSets.hoverOpacity: Float
    get() = asDynamic()["hoverOpacity"] as Float
    set(value) { asDynamic()["hoverOpacity"] = value }

var ActionColorSets.selected: Color
    get() = Color(asDynamic()["selected"] as String)
    set(value) { asDynamic()["selected"] = value.toString() }

var ActionColorSets.disabled: Color
    get() = Color(asDynamic()["disabled"] as String)
    set(value) { asDynamic()["disabled"] = value.toString() }

var ActionColorSets.disabledBackground: Color
    get() = Color(asDynamic()["disabledBackground"] as String)
    set(value) { asDynamic()["disabledBackground"] = value.toString() }

external interface GreySets

inline operator fun GreySets.get(key: Grey): Color = Color(asDynamic()[key.toString()] as String)
inline operator fun GreySets.set(key: Grey, value: Color) {
    asDynamic()[key.toString()] = value.toString()
}

external interface Palette

var Palette.common: CommonColorSets
    get() = asDynamic()["common"] as CommonColorSets
    set(value) { asDynamic()["common"] = value }

var Palette.type: String
    get() = asDynamic()["type"] as String
    set(value) { asDynamic()["type"] = value }

var Palette.primary: ColorSets
    get() = asDynamic()["primary"] as ColorSets
    set(value) { asDynamic()["primary"] = value }

var Palette.secondary: ColorSets
    get() = asDynamic()["secondary"] as ColorSets
    set(value) { asDynamic()["secondary"] = value }

var Palette.error: ColorSets
    get() = asDynamic()["error"] as ColorSets
    set(value) { asDynamic()["error"] = value }

var Palette.grey: GreySets
    get() = asDynamic()["grey"] as GreySets
    set(value) { asDynamic()["grey"] = value }

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

var Palette.text: TextColorSets
    get() = asDynamic()["text"] as TextColorSets
    set(value) { asDynamic()["text"] = value }

var Palette.divider: Color
    get() = Color(asDynamic()["divider"] as String)
    set(value) { asDynamic()["divider"] = value.toString() }

var Palette.background: BackgroundColorSets
    get() = asDynamic()["background"] as BackgroundColorSets
    set(value) { asDynamic()["background"] = value }

var Palette.action: ActionColorSets
    get() = asDynamic()["action"] as ActionColorSets
    set(value) { asDynamic()["action"] = value }


