@file:Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")

package styles.muitheme

data class BreakpointValueSets internal constructor(
    internal val jsObject: dynamic
) {
    var xs: Int
        get() = asDynamic()["xs"] as Int
        set(value) { asDynamic()["xs"] = value }
    var sm: Int
        get() = asDynamic()["sm"] as Int
        set(value) { asDynamic()["sm"] = value }
    var md: Int
        get() = asDynamic()["md"] as Int
        set(value) { asDynamic()["md"] = value }
    var lg: Int
        get() = asDynamic()["lg"] as Int
        set(value) { asDynamic()["lg"] = value }
    var xl: Int
        get() = asDynamic()["xl"] as Int
        set(value) { asDynamic()["xl"] = value }
}

external interface Breakpoint

fun Breakpoint.values(handler: BreakpointValueSets.() -> Unit) {
    asDynamic()["values"] = values.apply(handler).jsObject
}

val Breakpoint.values: BreakpointValueSets
    get() = BreakpointValueSets(asDynamic()["values"])

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
