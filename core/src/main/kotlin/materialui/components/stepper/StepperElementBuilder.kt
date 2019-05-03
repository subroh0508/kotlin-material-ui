package materialui.components.stepper

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.getValue
import materialui.components.paper.PaperElementBuilder
import materialui.components.setValue
import materialui.components.step.enums.StepOrientation
import react.RBuilder
import react.RClass
import react.ReactElement
import react.buildElement

class StepperElementBuilder<T: Tag> internal constructor(
    type: RClass<StepperProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : PaperElementBuilder<T, StepperProps>(type, classMap, factory) {

    var Tag.activeStep: Number? by materialProps
    var Tag.alternativeLabel: Boolean? by materialProps
    var Tag.connector: ReactElement? by materialProps
    var Tag.nonLinear: Boolean? by materialProps
    var Tag.orientation: StepOrientation? by materialProps

    fun Tag.connector(block: RBuilder.() -> Unit) { connector = buildElement(block) }
}