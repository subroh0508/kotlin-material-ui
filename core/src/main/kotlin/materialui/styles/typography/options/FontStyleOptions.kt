package materialui.styles.typography.options

import kotlinx.css.FontWeight
import kotlinx.css.LinearDimension
import materialui.styles.FontWeightDelegate
import materialui.styles.LinearDimensionDelegate

external interface FontStyleOptions {
    var htmlFontSize: Number?
    var fontFamily: String?
}

var FontStyleOptions.fontSize: LinearDimension? by LinearDimensionDelegate
var FontStyleOptions.fontWeightLight: FontWeight? by FontWeightDelegate
var FontStyleOptions.fontWeightRegular: FontWeight? by FontWeightDelegate
var FontStyleOptions.fontWeightMedium: FontWeight? by FontWeightDelegate

