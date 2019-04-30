package materialui.styles.typography.options

import kotlinx.css.Color
import kotlinx.css.FontWeight
import kotlinx.css.LinearDimension
import kotlinx.css.TextTransform
import materialui.styles.ColorDelegate
import materialui.styles.FontWeightDelegate
import materialui.styles.LinearDimensionDelegate
import materialui.styles.TextTransformDelegate

external interface TypographyStyleOptions {
    var fontFamily: String?
}

var TypographyStyleOptions.fontSize: LinearDimension? by LinearDimensionDelegate
var TypographyStyleOptions.fontWeight: FontWeight? by FontWeightDelegate
var TypographyStyleOptions.color: Color? by ColorDelegate
var TypographyStyleOptions.letterSpacing: LinearDimension? by LinearDimensionDelegate
var TypographyStyleOptions.lineHeight: LinearDimension? by LinearDimensionDelegate
var TypographyStyleOptions.textTransform: TextTransform? by TextTransformDelegate