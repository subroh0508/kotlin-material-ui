package materialui.components.stepcontent

import materialui.components.StandardProps
import materialui.components.stepcontent.enums.StepContentStyle
import materialui.reacttransiton.RTransitionProps
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/StepContent")
private external val stepContentModule: dynamic

external interface StepContentProps : StandardProps {
    var active: Boolean?
    var alternativeLabel: Boolean?
    var completed: Boolean?
    var last: Boolean?
    var optional: Boolean?
    var orientation: String?
    var TransitionComponent: dynamic
    var transitionDuration: dynamic
    var TransitionProps: RTransitionProps?
}

@Suppress("UnsafeCastFromDynamic")
private val stepContentComponent: RClass<StandardProps> = stepContentModule.default

fun RBuilder.stepContent(vararg classMap: Pair<StepContentStyle, String>, block: StepContentElementBuilder.() -> Unit)
    = child(StepContentElementBuilder(stepContentComponent, classMap.toList()).apply(block).create())
