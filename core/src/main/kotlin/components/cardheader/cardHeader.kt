package components.cardheader

import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/CardHeader")
private external val cardHeaderModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val cardHeaderComponent: RComponent<RProps, RState> = cardHeaderModule.default

fun RBuilder.cardHeader(block: CardHeaderElementBuilder<DIV>.() -> Unit)
    = child(CardHeaderElementBuilder(cardHeaderComponent, DIV::class) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.cardHeader(tag: KClass<T>, block: CardHeaderElementBuilder<T>.() -> Unit)
    = child(CardHeaderElementBuilder(cardHeaderComponent, tag).apply(block).create())