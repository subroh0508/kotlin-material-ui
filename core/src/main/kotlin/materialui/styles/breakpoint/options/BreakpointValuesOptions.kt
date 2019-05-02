package materialui.styles.breakpoint.options

import materialui.styles.breakpoint.Breakpoint

external interface BreakpointValuesOptions {
    var xs: Number
    var sm: Number
    var md: Number
    var lg: Number
    var xl: Number
}

operator fun BreakpointValuesOptions.get(key: Breakpoint): Number = when (key) {
    Breakpoint.xs -> xs
    Breakpoint.sm -> sm
    Breakpoint.md -> md
    Breakpoint.lg -> lg
    Breakpoint.xl -> xl
}

operator fun BreakpointValuesOptions.set(key: Breakpoint, value: Number) {
    when (key) {
        Breakpoint.xs -> { xs = value }
        Breakpoint.sm -> { sm = value }
        Breakpoint.md -> { md = value }
        Breakpoint.lg -> { lg = value }
        Breakpoint.xl -> { xl = value }
    }
}

