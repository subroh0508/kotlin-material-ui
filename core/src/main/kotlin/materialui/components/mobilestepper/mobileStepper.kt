package materialui.components.mobilestepper

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.MobileStepper
import materialui.components.paper.PaperProps
import materialui.components.paper.enums.PaperStyle
import react.RBuilder
import react.RProps
import react.ReactElement

external interface MobileStepperProps : PaperProps {
    var activeStep: Number?
    var backButton: ReactElement?
    var LinearProgressProps: RProps?
    var nextButton: ReactElement?
    var position: String?
    var steps: Number?
    var variant: String?
}

fun RBuilder.mobileStepper(vararg classMap: Pair<PaperStyle, String>, block: MobileStepperElementBuilder<DIV>.() -> Unit)
    = child(MobileStepperElementBuilder(MobileStepper, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.mobileStepper(vararg classMap: Pair<PaperStyle, String>, factory: (TagConsumer<Unit>) -> T, block: MobileStepperElementBuilder<T>.() -> Unit)
    = child(MobileStepperElementBuilder(MobileStepper, classMap.toList(), factory).apply(block).create())
