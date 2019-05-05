package materialui.components.stepper

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.paper.PaperProps
import materialui.components.stepper.enums.StepperStyle
import react.RBuilder
import react.RClass
import react.ReactElement

@JsModule("@material-ui/core/Stepper")
private external val stepperModule: dynamic

external interface StepperProps : PaperProps {
    var activeStep: Number?
    var alternativeLabel: Boolean?
    var connector: ReactElement?
    var nonLinear: Boolean?
    var orientation: String?
}

@Suppress("UnsafeCastFromDynamic")
private val stepperComponent: RClass<StepperProps> = stepperModule.default

fun RBuilder.stepper(vararg classMap: Pair<StepperStyle, String>, block: StepperElementBuilder<DIV>.() -> Unit)
    = child(StepperElementBuilder(stepperComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.stepper(vararg classMap: Pair<StepperStyle, String>, factory: (TagConsumer<Unit>) -> T, block: StepperElementBuilder<T>.() -> Unit)
    = child(StepperElementBuilder(stepperComponent, classMap.toList(), factory).apply(block).create())
