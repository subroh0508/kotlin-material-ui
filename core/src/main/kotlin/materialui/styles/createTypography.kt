@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package materialui.styles

import materialui.rawCreateTypography
import materialui.styles.palette.Palette
import materialui.styles.typography.Typography

fun createTypography(palette: Palette, typography: Typography) = rawCreateTypography(palette, typography)
fun createTypography(palette: Palette, typography: (Palette) -> Typography) = rawCreateTypography(palette, typography)
