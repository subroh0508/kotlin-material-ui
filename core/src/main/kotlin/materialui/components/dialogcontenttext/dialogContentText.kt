package materialui.components.dialogcontenttext

import kotlinx.html.P
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialStyle
import materialui.components.typography.TypographyProps
import react.*
import kotlin.reflect.KClass

@JsModule("@material-ui/core/DialogContentText")
private external val dialogContentTextModule: dynamic

external interface DialogContextTextProps : TypographyProps

@Suppress("UnsafeCastFromDynamic")
private val dialogContentTextComponent: RClass<DialogContextTextProps> = dialogContentTextModule.default

fun RBuilder.dialogContentText(rootStyle: String?, block: DialogContentTextElementBuilder<P>.() -> Unit)
    = child(DialogContentTextElementBuilder(dialogContentTextComponent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })) { P(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.dialogContentText(rootStyle: String?, factory: (TagConsumer<Unit>) -> T, block: DialogContentTextElementBuilder<T>.() -> Unit)
    = child(DialogContentTextElementBuilder(dialogContentTextComponent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it }), factory).apply(block).create())
