@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package materialui.styles

import materialui.styles.palette.Palette
import materialui.styles.typography.Typography

@JsModule("@material-ui/core/styles/createTypography")
private external val createTypographyModule: dynamic

fun createTypography(palette: Palette, typography: Typography): Typography
        = createTypographyModule.default(palette, typography) as Typography

fun createTypograph(palette: Palette, typography: (Palette) -> Typography): Typography
        = createTypographyModule.default(palette, typography) as Typography
