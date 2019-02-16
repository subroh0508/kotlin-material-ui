@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package styles.muitheme

import styles.muitheme.breakpoints.BreakpointValue

external interface BreakpointValueSets

inline operator fun BreakpointValueSets.get(key: BreakpointValue): Int = asDynamic()[key.toString()] as Int
inline operator fun BreakpointValueSets.set(key: BreakpointValue, value: Int) {
    asDynamic()[key.toString()] = value
}

external interface Breakpoint

inline fun Breakpoint.values(handler: BreakpointValueSets.() -> Unit) {
    asDynamic()["values"] = values.apply(handler)
}

val Breakpoint.values: BreakpointValueSets
    get() = asDynamic()["values"] as BreakpointValueSets

var Breakpoint.up: (String) -> String
    get() = asDynamic()["up"] as (String) -> String
    set(value) { asDynamic()["up"] = value }

var Breakpoint.down: (String) -> String
    get() = asDynamic()["down"] as (String) -> String
    set(value) { asDynamic()["down"] = value }

var Breakpoint.between: (String, String) -> String
    get() = asDynamic()["between"] as (String, String) -> String
    set(value) { asDynamic()["between"] = value }

var Breakpoint.only: (String) -> String
    get() = asDynamic()["only"] as (String) -> String
    set(value) { asDynamic()["only"] = value }

var Breakpoint.width: (String) -> Int
    get() = asDynamic()["width"] as (String) -> Int
    set(value) { asDynamic()["width"] = value }
