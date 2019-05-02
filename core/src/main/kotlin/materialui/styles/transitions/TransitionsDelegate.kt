package materialui.styles.transitions

import kotlinext.js.js
import kotlinx.css.properties.Time
import kotlinx.css.properties.Timing
import kotlinx.css.properties.Transition
import kotlinx.css.properties.Transitions
import kotlin.reflect.KProperty

typealias TransitionsCreate = (props: List<String>, duration: Number?, easing: Timing?, delay: Number?) -> Transitions

object ReadOnlyTransitionsCreateDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): TransitionsCreate {
        val create = thisRef.asDynamic()[property.name] as (Array<String>, dynamic) -> String

        return { props, duration, easing, delay ->
            val options = js {
                duration?.let { this["duration"] = it }
                easing?.let { this["easing"] = it.toString() }
                delay?.let { this["delay"] = it }
            }

            val ts = create(props.toTypedArray(), options).split(",")

            Transitions().also { transitions ->
                ts.forEach { t ->
                    val propertyElement = """^[a-zA-Z\-]* """.toRegex().find(t)?.value?.let { it.replace(" ", "") }
                    val durationElement = """ \d*ms """.toRegex().find(t)?.value?.let { Time(it.replace(" ", "")) }
                    val timingElement = """cubic-bezier\(.*?\)""".toRegex().find(t)?.value?.let(::Timing)
                    val delayElement = """ \d*ms$""".toRegex().find(t)?.value?.let { Time(it.replace(" ", "")) }

                    propertyElement ?: return@forEach
                    durationElement ?: return@forEach
                    timingElement ?: return@forEach
                    delayElement ?: return@forEach

                    transitions += Transition(propertyElement, durationElement, timingElement, delayElement)
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
        if (value == null) {
            thisRef.asDynamic()[property.name] = null
            return
        }

        thisRef.asDynamic()[property.name] = { props: Array<String>, options: dynamic ->
            val timing = value.invoke(
                props.toList(),
                options["duration"] as Number?,
                (options["easing"] as String?)?.let { Timing(it) },
                options["delay"] as Number?
            )

            timing.toString()
        }
    }
}

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
