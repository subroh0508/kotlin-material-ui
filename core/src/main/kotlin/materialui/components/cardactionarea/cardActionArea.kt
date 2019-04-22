package materialui.components.cardactionarea

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/CardActionArea")
private external val cardActionAreaModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val cardActionAreaComponent: RComponent<RProps, RState> = cardActionAreaModule.default

fun RBuilder.cardActionArea(block: CardActionAreaElementBuilder<BUTTON>.() -> Unit)
    = child(CardActionAreaElementBuilder(cardActionAreaComponent, BUTTON::class) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.cardActionArea(tag: KClass<T>, block: CardActionAreaElementBuilder<T>.() -> Unit)
    = child(CardActionAreaElementBuilder(cardActionAreaComponent, tag).apply(block).create())
