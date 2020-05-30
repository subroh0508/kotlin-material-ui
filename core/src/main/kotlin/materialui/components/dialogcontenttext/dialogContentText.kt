package materialui.components.dialogcontenttext

import kotlinx.html.P
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.DialogContentText
import materialui.components.MaterialStyle
import materialui.components.typography.TypographyProps
import react.*

external interface DialogContentTextProps : TypographyProps

fun RBuilder.dialogContentText(rootStyle: String?, block: DialogContentTextElementBuilder<P>.() -> Unit)
    = child(DialogContentTextElementBuilder(DialogContentText, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })) { P(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.dialogContentText(rootStyle: String?, factory: (TagConsumer<Unit>) -> T, block: DialogContentTextElementBuilder<T>.() -> Unit)
    = child(DialogContentTextElementBuilder(DialogContentText, listOfNotNull(rootStyle?.let { MaterialStyle.root to it }), factory).apply(block).create())
