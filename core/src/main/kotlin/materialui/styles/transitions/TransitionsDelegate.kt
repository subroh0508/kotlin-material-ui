package materialui.styles.transitions

import kotlinx.css.properties.Time
import kotlinx.css.properties.Timing
import kotlinx.css.properties.Transition
import kotlinx.css.properties.Transitions
import kotlin.reflect.KProperty

typealias TransitionsCreate = (Array<out String>, dynamic) -> Transitions

object ReadOnlyTransitionsCreateDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): TransitionsCreate {
        val create = thisRef.asDynamic()[property.name] as (Array<out String>, dynamic) -> String

        return { props, options ->
            val rawTransitions = create(props, options)

            Transitions().also { transitions ->
                transitionRegex(props)
                    .findAll(rawTransitions)
                    .forEach {
                        it.groupValues.drop(1).chunked(4).forEach { elements ->
                            transitions += Transition(elements[0], Time(elements[1]), Timing(elements[2]), Time(elements[3]))
                        }
                    }
            }

        }
    }
}

object TransitionsCreateDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): TransitionsCreate? {
        thisRef.asDynamic()[property.name] as ((Array<String>, dynamic) -> String)? ?: return null

        return ReadOnlyTransitionsCreateDelegate.getValue(thisRef, property)
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: TransitionsCreate?) {
        thisRef.asDynamic()[property.name] = { props: Array<out String>, options: dynamic ->
            value?.invoke(props, options).toString()
        }
    }
}

private const val TRANSITION_TIME_ELEMENT = """[0-9,. ]+ms"""
private const val TRANSITION_FUNCTION_ELEMENT = """cubic-bezier\([^()]+\)"""

private fun transitionRegex(props: Array<out String>) =
    """(${props.joinToString("|")}) ($TRANSITION_TIME_ELEMENT) ($TRANSITION_FUNCTION_ELEMENT) ($TRANSITION_TIME_ELEMENT)""".toRegex()

object ReadOnlyEasingDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Timing
            = Timing(thisRef.asDynamic()[property.name] as String)
}

object EasingDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Timing?
            = (thisRef.asDynamic()[property.name] as String?)?.let { Timing(it) }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Timing?) {
        thisRef.asDynamic()[property.name] = value?.toString()
    }
}
