package materialui.components.popover

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Popover")
private external val popoverModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val popoverComponent: RComponent<RProps, RState> = popoverModule.default

fun RBuilder.popover(block: PopoverElementBuilder.() -> Unit)
    = child(PopoverElementBuilder(popoverComponent).apply(block).create())