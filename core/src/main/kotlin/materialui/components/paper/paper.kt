package materialui.components.paper

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.Paper
import materialui.components.StandardProps
import materialui.components.paper.enums.PaperStyle
import react.RBuilder

external interface PaperProps : StandardProps {
    var elevation: Number?
    var square: Boolean?
}

fun RBuilder.paper(vararg classMap: Pair<PaperStyle, String>, block: PaperElementBuilder<DIV, PaperProps>.() -> Unit)
    = child(PaperElementBuilder(Paper, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag, P: PaperProps> RBuilder.paper(vararg classMap: Pair<PaperStyle, String>, factory: (TagConsumer<Unit>) -> T, block: PaperElementBuilder<T, P>.() -> Unit)
    = child(PaperElementBuilder<T, P>(Paper, classMap.toList(), factory).apply(block).create())
