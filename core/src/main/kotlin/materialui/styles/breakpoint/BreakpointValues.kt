package materialui.styles.breakpoint

external interface BreakpointValues {
    val xs: Number
    val sm: Number
    val md: Number
    val lg: Number
    val xl: Number
}

operator fun BreakpointValues.get(key: String): Number? = asDynamic()[key] as Number?
