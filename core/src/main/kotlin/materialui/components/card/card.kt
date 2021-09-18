package materialui.components.card

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.Card
import materialui.components.paper.PaperProps
import materialui.components.paper.enums.PaperStyle
import react.RBuilder

external interface CardProps : PaperProps {
    var raised: Boolean?
}

fun RBuilder.card(vararg classMap: Pair<PaperStyle, String>, block: CardElementBuilder<DIV>.() -> Unit) {
    child(CardElementBuilder(Card, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.card(vararg classMap: Pair<PaperStyle, String>, factory: (TagConsumer<Unit>) -> T, block: CardElementBuilder<T>.() -> Unit) {
    child(CardElementBuilder(Card, classMap.toList(), factory).apply(block).create())
}