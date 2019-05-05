package materialui.components.clickawaylistener

import kotlinext.js.jsObject
import materialui.components.clickawaylistener.enums.ClickAwayMouseEvent
import materialui.components.clickawaylistener.enums.ClickAwayTouchEvent
import materialui.reacteventlistener.REventListenerBuilder
import react.RClass

class ClickAwayListenerBuilder internal constructor(
    type: RClass<ClickAwayListenerProps>
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