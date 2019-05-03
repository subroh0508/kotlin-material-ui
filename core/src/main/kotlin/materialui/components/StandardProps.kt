package materialui.components

import kotlinext.js.js
import react.dom.DOMProps
import kotlin.reflect.KProperty

external interface StandardProps : DOMProps {
    var classes: dynamic
    var component: dynamic
}

fun StandardProps.classes(vararg classMap: Pair<Enum<*>, String>) {
    classes(classMap.map { it.first to it.second })
}

fun StandardProps.classes(classMap: List<Pair<Enum<*>, String>>) {
    classes = js {}.apply { obj ->
        classMap.forEach {
            obj[it.first.toString()] = it.second
        }
    }
}

operator fun StandardProps.get(key: String): Any? = asDynamic()[key]

operator fun StandardProps.getValue(thisRef: Any?, property: KProperty<*>): dynamic
        = asDynamic()[property.name]

operator fun StandardProps.setValue(thisRef: Any?, property: KProperty<*>, value: dynamic) {
    asDynamic()[property.name] = value
}

inline operator fun <reified T: Enum<T>> StandardProps.getValue(thisRef: Any?, property: KProperty<*>): T?
        = (asDynamic()[property.name] as String?)?.let { enumValueOf<T>(it) }

inline operator fun <reified T: Enum<T>> StandardProps.setValue(thisRef: Any?, property: KProperty<*>, value: T?) {
    asDynamic()[property.name] = value?.toString()
}
