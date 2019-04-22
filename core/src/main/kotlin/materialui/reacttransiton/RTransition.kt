package materialui.reacttransiton

import org.w3c.dom.events.Event
import react.RProps
import react.ReactElement
import materialui.reacttransiton.values.TransitionTimeout

interface RTransition {
    var RProps.`in`: Boolean
    var RProps.mountOnEnter: Boolean
    var RProps.unmountOnExit: Boolean
    var RProps.appear: Boolean
    var RProps.enter: Boolean
    var RProps.exit: Boolean
    var RProps.timeout: TransitionTimeout
    var RProps.addEndListener: (ReactElement, (Event) -> Unit) -> Unit
    var RProps.onEnter: (ReactElement, Boolean) -> Unit
    var RProps.onEntering: (ReactElement, Boolean) -> Unit
    var RProps.onEntered: (ReactElement, Boolean) -> Unit
    var RProps.onExit: (ReactElement) -> Unit
    var RProps.onExiting: (ReactElement) -> Unit
    var RProps.onExited: (ReactElement) -> Unit
}