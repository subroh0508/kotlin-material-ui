package materialui.components.inputadornment

import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/InputAdornment")
private external val inputAdornmentModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val inputAdornmentComponent: RComponent<RProps, RState> = inputAdornmentModule.default

fun RBuilder.inputAdornment(block: InputAdornmentElementBuilder<DIV>.() -> Unit)
    = child(InputAdornmentElementBuilder(inputAdornmentComponent, DIV::class) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.inputAdornment(tag: KClass<T>, block: InputAdornmentElementBuilder<T>.() -> Unit)
    = child(InputAdornmentElementBuilder(inputAdornmentComponent, tag).apply(block).create())
