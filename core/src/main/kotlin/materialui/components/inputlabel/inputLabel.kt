package materialui.components.inputlabel

import kotlinx.html.LABEL
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/InputLabel")
private external val inputLabelModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val inputLabelComponent: RComponent<RProps, RState> = inputLabelModule.default

fun RBuilder.inputLabel(block: InputLabelElementBuilder<LABEL>.() -> Unit)
    = child(InputLabelElementBuilder(inputLabelComponent, LABEL::class) { LABEL(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.inputLabel(tag: KClass<T>, block: InputLabelElementBuilder<T>.() -> Unit)
    = child(InputLabelElementBuilder(inputLabelComponent, tag).apply(block).create())
