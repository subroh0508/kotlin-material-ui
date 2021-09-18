package materialui.components.stepconnector

import materialui.StepConnector
import materialui.components.StandardProps
import materialui.components.stepconnector.enums.StepConnectorStyle
import react.RBuilder

external interface StepConnectorProps : StandardProps {
    var active: Boolean?
    var alternativeLabel: Boolean?
    var completed: Boolean?
    var disabled: Boolean?
    var index: Number?
    var orientation: String?
}

fun RBuilder.stepConnector(vararg classMap: Pair<StepConnectorStyle, String>, block: StepConnectorElementBuilder.() -> Unit) {
    child(StepConnectorElementBuilder(StepConnector, classMap.toList()).apply(block).create())
}