package materialui.styles.typography

import kotlinx.css.FontWeight
import kotlinx.css.LinearDimension
import materialui.styles.ReadOnlyFontWeightDelegate
import materialui.styles.ReadOnlyLinearDimensionDelegate

external interface FontStyle {
    val fontFamily: String
}

val FontStyle.fontSize: LinearDimension by ReadOnlyLinearDimensionDelegate
val FontStyle.fontWeightLight: FontWeight by ReadOnlyFontWeightDelegate
val FontStyle.fontWeightRegular: FontWeight by ReadOnlyFontWeightDelegate
val FontStyle.fontWeightMedium: FontWeight by ReadOnlyFontWeightDelegate
