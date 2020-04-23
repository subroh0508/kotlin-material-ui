package materialui.styles.transitions.options

import kotlinext.js.jsObject
import kotlinx.css.properties.Timing
import kotlinx.css.properties.Transitions
import materialui.styles.transitions.*
import materialui.styles.transitions.create

external interface TransitionsOptions {
    var easing: EasingOptions?
    var duration: DurationOptions?
    var getAutoHeightDuration: ((Number) -> Number)?
}

internal var TransitionsOptions.create: TransitionsCreate? by TransitionsCreateDelegate

fun TransitionsOptions.create(func: (Array<out String>, TransitionCreateOptions) -> Transitions) {
    create = { props, options -> func(props, toTransitionCreateOptions(options)) }
}

fun TransitionsOptions.easing(block: EasingOptions.() -> Unit) { easing = (easing ?: jsObject { }).apply(block) }
fun TransitionsOptions.duration(block: DurationOptions.() -> Unit) { duration = (duration ?: jsObject { }).apply(block) }

private fun toTransitionCreateOptions(obj: dynamic): TransitionCreateOptions = jsObject {
    duration = obj["duration"] as? Int
    easing = (obj["easing"] as? String)?.let(::Timing)
    delay = obj["delay"] as? Int
}
