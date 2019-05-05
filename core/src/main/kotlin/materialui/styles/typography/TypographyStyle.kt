package materialui.styles.typography

import kotlinx.css.*
import kotlinx.css.properties.lh
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

fun CSSBuilder.typography(style: TypographyStyle) {
    fontFamily = style.fontFamily
    fontSize = style.fontSize
    fontWeight = style.fontWeight
    color = style.color
    style.letterSpacing?.let { letterSpacing = it }
    style.lineHeight?.let { lineHeight = it.lh }
    style.textTransform?.let { textTransform = it }
}
