package materialui.styles.transitions.options

external interface TransitionsOptions {
    var easing: EasingOptions?
    var duration: DurationOptions?
    var create: ((dynamic, dynamic) -> String)?
    var getAutoHeightDuration: ((Number) -> Number)?
}