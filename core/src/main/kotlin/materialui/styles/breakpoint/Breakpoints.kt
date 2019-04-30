package materialui.styles.breakpoint

external interface Breakpoints {
    val keys: Array<String>
    val values: BreakpointValues
    val up: (dynamic) -> String
    val down: (dynamic) -> String
    val between: (String, String) -> String
    val only: (String) -> String
    val width: (String) -> Number
}