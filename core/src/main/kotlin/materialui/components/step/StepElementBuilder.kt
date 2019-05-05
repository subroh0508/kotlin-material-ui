package materialui.components.step

import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.components.step.enums.StepOrientation
import materialui.components.step.enums.StepStyle
import react.RBuilder
import react.RClass
import react.ReactElement
import react.buildElement

class StepElementBuilder internal constructor(
    type: RClass<StepProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, StepProps>(type, classMap, { DIV(mapOf(), it) }) {
    fun Tag.classes(vararg classMap: Pair<StepStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.active: Boolean? by materialProps
    var Tag.alternativeLabel: Boolean? by materialProps
    var Tag.completed: Boolean? by materialProps
    var Tag.connector: ReactElement? by materialProps
    var Tag.disabled: Boolean? by materialProps
    var Tag.index: Number? by materialProps
    var Tag.last: Boolean? by materialProps
    var Tag.orientation: StepOrientation? by materialProps

    fun Tag.connector(block: RBuilder.() -> Unit) { connector = buildElement(block) }
}