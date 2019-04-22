package materialui.components.stepicon

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/StepIcon")
private external val stepIconModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val stepIconComponent: RComponent<RProps, RState> = stepIconModule.default

fun RBuilder.stepIcon(block: StepIconElementBuilder.() -> Unit)
    = child(StepIconElementBuilder(stepIconComponent).apply(block).create())
