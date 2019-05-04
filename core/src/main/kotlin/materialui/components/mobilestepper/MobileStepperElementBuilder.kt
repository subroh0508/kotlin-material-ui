package materialui.components.mobilestepper

import kotlinext.js.jsObject
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.getValue
import materialui.components.mobilestepper.enums.MobileStepperPosition
import materialui.components.mobilestepper.enums.MobileStepperVariant
import materialui.components.paper.PaperElementBuilder
import materialui.components.setValue
import react.*

class MobileStepperElementBuilder<T: Tag> internal constructor(
    type: RClass<MobileStepperProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : PaperElementBuilder<T, MobileStepperProps>(type, classMap, factory) {

    var Tag.activeStep: Number? by materialProps
    var Tag.backButton: ReactElement? by materialProps
    var Tag.LinearProgressProps: RProps? by materialProps
    var Tag.nextButton: ReactElement? by materialProps
    var Tag.position: MobileStepperPosition? by materialProps
    var Tag.steps: Number? by materialProps
    var Tag.variant: MobileStepperVariant? by materialProps

    fun Tag.backButton(block: RBuilder.() -> Unit) { backButton = buildElement(block) }
    fun <P: RProps> Tag.linearProgressProps(block: P.() -> Unit) { LinearProgressProps = jsObject(block) }
    fun Tag.nextButton(block: RBuilder.() -> Unit) { nextButton = buildElement(block) }
}