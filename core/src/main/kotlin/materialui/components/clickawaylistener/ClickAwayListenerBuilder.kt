package materialui.components.clickawaylistener

import materialui.components.clickawaylistener.values.ClickAwayListenerMouseEvent
import materialui.components.clickawaylistener.values.ClickAwayListenerTouchEvent
import org.w3c.dom.events.Event
import react.RComponent
import react.RProps
import react.RState
import materialui.reacteventlistener.REventListenerBuilder

class ClickAwayListenerBuilder internal constructor(
    type: RComponent<RProps, RState>
) : REventListenerBuilder(type) {

    var RProps.mouseEvent: ClickAwayListenerMouseEvent
        get() = ClickAwayListenerMouseEvent.fromDynamic(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["mouseEvent"])
        set(value) { props.asDynamic()["mouseEvent"] = value }
    var RProps.onClickAway: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onClickAway"]
        set(value) { props.asDynamic()["onClickAway"] = value }
    var RProps.touchEvent: ClickAwayListenerTouchEvent
        get() = ClickAwayListenerTouchEvent.fromDynamic(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["touchEvent"])
        set(value) { props.asDynamic()["onClickAway"] = value }
}