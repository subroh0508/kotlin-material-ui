package materialui.styles.typography

import kotlinx.css.Color
import kotlinx.css.FontWeight
import kotlinx.css.LinearDimension
import kotlinx.css.TextTransform
import materialui.styles.*

external interface TypographyStyle {
    val fontFamily: String
}

val TypographyStyle.fontSize: LinearDimension by ReadOnlyLinearDimensionDelegate
val TypographyStyle.fontWeight: FontWeight by ReadOnlyFontWeightDelegate
val TypographyStyle.color: Color by ReadOnlyColorDelegate
val TypographyStyle.letterSpacing: LinearDimension? by LinearDimensionDelegate
val TypographyStyle.lineHeight: LinearDimension? by LinearDimensionDelegate
val TypographyStyle.textTransform: TextTransform? by TextTransformDelegate
