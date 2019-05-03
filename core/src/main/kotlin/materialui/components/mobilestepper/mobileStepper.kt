package materialui.components.mobilestepper

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.paper.PaperProps
import materialui.components.paper.enums.PaperStyle
import react.RBuilder
import react.RClass
import react.RProps
import react.ReactElement

@JsModule("@material-ui/core/MobileStepper")
private external val mobileStepperModule: dynamic

external interface MobileStepperProps : PaperProps {
    var activeStep: Number?
    var backButton: ReactElement?
    var LinearProgressProps: RProps?
    var nextButton: ReactElement?
    var position: String?
    var steps: Number?
    var variant: String?
}

@Suppress("UnsafeCastFromDynamic")
private val mobileStepperComponent: RClass<MobileStepperProps> = mobileStepperModule.default

fun RBuilder.mobileStepper(vararg classMap: Pair<PaperStyle, String>, block: MobileStepperElementBuilder<DIV>.() -> Unit)
    = child(MobileStepperElementBuilder(mobileStepperComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.mobileStepper(vararg classMap: Pair<PaperStyle, String>, factory: (TagConsumer<Unit>) -> T, block: MobileStepperElementBuilder<T>.() -> Unit)
    = child(MobileStepperElementBuilder(mobileStepperComponent, classMap.toList(), factory).apply(block).create())
