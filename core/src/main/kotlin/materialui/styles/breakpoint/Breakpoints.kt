package materialui.styles.breakpoint

external interface Breakpoints {
    val keys: Array<String>
    val values: BreakpointValues
}

operator fun Breakpoints.get(key: Breakpoint): Number = values[key]

internal val Breakpoints.up: MediaSet by ReadOnlyBreakpointsMediaDelegate
internal val Breakpoints.down: MediaSet by ReadOnlyBreakpointsMediaDelegate

fun Breakpoints.up(key: Number) = up.invoke(key)
fun Breakpoints.up(key: Breakpoint) = up.invoke(key.toString())

fun Breakpoints.down(key: Number) = down.invoke(key)
fun Breakpoints.down(key: Breakpoint) = down.invoke(key.toString())

internal val Breakpoints.between: BetweenMediaSet by ReadOnlyBreakpointsBetweenMediaDelegate

fun Breakpoints.between(start: Breakpoint, end: Breakpoint) = between.invoke(start.toString(), end.toString())

internal val Breakpoints.only: MediaSet by ReadOnlyBreakpointsMediaDelegate

fun Breakpoints.only(key: Breakpoint) = only.invoke(key.toString())

internal val Breakpoints.width: WidthSet by ReadOnlyBreakpointsWidthDelegate

fun Breakpoints.width(key: Breakpoint) = width.invoke(key.toString())
