package materialui.components.stepbutton

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/StepButton")
private external val stepButtonModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val stepButtonComponent: RComponent<RProps, RState> = stepButtonModule.default

fun RBuilder.stepButton(block: StepButtonElementBuilder<BUTTON>.() -> Unit)
    = child(StepButtonElementBuilder(stepButtonComponent, BUTTON::class) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.stepButton(tag: KClass<T>, block: StepButtonElementBuilder<T>.() -> Unit)
    = child(StepButtonElementBuilder(stepButtonComponent, tag).apply(block).create())
