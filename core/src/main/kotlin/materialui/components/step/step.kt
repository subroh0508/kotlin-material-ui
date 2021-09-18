package materialui.components.step

import materialui.Step
import materialui.components.StandardProps
import materialui.components.step.enums.StepStyle
import react.RBuilder
import react.ReactElement

external interface StepProps : StandardProps {
    var active: Boolean?
    var alternativeLabel: Boolean?
    var completed: Boolean?
    var connector: ReactElement?
    var disabled: Boolean?
    var index: Number?
    var last: Boolean?
    var orientation: String?
}

fun RBuilder.step(vararg classMap: Pair<StepStyle, String>, block: StepElementBuilder.() -> Unit) {
    child(StepElementBuilder(Step, classMap.toList()).apply(block).create())
}