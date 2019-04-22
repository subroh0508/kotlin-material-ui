@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package materialui.styles.muitheme

import kotlinx.css.Color
import kotlinx.css.FontWeight
import kotlinx.css.LinearDimension

external interface TypographyAttributeSets

var TypographyAttributeSets.fontSize: LinearDimension
    get() = LinearDimension(asDynamic()["fontSize"] as String)
    set(value) { asDynamic()["fontSize"] = value.toString() }

var TypographyAttributeSets.fontWeight: FontWeight
    get() = FontWeight(asDynamic()["fontWeight"].toString())
    set(value) { asDynamic()["fontWeight"] = value.toString() }

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

var Typography.fontWeightLight: FontWeight
    get() = FontWeight(asDynamic()["fontWeightLight"].toString())
    set(value) { asDynamic()["fontWeightLight"] = value.toString() }

var Typography.fontWeightRegular: FontWeight
    get() = FontWeight(asDynamic()["fontWeightRegular"].toString())
    set(value) { asDynamic()["fontWeightRegular"] = value.toString() }

var Typography.fontWeightMedium: FontWeight
    get() = FontWeight(asDynamic()["fontWeightMedium"].toString())
    set(value) { asDynamic()["fontWeightMedium"] = value.toString() }

var Typography.useNextVariants: Boolean
    get() = asDynamic()["useNextVariants"] as Boolean
    set(value) { asDynamic()["useNextVariants"] = value }

var Typography.display1: TypographyAttributeSets
    get() = asDynamic()["display1"] as TypographyAttributeSets
    set(value) { asDynamic()["display1"] = value }
var Typography.display2: TypographyAttributeSets
    get() = asDynamic()["display2"] as TypographyAttributeSets
    set(value) { asDynamic()["display2"] = value }
var Typography.display3: TypographyAttributeSets
    get() = asDynamic()["display3"] as TypographyAttributeSets
    set(value) { asDynamic()["display3"] = value }
var Typography.display4: TypographyAttributeSets
    get() = asDynamic()["display4"] as TypographyAttributeSets
    set(value) { asDynamic()["display4"] = value }
var Typography.headline: TypographyAttributeSets
    get() = asDynamic()["headline"] as TypographyAttributeSets
    set(value) { asDynamic()["headline"] = value }
var Typography.title: TypographyAttributeSets
    get() = asDynamic()["title"] as TypographyAttributeSets
    set(value) { asDynamic()["title"] = value }
var Typography.subheading: TypographyAttributeSets
    get() = asDynamic()["subheading"] as TypographyAttributeSets
    set(value) { asDynamic()["subheading"] = value }
var Typography.body1: TypographyAttributeSets
    get() = asDynamic()["body1"] as TypographyAttributeSets
    set(value) { asDynamic()["body1"] = value }
var Typography.body2: TypographyAttributeSets
    get() = asDynamic()["body2"] as TypographyAttributeSets
    set(value) { asDynamic()["body2"] = value }
var Typography.caption: TypographyAttributeSets
    get() = asDynamic()["caption"] as TypographyAttributeSets
    set(value) { asDynamic()["caption"] = value }
var Typography.button: TypographyAttributeSets
    get() = asDynamic()["button"] as TypographyAttributeSets
    set(value) { asDynamic()["button"] = value }
var Typography.h1: TypographyAttributeSets
    get() = asDynamic()["h1"] as TypographyAttributeSets
    set(value) { asDynamic()["h1"] = value }
var Typography.h2: TypographyAttributeSets
    get() = asDynamic()["h2"] as TypographyAttributeSets
    set(value) { asDynamic()["h2"] = value }
var Typography.h3: TypographyAttributeSets
    get() = asDynamic()["h3"] as TypographyAttributeSets
    set(value) { asDynamic()["h3"] = value }
var Typography.h4: TypographyAttributeSets
    get() = asDynamic()["h4"] as TypographyAttributeSets
    set(value) { asDynamic()["h4"] = value }
var Typography.h5: TypographyAttributeSets
    get() = asDynamic()["h5"] as TypographyAttributeSets
    set(value) { asDynamic()["h5"] = value }
var Typography.h6: TypographyAttributeSets
    get() = asDynamic()["h6"] as TypographyAttributeSets
    set(value) { asDynamic()["h6"] = value }
var Typography.subtitle1: TypographyAttributeSets
    get() = asDynamic()["subtitle1"] as TypographyAttributeSets
    set(value) { asDynamic()["subtitle1"] = value }
var Typography.subtitle2: TypographyAttributeSets
    get() = asDynamic()["subtitle2"] as TypographyAttributeSets
    set(value) { asDynamic()["subtitle2"] = value }
var Typography.body1Next: TypographyAttributeSets
    get() = asDynamic()["body1Next"] as TypographyAttributeSets
    set(value) { asDynamic()["body1Next"] = value }
var Typography.body2Next: TypographyAttributeSets
    get() = asDynamic()["body2Next"] as TypographyAttributeSets
    set(value) { asDynamic()["body2Next"] = value }
var Typography.buttonNext: TypographyAttributeSets
    get() = asDynamic()["buttonNext"] as TypographyAttributeSets
    set(value) { asDynamic()["buttonNext"] = value }
var Typography.captionNext: TypographyAttributeSets
    get() = asDynamic()["captionNext"] as TypographyAttributeSets
    set(value) { asDynamic()["captionNext"] = value }
var Typography.overline: TypographyAttributeSets
    get() = asDynamic()["overline"] as TypographyAttributeSets
    set(value) { asDynamic()["overline"] = value }
