package components.stepconnector

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/StepConnector")
private external val stepConnectorModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val stepConnectorComponent: RComponent<RProps, RState> = stepConnectorModule.default

fun RBuilder.stepConnector(block: StepConnectorElementBuilder.() -> Unit)
    = child(StepConnectorElementBuilder(stepConnectorComponent).apply(block).create())
