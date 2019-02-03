package components.stepcontent

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/StepContent")
private external val stepContentModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val stepContentComponent: RComponent<RProps, RState> = stepContentModule.default

fun RBuilder.stepContent(block: StepContentElementBuilder.() -> Unit)
    = child(StepContentElementBuilder(stepContentComponent).apply(block).create())
