package materialui.components.dialog

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Dialog")
private external val dialogModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val dialogComponent: RComponent<RProps, RState> = dialogModule.default

fun RBuilder.dialog(block: DialogElementBuilder.() -> Unit)
    = child(DialogElementBuilder(dialogComponent).apply(block).create())
