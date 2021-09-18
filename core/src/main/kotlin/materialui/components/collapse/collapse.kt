package materialui.components.collapse

import kotlinx.css.LinearDimension
import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.Collapse
import materialui.components.StandardProps
import materialui.components.collapse.enums.CollapseStyle
import materialui.reacttransiton.RTransitionProps
import materialui.styles.LinearDimensionDelegate
import materialui.styles.muitheme.MuiTheme
import react.RBuilder

external interface CollapseProps : RTransitionProps, StandardProps {
    var style: Any?
    var theme: MuiTheme?
}

var CollapseProps.collapsedHeight: LinearDimension? by LinearDimensionDelegate

fun RBuilder.collapse(vararg classMap: Pair<CollapseStyle, String>, block: CollapseElementBuilder<DIV>.() -> Unit) {
    child(CollapseElementBuilder(Collapse, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.collapse(vararg classMap: Pair<CollapseStyle, String>, factory: (TagConsumer<Unit>) -> T, block: CollapseElementBuilder<T>.() -> Unit) {
    child(CollapseElementBuilder(Collapse, classMap.toList(), factory).apply(block).create())
}