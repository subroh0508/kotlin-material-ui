package materialui.reacttransiton

import react.RProps
import react.ReactElement
import kotlin.reflect.KProperty

external interface RTransitionGroupProps : RProps {
    var appear: Boolean?
    var enter: Boolean?
    var exit: Boolean?
    var childFactory: ((ReactElement) -> ReactElement)?
}

operator fun RTransitionGroupProps.get(key: String): Any? = asDynamic()[key]

operator fun RTransitionGroupProps.getValue(thisRef: Any?, property: KProperty<*>): dynamic
        = asDynamic()[property.name]

operator fun RTransitionGroupProps.setValue(thisRef: Any?, property: KProperty<*>, value: dynamic) {
    asDynamic()[property.name] = value
}

inline operator fun <reified T: Enum<T>> RTransitionGroupProps.getValue(thisRef: Any?, property: KProperty<*>): T?
        = (asDynamic()[property.name] as String?)?.let { enumValueOf<T>(it) }

inline operator fun <reified T: Enum<T>> RTransitionGroupProps.setValue(thisRef: Any?, property: KProperty<*>, value: T?) {
    asDynamic()[property.name] = value?.toString()
}