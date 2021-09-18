package materialui.components.clickawaylistener

import materialui.ClickAwayListener
import org.w3c.dom.events.Event
import react.RBuilder
import react.PropsWithChildren

external interface ClickAwayListenerProps : PropsWithChildren {
    var mouseEvent: dynamic
    var onClickAway: ((Event) -> Unit)?
    var touchEvent: dynamic
}

fun RBuilder.clickAwayListener(block: ClickAwayListenerBuilder.() -> Unit)
    = child(clickAwayListenerElement(block))

internal fun clickAwayListenerElement(
    block: ClickAwayListenerBuilder.() -> Unit
) = ClickAwayListenerBuilder(ClickAwayListener).apply(block).create()
