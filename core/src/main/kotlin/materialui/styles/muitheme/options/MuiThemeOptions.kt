package materialui.styles.muitheme.options

import kotlinext.js.jsObject
import kotlinx.css.Direction
import kotlinx.css.properties.BoxShadows
import materialui.styles.DirectionDelegate
import materialui.styles.breakpoint.options.BreakpointsOptions
import materialui.styles.mixins.options.MixinsOptions
import materialui.styles.palette.options.PaletteOptions
import materialui.styles.shadow.ShadowsDelegate
import materialui.styles.shape.options.ShapeOptions
import materialui.styles.spacing.Spacing
import materialui.styles.transitions.options.TransitionsOptions
import materialui.styles.typography.options.TypographyOptions
import materialui.styles.zindex.options.ZIndexOptions

external interface MuiThemeOptions {
    var breakpoints: BreakpointsOptions?
    var mixins: MixinsOptions?
    var palette: PaletteOptions?
    var typography: TypographyOptions?
    var shape: ShapeOptions?
    var spacing: Spacing?
    var transitions: TransitionsOptions?
    var zIndex: ZIndexOptions?
}

var MuiThemeOptions.direction: Direction? by DirectionDelegate
var MuiThemeOptions.shadows: List<BoxShadows>? by ShadowsDelegate

fun MuiThemeOptions.shadows(vararg boxShadows: Pair<Int, BoxShadows>) {
    val boxShadowMap = boxShadows.toMap()

    shadows = (shadows ?: Array(25) { BoxShadows.none }.toList()).mapIndexed { index, boxShadow ->
        boxShadowMap[index] ?: boxShadow
    }
}

fun MuiThemeOptions.breakpoints(block: BreakpointsOptions.() -> Unit) { breakpoints = (breakpoints ?: jsObject { }).apply(block) }
fun MuiThemeOptions.mixins(block: MixinsOptions.() -> Unit) { mixins = (mixins ?: jsObject { }).apply(block) }
fun MuiThemeOptions.palette(block: PaletteOptions.() -> Unit) { palette = (palette ?: jsObject { }).apply(block) }
fun MuiThemeOptions.typography(block: TypographyOptions.() -> Unit) { typography = (typography ?: jsObject { }).apply(block) }
fun MuiThemeOptions.shape(block: ShapeOptions.() -> Unit) { shape = (shape ?: jsObject { }).apply(block) }
fun MuiThemeOptions.transitions(block: TransitionsOptions.() -> Unit) { transitions = (transitions ?: jsObject { }).apply(block) }
fun MuiThemeOptions.zIndex(block: ZIndexOptions.() -> Unit) { zIndex = (zIndex ?: jsObject { }).apply(block) }
