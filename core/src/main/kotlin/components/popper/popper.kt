package components.popper

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Popper")
private external val popperModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val popperComponent: RComponent<RProps, RState> = popperModule.default

fun RBuilder.popper(block: PopperElementBuilder.() -> Unit)
    = child(PopperElementBuilder(popperComponent).apply(block).create())
