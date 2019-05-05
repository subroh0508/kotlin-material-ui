package materialui.reacttransiton

import org.w3c.dom.events.Event
import react.RProps
import react.ReactElement
import kotlin.reflect.KProperty

external interface RTransitionProps : RProps, RTransitionHandlerProps {
    var `in`: Boolean?
    var mountOnEnter: Boolean?
    var unmountOnExit: Boolean?
    var appear: Boolean?
    var enter: Boolean?
    var exit: Boolean?
    var timeout: dynamic
    var addEndListener: ((ReactElement, (Event) -> Unit) -> Unit)?
}

external interface RTransitionHandlerProps : RProps {
    var onEnter: ((ReactElement, Boolean) -> Unit)?
    var onEntering: ((ReactElement, Boolean) -> Unit)?
    var onEntered: ((ReactElement, Boolean) -> Unit)?
    var onExit: ((ReactElement) -> Unit)?
    var onExiting: ((ReactElement) -> Unit)?
    var onExited: ((ReactElement) -> Unit)?
}

operator fun RTransitionHandlerProps.getValue(thisRef: Any?, property: KProperty<*>): dynamic
        = asDynamic()[property.name]

operator fun RTransitionHandlerProps.setValue(thisRef: Any?, property: KProperty<*>, value: dynamic) {
    asDynamic()[property.name] = value
}

inline operator fun <reified T: Enum<T>> RTransitionHandlerProps.getValue(thisRef: Any?, property: KProperty<*>): T?
        = (asDynamic()[property.name] as String?)?.let { name -> enumValues<T>().find { it.toString() == name } }

inline operator fun <reified T: Enum<T>> RTransitionHandlerProps.setValue(thisRef: Any?, property: KProperty<*>, value: T?) {
    asDynamic()[property.name] = value?.toString()
}
