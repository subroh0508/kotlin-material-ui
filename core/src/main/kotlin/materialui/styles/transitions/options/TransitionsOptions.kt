package materialui.styles.transitions.options

import kotlinext.js.jsObject
import kotlinx.css.properties.Timing
import materialui.styles.transitions.TransitionsCreate
import materialui.styles.transitions.TransitionsCreateDelegate

external interface TransitionsOptions {
    var easing: EasingOptions?
    var duration: DurationOptions?
    var getAutoHeightDuration: ((Number) -> Number)?
}

internal var TransitionsOptions.create: TransitionsCreate? by TransitionsCreateDelegate

fun TransitionsOptions.create(prop: String = "all", duration: Number? = null, easing: Timing? = null, delay: Number? = null): kotlinx.css.properties.Transitions?
        = create?.invoke(listOf(prop), duration, easing, delay)

fun TransitionsOptions.create(props: List<String> = listOf("all"), duration: Number? = null, easing: Timing? = null, delay: Number? = null): kotlinx.css.properties.Transitions?
        = create?.invoke(props, duration, easing, delay)

fun TransitionsOptions.easing(block: EasingOptions.() -> Unit) { easing = (easing ?: jsObject { }).apply(block) }
fun TransitionsOptions.duration(block: DurationOptions.() -> Unit) { duration = (duration ?: jsObject { }).apply(block) }


