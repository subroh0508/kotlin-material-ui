package materialui.components

import react.dom.DOMProps
import kotlin.reflect.KProperty

external interface StandardProps : DOMProps {
    var classes: dynamic
    var component: dynamic
}

operator fun StandardProps.get(key: String): Any? = asDynamic()[key]

operator fun StandardProps.getValue(thisRef: Any?, property: KProperty<*>): dynamic
        = asDynamic()[property.name]

operator fun StandardProps.setValue(thisRef: Any?, property: KProperty<*>, value: dynamic) {
    asDynamic()[property.name] = value
}

inline operator fun <reified T: Enum<T>> StandardProps.getValue(thisRef: Any?, property: KProperty<*>): T?
        = (asDynamic()[property.name] as String?)?.let { name -> enumValues<T>().find { it.toString() == name } }

inline operator fun <reified T: Enum<T>> StandardProps.setValue(thisRef: Any?, property: KProperty<*>, value: T?) {
    asDynamic()[property.name] = value?.toString()
}
