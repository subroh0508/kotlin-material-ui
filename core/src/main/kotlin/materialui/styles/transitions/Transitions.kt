package materialui.styles.transitions

import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.css.properties.Time
import kotlinx.css.properties.Timing
import kotlinx.css.properties.Transition

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

private fun TransitionCreateOptions.toDynamic() = js {
    duration?.let { this["duration"] = it }
    easing?.let { this["easing"] = it.toString() }
    delay?.let { this["delay"] = it }
}

fun Transitions.create(vararg prop: String, options: TransitionCreateOptions.() -> Unit): kotlinx.css.properties.Transitions {
    require(prop.isNotEmpty())

    val rawTransitions = (asDynamic().create(prop, jsObject(options).toDynamic()) as String)

    console.log(rawTransitions)
    return kotlinx.css.properties.Transitions().also { transitions ->
        """(${prop.joinToString("|")}) (\d+ms) (cubic-bezier\([^()]+\)) (\d+ms)""".toRegex()
            .findAll(rawTransitions)
            .forEach {
                it.groupValues.drop(1).chunked(4).forEach { elements ->
                    transitions += Transition(elements[0], Time(elements[1]), Timing(elements[2]), Time(elements[3]))
                }
            }
    }
}
