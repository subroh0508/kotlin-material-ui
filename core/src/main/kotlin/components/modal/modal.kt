package components.modal

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Modal")
private external val modalModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val modalComponent: RComponent<RProps, RState> = modalModule.default

fun RBuilder.modal(block: ModalElementBuilder.() -> Unit)
    = child(ModalElementBuilder(modalComponent).apply(block).create())