package materialui.components.stepconnector

import materialui.components.StandardProps
import materialui.components.stepconnector.enums.StepConnectorStyle
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/StepConnector")
private external val stepConnectorModule: dynamic

external interface StepConnectorProps : StandardProps {
    var active: Boolean?
    var alternativeLabel: Boolean?
    var completed: Boolean?
    var disabled: Boolean?
    var index: Number?
    var orientation: String?
}

@Suppress("UnsafeCastFromDynamic")
private val stepConnectorComponent: RClass<StepConnectorProps> = stepConnectorModule.default

fun RBuilder.stepConnector(vararg classMap: Pair<StepConnectorStyle, String>, block: StepConnectorElementBuilder.() -> Unit)
    = child(StepConnectorElementBuilder(stepConnectorComponent, classMap.toList()).apply(block).create())
