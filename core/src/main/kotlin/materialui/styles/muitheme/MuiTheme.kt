@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package materialui.styles.muitheme

import kotlinx.css.Direction
import kotlinx.css.LinearDimension
import kotlinx.css.properties.BoxShadows
import kotlinx.css.px
import materialui.styles.ReadOnlyDirectionDelegate
import materialui.styles.breakpoint.Breakpoints
import materialui.styles.mixins.Mixins
import materialui.styles.palette.Palette
import materialui.styles.shadow.ReadOnlyShadowsDelegate
import materialui.styles.shape.Shape
import materialui.styles.transitions.Transitions
import materialui.styles.typography.Typography
import materialui.styles.zindex.ZIndex

external interface MuiTheme {
    val breakpoints: Breakpoints
    val mixins: Mixins
    val palette: Palette
    val typography: Typography
    val shape: Shape
    val transitions: Transitions
    val spacing: dynamic
    val zIndex: ZIndex
}

val MuiTheme.direction: Direction by ReadOnlyDirectionDelegate
val MuiTheme.shadows: List<BoxShadows> by ReadOnlyShadowsDelegate

fun MuiTheme.spacing() =
    LinearDimension((spacing as () -> String)())

fun MuiTheme.spacing(unit: Number) =
    LinearDimension((spacing as (Number) -> String)(unit))

fun MuiTheme.spacing(all: LinearDimension) = spacing(all, all, all, all)

fun MuiTheme.spacing(
    vertical: LinearDimension,
    horizontal: LinearDimension
) = spacing(vertical, horizontal, vertical, horizontal)

fun MuiTheme.spacing(
    top: LinearDimension,
    rightLeft: LinearDimension,
    bottom: LinearDimension
) = spacing(top, rightLeft, bottom, rightLeft)


fun MuiTheme.spacing(top: LinearDimension, right: LinearDimension, bottom: LinearDimension, left: LinearDimension) =
    (spacing as (dynamic, dynamic, dynamic, dynamic) -> String)(
        top.toDynamic(),
        right.toDynamic(),
        bottom.toDynamic(),
        left.toDynamic()
    )

internal const val MUI_UNIT = "mui-unit"

private fun LinearDimension.toDynamic(): dynamic {
    return when {
        value.endsWith(MUI_UNIT) ->
            value.removeSuffix(MUI_UNIT).toFloat()
        else -> value
    }
}

