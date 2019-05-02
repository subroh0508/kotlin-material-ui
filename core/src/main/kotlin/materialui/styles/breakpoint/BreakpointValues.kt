package materialui.styles.breakpoint

external interface BreakpointValues {
    val xs: Number
    val sm: Number
    val md: Number
    val lg: Number
    val xl: Number
}

operator fun BreakpointValues.get(key: Breakpoint): Number = when (key) {
    Breakpoint.xs -> xs
    Breakpoint.sm -> sm
    Breakpoint.md -> md
    Breakpoint.lg -> lg
    Breakpoint.xl -> xl
}
