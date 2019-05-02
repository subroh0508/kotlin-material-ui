@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package materialui.styles.muitheme

import kotlinx.css.Direction
import kotlinx.css.properties.BoxShadows
import materialui.styles.ReadOnlyDirectionDelegate
import materialui.styles.breakpoint.Breakpoints
import materialui.styles.mixins.Mixins
import materialui.styles.palette.Palette
import materialui.styles.shadow.ReadOnlyShadowsDelegate
import materialui.styles.shape.Shape
import materialui.styles.spacing.Spacing
import materialui.styles.transitions.Transitions
import materialui.styles.typography.Typography
import materialui.styles.zindex.ZIndex

external interface MuiTheme {
    val breakpoints: Breakpoints
    val mixins: Mixins
    val palette: Palette
    val typography: Typography
    val shape: Shape
    val spacing: Spacing
    val transitions: Transitions
    val zIndex: ZIndex
}

val MuiTheme.direction: Direction by ReadOnlyDirectionDelegate
val MuiTheme.shadows: List<BoxShadows> by ReadOnlyShadowsDelegate
