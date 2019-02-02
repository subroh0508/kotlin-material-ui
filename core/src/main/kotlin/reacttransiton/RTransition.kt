package reacttransiton

import kotlinx.html.Tag
import org.w3c.dom.events.Event
import react.ReactElement
import reacttransiton.values.TransitionTimeout

interface RTransition {
    var Tag.`in`: Boolean
    var Tag.mountOnEnter: Boolean
    var Tag.unmountOnExit: Boolean
    var Tag.appear: Boolean
    var Tag.enter: Boolean
    var Tag.exit: Boolean
    var Tag.timeout: TransitionTimeout
    var Tag.addEndListener: (ReactElement, (Event) -> Unit) -> Unit
    var Tag.onEnter: (ReactElement, Boolean) -> Unit
    var Tag.onEntering: (ReactElement, Boolean) -> Unit
    var Tag.onEntered: (ReactElement, Boolean) -> Unit
    var Tag.onExit: (ReactElement) -> Unit
    var Tag.onExiting: (ReactElement) -> Unit
    var Tag.onExited: (ReactElement) -> Unit
}