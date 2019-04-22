package materialui.components.clickawaylistener

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/ClickAwayListener")
private external val clickAwayListenerModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val clickAwayListenerComponent: RComponent<RProps, RState> = clickAwayListenerModule.default

fun RBuilder.clickAwayListener(block: ClickAwayListenerBuilder.() -> Unit)
    = child(ClickAwayListenerBuilder(clickAwayListenerComponent).apply(block).create())
