package materialui.components.cardmedia

import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/CardMedia")
private external val cardMediaModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val cardMediaComponent: RComponent<RProps, RState> = cardMediaModule.default

fun RBuilder.cardMedia(block: CardMediaElementBuilder<DIV>.() -> Unit)
    = child(CardMediaElementBuilder(cardMediaComponent, DIV::class) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.cardMedia(tag: KClass<T>, block: CardMediaElementBuilder<T>.() -> Unit)
    = child(CardMediaElementBuilder(cardMediaComponent, tag).apply(block).create())
