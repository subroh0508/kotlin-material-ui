package materialui.components.clickawaylistener

import org.w3c.dom.events.Event
import react.RBuilder
import react.RClass
import react.RProps

@JsModule("@material-ui/core/ClickAwayListener")
private external val clickAwayListenerModule: dynamic

external interface ClickAwayListenerProps : RProps {
    var mouseEvent: dynamic
    var onClickAway: ((Event) -> Unit)?
    var touchEvent: dynamic
}

@Suppress("UnsafeCastFromDynamic")
private val clickAwayListenerComponent: RClass<ClickAwayListenerProps> = clickAwayListenerModule.default

fun RBuilder.clickAwayListener(block: ClickAwayListenerBuilder.() -> Unit)
    = child(ClickAwayListenerBuilder(clickAwayListenerComponent).apply(block).create())
