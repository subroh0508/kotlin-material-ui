package materialui.components.step

import materialui.components.StandardProps
import materialui.components.step.enums.StepStyle
import react.RBuilder
import react.RClass
import react.ReactElement

@JsModule("@material-ui/core/Step")
private external val stepModule: dynamic

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

@Suppress("UnsafeCastFromDynamic")
private val stepComponent: RClass<StepProps> = stepModule.default

fun RBuilder.step(vararg classMap: Pair<StepStyle, String>, block: StepElementBuilder.() -> Unit)
    = child(StepElementBuilder(stepComponent, classMap.toList()).apply(block).create())
