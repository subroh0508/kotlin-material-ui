package materialui.components.dialogcontent

import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/DialogContent")
private external val dialogContentModule: dynamic

external interface DialogContentProps : StandardProps

@Suppress("UnsafeCastFromDynamic")
private val dialogContentComponent: RClass<DialogContentProps> = dialogContentModule.default

fun RBuilder.dialogContent(rootStyle: String? = null, block: DialogContentElementBuilder.() -> Unit)
    = child(DialogContentElementBuilder(dialogContentComponent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })).apply(block).create())
