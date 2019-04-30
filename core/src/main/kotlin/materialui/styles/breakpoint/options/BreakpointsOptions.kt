package materialui.styles.breakpoint.options

external interface BreakpointsOptions {
    var unit: String?
    var step: Number?
    var keys: Array<String>?
    var values: BreakpointValuesOptions?
    var up: ((dynamic) -> String)?
    var down: ((dynamic) -> String)?
    var between: ((String, String) -> String)?
    var only: ((String) -> String)?
    var width: ((String) -> Number)?
}