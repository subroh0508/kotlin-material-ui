package materialui.components

import kotlinx.css.StyledElement
import materialui.reacttransiton.RTransitionGroupProps
import react.dom.DOMProps
import kotlin.reflect.KProperty

external interface StandardProps : DOMProps {
    var classes: dynamic
    var component: dynamic
}

operator fun StandardProps.get(key: String): Any? = asDynamic()[key]

inline operator fun <reified E: Enum<E>> StandardProps.get(key: String): E?{
    val value = asDynamic()[key]
    return when (value) {
        null -> null
        undefined -> null
        else -> enumValueOf<E>(value.toString())
    }
}

inline operator fun <reified E: Enum<E>> StandardProps.set(key: String,value: E?) {
    asDynamic()[key] = when (value) {
            null -> undefined
            else -> value.toString()
        }
}

operator fun StandardProps.getValue(thisRef: Any?, property: KProperty<*>): dynamic
        = asDynamic()[property.name]

operator fun StandardProps.setValue(thisRef: Any?, property: KProperty<*>, value: dynamic) {
    asDynamic()[property.name] = value
}

//issue:problem with type argument <T: Enum<T>?> its not bounds enumValueOf<T>
inline operator fun <reified T: Enum<T>> StandardProps.getValue(thisRef: Any?, property: KProperty<*>): T?{
    val value = asDynamic()[property.name]
    return when (value) {
        null -> null
        undefined -> null
        else -> enumValueOf<T>(value.toString())
    }
}

inline operator fun <reified T: Enum<T>> StandardProps.setValue(thisRef: Any?, property: KProperty<*>, value: T?) {
    asDynamic()[property.name] = when (value) {
            null -> undefined
            else -> value.toString()
        }
}
