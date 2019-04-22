package materialui.components.formcontrol

import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/FormControl")
private external val formControlModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val formControlComponent: RComponent<RProps, RState> = formControlModule.default

fun RBuilder.formControl(block: FormControlElementBuilder<DIV>.() -> Unit)
    = child(FormControlElementBuilder(formControlComponent, DIV::class) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.formControl(tag: KClass<T>, block: FormControlElementBuilder<T>.() -> Unit)
    = child(FormControlElementBuilder(formControlComponent, tag).apply(block).create())
