package materialui.styles.transitions

external interface Transitions {
    val easing: Easing
    val duration: Duration
    val create: (dynamic, dynamic) -> String
    val getAutoHeightDuration: (Number) -> Number
}