package materialui.components.steplabel

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/StepLabel")
private external val stepLabelModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val stepLabelComponent: RComponent<RProps, RState> = stepLabelModule.default

fun RBuilder.stepLabel(block: StepLabelElementBuilder.() -> Unit)
    = child(StepLabelElementBuilder(stepLabelComponent).apply(block).create())
