package materialui.components.dialogcontent

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/DialogContent")
private external val dialogContentModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val dialogContentComponent: RComponent<RProps, RState> = dialogContentModule.default

fun RBuilder.dialogContent(block: DialogContentElementBuilder.() -> Unit)
    = child(DialogContentElementBuilder(dialogContentComponent).apply(block).create())
