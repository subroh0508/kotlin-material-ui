package materialui.components.stepbutton

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.StepButton
import materialui.components.buttonbase.ButtonBaseProps
import materialui.components.stepbutton.enums.StepButtonStyle
import react.RBuilder
import react.ReactElement

external interface StepButtonProps : ButtonBaseProps {
    var active: Boolean?
    var alternativeLabel: Boolean?
    var completed: Boolean?
    var icon: ReactElement?
    var last: Boolean?
    var optional: ReactElement?
    var orientation: String?
}

fun RBuilder.stepButton(vararg classMap: Pair<StepButtonStyle, String>, block: StepButtonElementBuilder<BUTTON>.() -> Unit) {
    child(StepButtonElementBuilder(StepButton, classMap.toList()) { BUTTON(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.stepButton(vararg classMap: Pair<StepButtonStyle, String>, factory: (TagConsumer<Unit>) -> T, block: StepButtonElementBuilder<T>.() -> Unit) {
    child(StepButtonElementBuilder(StepButton, classMap.toList(), factory).apply(block).create())
}