package materialui.components.stepper

import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/Stepper")
private external val stepperModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val stepperComponent: RComponent<RProps, RState> = stepperModule.default

fun RBuilder.stepper(block: StepperElementBuilder<DIV>.() -> Unit)
    = child(StepperElementBuilder(stepperComponent, DIV::class) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.stepper(tag: KClass<T>, block: StepperElementBuilder<T>.() -> Unit)
    = child(StepperElementBuilder(stepperComponent, tag).apply(block).create())
