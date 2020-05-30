package materialui.components.cardcontent

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.CardContent
import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.RBuilder

external interface CardContentProps : StandardProps

fun RBuilder.cardContent(rootStyle: String? = null, block: CardContentElementBuilder<DIV>.() -> Unit)
    = child(CardContentElementBuilder(CardContent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.cardContent(rootStyle: String? = null, factory: (TagConsumer<Unit>) -> T, block: CardContentElementBuilder<T>.() -> Unit)
    = child(CardContentElementBuilder(CardContent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it }), factory).apply(block).create())
