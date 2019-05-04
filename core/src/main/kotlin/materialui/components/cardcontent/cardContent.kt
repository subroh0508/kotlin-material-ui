package materialui.components.cardcontent

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/CardContent")
private external val cardContentModule: dynamic

external interface CardContentProps : StandardProps

@Suppress("UnsafeCastFromDynamic")
private val cardContentComponent: RClass<CardContentProps> = cardContentModule.default

fun RBuilder.cardContent(rootStyle: String? = null, block: CardContentElementBuilder<DIV>.() -> Unit)
    = child(CardContentElementBuilder(cardContentComponent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.cardContent(rootStyle: String? = null, factory: (TagConsumer<Unit>) -> T, block: CardContentElementBuilder<T>.() -> Unit)
    = child(CardContentElementBuilder(cardContentComponent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it }), factory).apply(block).create())
