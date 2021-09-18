package materialui.components.stepper

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.Stepper
import materialui.components.paper.PaperProps
import materialui.components.stepper.enums.StepperStyle
import react.RBuilder
import react.ReactElement

external interface StepperProps : PaperProps {
    var activeStep: Number?
    var alternativeLabel: Boolean?
    var connector: ReactElement?
    var nonLinear: Boolean?
    var orientation: String?
}

fun RBuilder.stepper(vararg classMap: Pair<StepperStyle, String>, block: StepperElementBuilder<DIV>.() -> Unit) {
    child(StepperElementBuilder(Stepper, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.stepper(vararg classMap: Pair<StepperStyle, String>, factory: (TagConsumer<Unit>) -> T, block: StepperElementBuilder<T>.() -> Unit) {
    child(StepperElementBuilder(Stepper, classMap.toList(), factory).apply(block).create())
}