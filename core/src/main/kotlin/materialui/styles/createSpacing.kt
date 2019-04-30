@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package materialui.styles

import kotlinx.css.LinearDimension
import materialui.styles.spacing.Spacing

@JsModule("@material-ui/core/styles/createSpacing")
private external val createSpacingModule: dynamic

fun createSpacing(spacingInput: Number): Spacing
        = createSpacingModule.default(spacingInput) as Spacing

fun createSpacing(func: (Number) -> Number): Spacing
        = createSpacingModule.default(func) as Spacing

fun createSpacing(func: (Number, Number) -> String): Spacing
        = createSpacingModule.default(func) as Spacing

fun createSpacing(func: (Number, Number, Number) -> String): Spacing
        = createSpacingModule.default(func) as Spacing

fun createSpacing(func: (Number, Number, Number, Number) -> String): Spacing
        = createSpacingModule.default(func) as Spacing

fun createSpacing(func: (LinearDimension) -> Number): Spacing
        = createSpacingModule.default { factor: String -> func(LinearDimension(factor)) } as Spacing

fun createSpacing(func: (LinearDimension, LinearDimension) -> String): Spacing
        = createSpacingModule.default { factor1: String, factor2: String -> func(LinearDimension(factor1), LinearDimension(factor2)) } as Spacing

fun createSpacing(func: (LinearDimension, LinearDimension, LinearDimension) -> String): Spacing
        = createSpacingModule.default { factor1: String, factor2: String, factor3: String -> func(LinearDimension(factor1), LinearDimension(factor2), LinearDimension(factor3)) } as Spacing

fun createSpacing(func: (LinearDimension, LinearDimension, LinearDimension, LinearDimension) -> String): Spacing
        = createSpacingModule.default { factor1: String, factor2: String, factor3: String, factor4: String -> func(LinearDimension(factor1), LinearDimension(factor2), LinearDimension(factor3), LinearDimension(factor4)) } as Spacing

fun defaultSpacing(): Spacing = createSpacingModule.default() as Spacing
