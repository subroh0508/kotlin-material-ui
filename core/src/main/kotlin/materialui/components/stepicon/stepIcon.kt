package materialui.components.stepicon

import materialui.StepIcon
import materialui.components.StandardProps
import materialui.components.stepicon.enums.StepIconStyle
import react.RBuilder
import react.ReactElement

external interface StepIconProps : StandardProps {
    var active: Boolean?
    var completed: Boolean?
    var error: Boolean?
    var icon: ReactElement?
}

fun RBuilder.stepIcon(vararg classMap: Pair<StepIconStyle, String>, block: StepIconElementBuilder.() -> Unit) {
    child(StepIconElementBuilder(StepIcon, classMap.toList()).apply(block).create())
}