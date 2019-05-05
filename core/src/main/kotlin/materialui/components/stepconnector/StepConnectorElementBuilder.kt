package materialui.components.stepconnector

import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.components.step.enums.StepOrientation
import materialui.components.stepconnector.enums.StepConnectorStyle
import react.RClass

class StepConnectorElementBuilder internal constructor(
    type: RClass<StepConnectorProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, StepConnectorProps>(type, classMap, { DIV(mapOf(), it) }) {
    fun Tag.classes(vararg classMap: Pair<StepConnectorStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.active: Boolean? by materialProps
    var Tag.alternativeLabel: Boolean? by materialProps
    var Tag.completed: Boolean? by materialProps
    var Tag.disabled: Boolean? by materialProps
    var Tag.index: Number? by materialProps
    var Tag.orientation: StepOrientation? by materialProps
}