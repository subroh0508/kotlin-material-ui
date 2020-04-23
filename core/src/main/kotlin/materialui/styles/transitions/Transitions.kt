package materialui.styles.transitions

import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.css.properties.Timing

external interface Transitions {
    val easing: Easing
    val duration: Duration
    val getAutoHeightDuration: (Number) -> Number
}

external interface TransitionCreateOptions {
    var duration: Number?
    var easing: Timing?
    var delay: Number?
}

internal val Transitions.create: TransitionsCreate by ReadOnlyTransitionsCreateDelegate

fun Transitions.create(vararg prop: String, options: TransitionCreateOptions.() -> Unit = {}): kotlinx.css.properties.Transitions {
    require(prop.isNotEmpty())

    return create.invoke(prop, jsObject(options).toDynamic())
}

private fun TransitionCreateOptions.toDynamic() = js {
    duration?.let { this["duration"] = it }
    easing?.let { this["easing"] = it.toString() }
    delay?.let { this["delay"] = it }
}

