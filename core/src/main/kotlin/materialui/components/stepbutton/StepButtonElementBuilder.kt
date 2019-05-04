package materialui.components.stepbutton

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.buttonbase.ButtonBaseElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.components.step.enums.StepOrientation
import react.RBuilder
import react.RClass
import react.ReactElement
import react.buildElement

class StepButtonElementBuilder<T: Tag> internal constructor(
    type: RClass<StepButtonProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : ButtonBaseElementBuilder<T, StepButtonProps>(type, classMap, factory) {

    var Tag.active: Boolean? by materialProps
    var Tag.alternativeLabel: Boolean? by materialProps
    var Tag.completed: Boolean? by materialProps
    var Tag.icon: ReactElement? by materialProps
    var Tag.last: Boolean? by materialProps
    var Tag.optional: ReactElement? by materialProps
    var Tag.orientation: StepOrientation? by materialProps

    fun Tag.icon(block: RBuilder.() -> Unit) { icon = buildElement(block) }
    fun Tag.optional(block: RBuilder.() -> Unit) { optional = buildElement(block) }
}