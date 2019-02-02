package components.cardcontent

import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/CardContent")
private external val cardContentModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val cardContentComponent: RComponent<RProps, RState> = cardContentModule.default

fun RBuilder.cardContent(block: CardContentElementBuilder<DIV>.() -> Unit)
    = child(CardContentElementBuilder(cardContentComponent, DIV::class) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.cardContent(tag: KClass<T>, block: CardContentElementBuilder<T>.() -> Unit)
    = child(CardContentElementBuilder(cardContentComponent, tag).apply(block).create())
