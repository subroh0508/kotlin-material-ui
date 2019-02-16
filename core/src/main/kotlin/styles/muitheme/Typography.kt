@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package styles.muitheme

import kotlinx.css.Color
import kotlinx.css.LinearDimension
import styles.muitheme.typographys.TypographyAttributes

external interface TypographyAttributeSets

var TypographyAttributeSets.fontSize: LinearDimension
    get() = LinearDimension(asDynamic()["fontSize"] as String)
    set(value) { asDynamic()["fontSize"] = value.toString() }

var TypographyAttributeSets.fontWeight: Int
    get() = asDynamic()["fontWeight"] as Int
    set(value) { asDynamic()["fontWeight"] = value }

var TypographyAttributeSets.fontFamily: String
    get() = asDynamic()["fontFamily"] as String
    set(value) { asDynamic()["fontFamily"] = value }

var TypographyAttributeSets.letterSpacing: LinearDimension
    get() = LinearDimension(asDynamic()["letterSpacing"] as String)
    set(value) { asDynamic()["letterSpacing"] = value.toString() }

var TypographyAttributeSets.lineHeight: Float
    get() = asDynamic()["lineHeight"] as Float
    set(value) { asDynamic()["lineHeight"] = value }

var TypographyAttributeSets.marginLeft: LinearDimension
    get() = LinearDimension(asDynamic()["marginLeft"] as String)
    set(value) { asDynamic()["marginLeft"] = value.toString() }

var TypographyAttributeSets.color: Color
    get() = Color(asDynamic()["color"] as String)
    set(value) { asDynamic()["color"] = value.toString() }

var TypographyAttributeSets.textTransform: String
    get() = asDynamic()["textTransform"] as String
    set(value) { asDynamic()["textTransform"] = value }

external interface Typography

var Typography.pxToRem: (Number) -> LinearDimension
    get() = { size: Number -> LinearDimension(asDynamic()["pxToRem"](size) as String) }
    set(value) { asDynamic()["pxToRem"] = { size: Number -> value(size).toString() } }

var Typography.round: (Number) -> Number
    get() = asDynamic()["round"] as (Number) -> Number
    set(value) { asDynamic()["round"] = value }

var Typography.fontFamily: String
    get() = asDynamic()["fontFamily"] as String
    set(value) { asDynamic()["fontFamily"] = value }

var Typography.fontSize: Int
    get() = asDynamic()["fontSize"] as Int
    set(value) { asDynamic()["fontSize"] = value }

var Typography.fontWeightLight: Int
    get() = asDynamic()["fontWeightLight"] as Int
    set(value) { asDynamic()["fontWeightLight"] = value }

var Typography.fontWeightRegular: Int
    get() = asDynamic()["fontWeightRegular"] as Int
    set(value) { asDynamic()["fontWeightRegular"] = value }

var Typography.fontWeightMedium: Int
    get() = asDynamic()["fontWeightMedium"] as Int
    set(value) { asDynamic()["fontWeightMedium"] = value }

var Typography.useNextVariants: Boolean
    get() = asDynamic()["useNextVariants"] as Boolean
    set(value) { asDynamic()["useNextVariants"] = value }

inline operator fun Typography.get(key: TypographyAttributes): TypographyAttributeSets
    = asDynamic()[key.toString()] as TypographyAttributeSets
inline operator fun Typography.set(key: TypographyAttributes, handler: TypographyAttributeSets.() -> Unit) {
    asDynamic()[key.toString()] = get(key).apply(handler)
}