package materialui.components.steplabel

import materialui.StepLabel
import materialui.components.StandardProps
import materialui.components.stepicon.StepIconProps
import materialui.components.steplabel.enums.StepLabelStyle
import react.RBuilder
import react.ReactElement

external interface StepLabelProps : StandardProps {
    var active: Boolean?
    var alternativeLabel: Boolean?
    var completed: Boolean?
    var disabled: Boolean?
    var error: Boolean?
    var icon: ReactElement?
    var last: Boolean?
    var optional: ReactElement?
    var orientation: String?
    var StepIconComponent: dynamic
    var StepIconProps: StepIconProps?
}

fun RBuilder.stepLabel(vararg classMap: Pair<StepLabelStyle, String>, block: StepLabelElementBuilder.() -> Unit) {
    child(StepLabelElementBuilder(StepLabel, classMap.toList()).apply(block).create())
}