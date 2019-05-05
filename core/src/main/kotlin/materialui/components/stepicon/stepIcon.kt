package materialui.components.stepicon

import materialui.components.StandardProps
import materialui.components.stepicon.enums.StepIconStyle
import react.RBuilder
import react.RClass
import react.ReactElement

@JsModule("@material-ui/core/StepIcon")
private external val stepIconModule: dynamic

external interface StepIconProps : StandardProps {
    var active: Boolean?
    var completed: Boolean?
    var error: Boolean?
    var icon: ReactElement?
}

@Suppress("UnsafeCastFromDynamic")
private val stepIconComponent: RClass<StepIconProps> = stepIconModule.default

fun RBuilder.stepIcon(vararg classMap: Pair<StepIconStyle, String>, block: StepIconElementBuilder.() -> Unit)
    = child(StepIconElementBuilder(stepIconComponent, classMap.toList()).apply(block).create())
