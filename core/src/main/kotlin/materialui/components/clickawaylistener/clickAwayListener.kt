package materialui.components.clickawaylistener

import materialui.ClickAwayListener
import org.w3c.dom.events.Event
import react.RBuilder
import react.RProps

external interface ClickAwayListenerProps : RProps {
    var mouseEvent: dynamic
    var onClickAway: ((Event) -> Unit)?
    var touchEvent: dynamic
}

fun RBuilder.clickAwayListener(block: ClickAwayListenerBuilder.() -> Unit)
    = child(ClickAwayListenerBuilder(ClickAwayListener).apply(block).create())
