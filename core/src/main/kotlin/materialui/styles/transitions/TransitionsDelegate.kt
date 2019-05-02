package materialui.styles.transitions

import kotlinext.js.js
import kotlinx.css.properties.Timing
import kotlin.reflect.KProperty

typealias TransitionsCreate = (props: List<String>, duration: Number?, easing: Timing?, delay: Number?) -> Timing

object ReadOnlyTransitionsCreateDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): TransitionsCreate {
        val create = asDynamic()[property.name] as (Array<String>, dynamic) -> String

        return { props, duration, easing, delay ->
            val options = js {
                duration?.let { this["duration"] = it }
                easing?.let { this["easing"] = it.toString() }
                delay?.let { this["delay"] = it }
            }

            Timing(create(props.toTypedArray(), options))
        }
    }
}

object TransitionsCreateDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): TransitionsCreate? {
        val create = asDynamic()[property.name] as ((Array<String>, dynamic) -> String)? ?: return null

        return { props, duration, easing, delay ->
            val options = js {
                duration?.let { this["duration"] = it }
                easing?.let { this["easing"] = it.toString() }
                delay?.let { this["delay"] = it }
            }

            Timing(create(props.toTypedArray(), options))
        }
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: TransitionsCreate?) {
        if (value == null) {
            asDynamic()[property.name] = null
            return
        }

        asDynamic()[property.name] = { props: Array<String>, options: dynamic ->
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
            = Timing(asDynamic()[property.name] as String)
}

object EasingDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Timing?
            = (asDynamic()[property.name] as String?)?.let { Timing(it) }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Timing?) {
        asDynamic()[property.name] = value?.toString()
    }
}
