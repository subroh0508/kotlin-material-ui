package materialui.styles.transitions.options

import kotlinx.css.properties.Timing
import materialui.styles.transitions.Transitions
import materialui.styles.transitions.TransitionsCreate
import materialui.styles.transitions.TransitionsCreateDelegate
import materialui.styles.transitions.create

external interface TransitionsOptions {
    var easing: EasingOptions?
    var duration: DurationOptions?
    var getAutoHeightDuration: ((Number) -> Number)?
}

internal var Transitions.create: TransitionsCreate? by TransitionsCreateDelegate

fun Transitions.create(prop: String = "all", duration: Number? = null, easing: Timing? = null, delay: Number? = null): kotlinx.css.properties.Transitions
        = create.invoke(listOf(prop), duration, easing, delay)

fun Transitions.create(props: List<String> = listOf("all"), duration: Number? = null, easing: Timing? = null, delay: Number? = null): kotlinx.css.properties.Transitions
        = create.invoke(props, duration, easing, delay)
