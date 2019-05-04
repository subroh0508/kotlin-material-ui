package materialui.reacttransiton

import org.w3c.dom.events.Event
import react.ReactElement
import kotlin.reflect.KProperty

external interface RTransitionProps {
    var `in`: Boolean?
    var mountOnEnter: Boolean?
    var unmountOnExit: Boolean?
    var appear: Boolean?
    var enter: Boolean?
    var exit: Boolean?
    var timeout: dynamic
    var addEndListener: ((ReactElement, (Event) -> Unit) -> Unit)?
    var onEnter: ((ReactElement, Boolean) -> Unit)?
    var onEntering: ((ReactElement, Boolean) -> Unit)?
    var onEntered: ((ReactElement, Boolean) -> Unit)?
    var onExit: ((ReactElement) -> Unit)?
    var onExiting: ((ReactElement) -> Unit)?
    var onExited: ((ReactElement) -> Unit)?
}

operator fun RTransitionProps.getValue(thisRef: Any?, property: KProperty<*>): dynamic
        = asDynamic()[property.name]

operator fun RTransitionProps.setValue(thisRef: Any?, property: KProperty<*>, value: dynamic) {
    asDynamic()[property.name] = value
}

inline operator fun <reified T: Enum<T>> RTransitionProps.getValue(thisRef: Any?, property: KProperty<*>): T?
        = (asDynamic()[property.name] as String?)?.let { enumValueOf<T>(it) }

inline operator fun <reified T: Enum<T>> RTransitionProps.setValue(thisRef: Any?, property: KProperty<*>, value: T?) {
    asDynamic()[property.name] = value?.toString()
}
