package components.textfield

import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/TextField")
private external val tableFieldModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val tableFieldComponent: RComponent<RProps, RState> = tableFieldModule.default

fun RBuilder.textField(block: TextFieldElementBuilder<DIV>.() -> Unit)
    = child(TextFieldElementBuilder(tableFieldComponent, DIV::class) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.textField(tag: KClass<T>, block: TextFieldElementBuilder<T>.() -> Unit)
    = child(TextFieldElementBuilder(tableFieldComponent, tag).apply(block).create())
