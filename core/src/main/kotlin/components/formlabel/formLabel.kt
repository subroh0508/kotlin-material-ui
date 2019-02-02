package components.formlabel

import kotlinx.html.LABEL
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/FormLabel")
private external val formLabelModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val formLabelComponent: RComponent<RProps, RState> = formLabelModule.default

fun RBuilder.formLabel(block: FormLabelElementBuilder<LABEL>.() -> Unit)
    = child(FormLabelElementBuilder(formLabelComponent, LABEL::class) { LABEL(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.formLabel(tag: KClass<T>, block: FormLabelElementBuilder<T>.() -> Unit)
    = child(FormLabelElementBuilder(formLabelComponent, tag).apply(block).create())
