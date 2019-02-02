package components.dialogcontenttext

import kotlinx.html.P
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/DialogContentText")
private external val dialogContentTextModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val dialogContentTextComponent: RComponent<RProps, RState> = dialogContentTextModule.default

fun RBuilder.dialogContentText(block: DialogContentTextElementBuilder<P>.() -> Unit)
    = child(DialogContentTextElementBuilder(dialogContentTextComponent, P::class) { P(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.dialogContentText(tag: KClass<T>, block: DialogContentTextElementBuilder<T>.() -> Unit)
    = child(DialogContentTextElementBuilder(dialogContentTextComponent, tag).apply(block).create())
