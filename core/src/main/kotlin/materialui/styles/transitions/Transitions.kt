package materialui.styles.transitions

import kotlinx.css.properties.Timing

external interface Transitions {
    val easing: Easing
    val duration: Duration
    val getAutoHeightDuration: (Number) -> Number
}

internal val Transitions.create: TransitionsCreate by ReadOnlyTransitionsCreateDelegate

fun Transitions.create(prop: String = "all", duration: Number? = null, easing: Timing? = null, delay: Number? = null): kotlinx.css.properties.Transitions
    = create.invoke(listOf(prop), duration, easing, delay)

fun Transitions.create(props: List<String> = listOf("all"), duration: Number? = null, easing: Timing? = null, delay: Number? = null): kotlinx.css.properties.Transitions
    = create.invoke(props, duration, easing, delay)
