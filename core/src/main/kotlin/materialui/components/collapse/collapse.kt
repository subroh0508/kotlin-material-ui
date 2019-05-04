package materialui.components.collapse

import kotlinx.css.LinearDimension
import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.collapse.enums.CollapseStyle
import materialui.reacttransiton.RTransitionProps
import materialui.styles.LinearDimensionDelegate
import materialui.styles.muitheme.MuiTheme
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/Collapse")
private external val collapseModule: dynamic

external interface CollapseProps : RTransitionProps, StandardProps {
    var style: Any?
    var theme: MuiTheme?
}

var CollapseProps.collapsedHeight: LinearDimension? by LinearDimensionDelegate

@Suppress("UnsafeCastFromDynamic")
private val collapseComponent: RClass<CollapseProps> = collapseModule.default

fun RBuilder.collapse(vararg classMap: Pair<CollapseStyle, String>, block: CollapseElementBuilder<DIV>.() -> Unit)
    = child(CollapseElementBuilder(collapseComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.collapse(vararg classMap: Pair<CollapseStyle, String>, factory: (TagConsumer<Unit>) -> T, block: CollapseElementBuilder<T>.() -> Unit)
    = child(CollapseElementBuilder(collapseComponent, classMap.toList(), factory).apply(block).create())
