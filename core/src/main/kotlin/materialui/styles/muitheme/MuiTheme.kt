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
fun MuiTheme.spacing(unit: Int = 0) = (spacing as (Int) -> Int)(unit).px
fun MuiTheme.spacing(top: Int = 0, right: Int = 0, bottom: Int = 0, left: Int = 0) =
    (spacing as (Int, Int, Int, Int) -> String)(top, right, bottom, left)
