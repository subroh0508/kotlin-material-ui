package components.step

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Step")
private external val stepModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val stepComponent: RComponent<RProps, RState> = stepModule.default

fun RBuilder.step(block: StepElementBuilder.() -> Unit)
    = child(StepElementBuilder(stepComponent).apply(block).create())
