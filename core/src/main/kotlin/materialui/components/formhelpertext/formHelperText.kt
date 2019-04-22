package materialui.components.formhelpertext

import kotlinx.html.P
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/FormHelperText")
private external val formHelperTextModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val formHelperTextComponent: RComponent<RProps, RState> = formHelperTextModule.default

fun RBuilder.formHelperText(block: FormHelperTextElementBuilder<P>.() -> Unit)
    = child(FormHelperTextElementBuilder(formHelperTextComponent, P::class) { P(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.formHelperText(tag: KClass<T>, block: FormHelperTextElementBuilder<T>.() -> Unit)
    = child(FormHelperTextElementBuilder(formHelperTextComponent, tag).apply(block).create())
