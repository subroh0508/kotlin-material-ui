package materialui.components.card

import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/Card")
private external val cardModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val cardComponent: RComponent<RProps, RState> = cardModule.default

fun RBuilder.card(block: CardElementBuilder<DIV>.() -> Unit)
    = child(CardElementBuilder(cardComponent, DIV::class) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.card(tag: KClass<T>, block: CardElementBuilder<T>.() -> Unit)
    = child(CardElementBuilder(cardComponent, tag).apply(block).create())
