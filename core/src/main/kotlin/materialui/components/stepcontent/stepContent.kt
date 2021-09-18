package materialui.components.stepcontent

import materialui.StepContent
import materialui.components.StandardProps
import materialui.components.stepcontent.enums.StepContentStyle
import materialui.reacttransiton.RTransitionProps
import react.RBuilder

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

fun RBuilder.stepContent(vararg classMap: Pair<StepContentStyle, String>, block: StepContentElementBuilder.() -> Unit) {
    child(StepContentElementBuilder(StepContent, classMap.toList()).apply(block).create())
}