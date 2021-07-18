package materialui.components.clickawaylistener

import kotlinext.js.jsObject
import materialui.components.clickawaylistener.enums.ClickAwayMouseEvent
import materialui.components.clickawaylistener.enums.ClickAwayTouchEvent
import materialui.reacteventlistener.REventListenerBuilder
import react.ComponentType

class ClickAwayListenerBuilder internal constructor(
    type: ComponentType<ClickAwayListenerProps>
) : REventListenerBuilder<ClickAwayListenerProps>(type, jsObject { }) {

    fun ClickAwayListenerProps.mouseEvent(event: ClickAwayMouseEvent, enable: Boolean = true) {
        if (!enable) {
            mouseEvent = false
            return
        }

        mouseEvent = event.toString()
    }
    fun ClickAwayListenerProps.touchEvent(event: ClickAwayTouchEvent, enable: Boolean = true) {
        if (!enable) {
            mouseEvent = false
            return
        }

        touchEvent = event.toString()
    }
}