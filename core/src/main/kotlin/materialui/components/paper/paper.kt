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

fun RBuilder.paper(vararg classMap: Pair<PaperStyle, String>, block: PaperElementBuilder<DIV, PaperProps>.() -> Unit) {
    child(paperElement(classMap.toList(), block))
}
fun <T: Tag, P: PaperProps> RBuilder.paper(vararg classMap: Pair<PaperStyle, String>, factory: (TagConsumer<Unit>) -> T, block: PaperElementBuilder<T, P>.() -> Unit) {
    child(paperElement(classMap.toList(), factory, block))
}
internal fun paperElement(
    classMap: List<Pair<PaperStyle, String>> = listOf(),
    block: PaperElementBuilder<DIV, PaperProps>.() -> Unit
) = PaperElementBuilder(Paper, classMap) { DIV(mapOf(), it) }.apply(block).create()

internal fun <T: Tag, P: PaperProps> paperElement(
    classMap: List<Pair<PaperStyle, String>> = listOf(),
    factory: (TagConsumer<Unit>) -> T,
    block: PaperElementBuilder<T, P>.() -> Unit
) = PaperElementBuilder<T, P>(Paper, classMap, factory).apply(block).create()
