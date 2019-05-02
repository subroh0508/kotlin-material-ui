package materialui.styles.breakpoint.options

import kotlinext.js.jsObject
import materialui.styles.breakpoint.*

external interface BreakpointsOptions {
    var unit: String?
    var step: Number?
    var keys: Array<String>?
    var values: BreakpointValuesOptions?
}

operator fun BreakpointsOptions.get(key: Breakpoint): Number? = values?.get(key)

internal var BreakpointsOptions.up: MediaSet? by BreakpointsMediaDelegate
internal var BreakpointsOptions.down: MediaSet? by BreakpointsMediaDelegate

fun BreakpointsOptions.up(key: Number) = up?.invoke(key)
fun BreakpointsOptions.up(key: Breakpoint) = up?.invoke(key.toString())
fun BreakpointsOptions.up(block: (Number) -> String) {
    @Suppress("UNCHECKED_CAST")
    up = { key: Number -> block(key) } as MediaSet
}
fun BreakpointsOptions.up(block: (Breakpoint) -> String) {
    @Suppress("UNCHECKED_CAST")
    up = { key: String -> block(Breakpoint.valueOf(key)) } as MediaSet
}

fun BreakpointsOptions.down(key: Number) = down?.invoke(key)
fun BreakpointsOptions.down(key: Breakpoint) = down?.invoke(key.toString())
fun BreakpointsOptions.down(block: (Number) -> String) {
    @Suppress("UNCHECKED_CAST")
    down = { key: Number -> block(key) } as MediaSet
}
fun BreakpointsOptions.down(block: (Breakpoint) -> String) {
    @Suppress("UNCHECKED_CAST")
    down = { key: String -> block(Breakpoint.valueOf(key)) } as MediaSet
}

internal var BreakpointsOptions.between: BetweenMediaSet? by BreakpointsBetweenMediaDelegate

fun BreakpointsOptions.between(start: Breakpoint, end: Breakpoint) = between?.invoke(start.toString(), end.toString())
fun BreakpointsOptions.between(block: (Breakpoint, Breakpoint) -> String) {
    between = { start: String, end: String -> block(Breakpoint.valueOf(start), Breakpoint.valueOf(end)) }
}

internal var BreakpointsOptions.only: MediaSet? by BreakpointsMediaDelegate

fun BreakpointsOptions.only(key: Breakpoint) = only?.invoke(key.toString())
fun BreakpointsOptions.only(block: (Breakpoint) -> String) {
    @Suppress("UNCHECKED_CAST")
    only = { key: String -> block(Breakpoint.valueOf(key)) } as MediaSet
}

internal var BreakpointsOptions.width: WidthSet? by BreakpointsWidthDelegate

fun BreakpointsOptions.width(key: Breakpoint) = width?.invoke(key.toString())
fun BreakpointsOptions.width(block: (Breakpoint) -> Number) {
    width = { key: String -> block(Breakpoint.valueOf(key)) }
}

fun BreakpointsOptions.values(block: BreakpointValuesOptions.() -> Unit) { values = (values ?: jsObject { }).apply(block) }
