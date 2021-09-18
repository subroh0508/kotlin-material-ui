package materialui.components.hidden

import materialui.Hidden
import materialui.components.StandardProps
import react.RBuilder

external interface HiddenProps : StandardProps {
    var implementation: String?
    var initialWidth: String?
    var lgDown: Boolean?
    var lgUp: Boolean?
    var mdDown: Boolean?
    var mdUp: Boolean?
    var only: Any?
    var smDown: Boolean?
    var smUp: Boolean?
    var xlDown: Boolean?
    var xlUp: Boolean?
    var xsDown: Boolean?
    var xsUp: Boolean?
}

fun RBuilder.hidden(block: HiddenElementBuilder.() -> Unit) {
    child(HiddenElementBuilder(Hidden).apply(block).create())
}