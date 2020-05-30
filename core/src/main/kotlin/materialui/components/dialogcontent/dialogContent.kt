package materialui.components.dialogcontent

import materialui.DialogContent
import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.RBuilder

external interface DialogContentProps : StandardProps

fun RBuilder.dialogContent(rootStyle: String? = null, block: DialogContentElementBuilder.() -> Unit)
    = child(DialogContentElementBuilder(DialogContent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })).apply(block).create())
