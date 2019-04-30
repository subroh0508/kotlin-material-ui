package materialui.components

import kotlinext.js.js
import react.RProps
import kotlin.reflect.KProperty

external interface StandardProps : RProps {
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
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

operator fun StandardProps.getValue(thisRef: Any?, property: KProperty<*>): dynamic
        = thisRef?.asDynamic()[property.name]

operator fun StandardProps.setValue(thisRef: Any?, property: KProperty<*>, value: dynamic) {
    thisRef?.asDynamic()[property.name] = value
}
