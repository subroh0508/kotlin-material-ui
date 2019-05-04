package materialui.components.cardmedia

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.cardmedia.enums.CardMediaStyle
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/CardMedia")
private external val cardMediaModule: dynamic

external interface CardMediaProps : StandardProps {
    var image: String?
    var src: String?
    var style: Any?
}

@Suppress("UnsafeCastFromDynamic")
private val cardMediaComponent: RClass<CardMediaProps> = cardMediaModule.default

fun RBuilder.cardMedia(vararg classMap: Pair<CardMediaStyle, String>, block: CardMediaElementBuilder<DIV>.() -> Unit)
    = child(CardMediaElementBuilder(cardMediaComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.cardMedia(vararg classMap: Pair<CardMediaStyle, String>, factory: (TagConsumer<Unit>) -> T, block: CardMediaElementBuilder<T>.() -> Unit)
    = child(CardMediaElementBuilder(cardMediaComponent, classMap.toList(), factory).apply(block).create())
