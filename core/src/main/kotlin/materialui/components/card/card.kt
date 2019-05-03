package materialui.components.card

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.paper.PaperProps
import materialui.components.paper.enums.PaperStyle
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/Card")
private external val cardModule: dynamic

external interface CardProps : PaperProps {
    var raised: Boolean?
}

@Suppress("UnsafeCastFromDynamic")
private val cardComponent: RClass<CardProps> = cardModule.default

fun RBuilder.card(vararg classMap: Pair<PaperStyle, String>, block: CardElementBuilder<DIV>.() -> Unit)
    = child(CardElementBuilder(cardComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.card(vararg classMap: Pair<PaperStyle, String>, factory: (TagConsumer<Unit>) -> T, block: CardElementBuilder<T>.() -> Unit)
    = child(CardElementBuilder(cardComponent, classMap.toList(), factory).apply(block).create())
