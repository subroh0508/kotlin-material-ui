package materialui.styles.breakpoint.options

external interface BreakpointValuesOptions {
    var xs: Number?
    var sm: Number?
    var md: Number?
    var lg: Number?
    var xl: Number?
}

operator fun BreakpointValuesOptions.get(key: String): Number? = asDynamic()[key] as Number?

operator fun BreakpointValuesOptions.set(key: String, value: Number) {
    asDynamic()[key] = value
}
