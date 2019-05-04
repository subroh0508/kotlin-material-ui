package materialui.components.cardactionarea

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.buttonbase.ButtonBaseProps
import materialui.components.buttonbase.enums.ButtonBaseStyle
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/CardActionArea")
private external val cardActionAreaModule: dynamic

external interface CardActionAreaProps : ButtonBaseProps

@Suppress("UnsafeCastFromDynamic")
private val cardActionAreaComponent: RClass<CardActionAreaProps> = cardActionAreaModule.default

fun RBuilder.cardActionArea(vararg classMap: Pair<ButtonBaseStyle, String>, block: CardActionAreaElementBuilder<BUTTON>.() -> Unit)
    = child(CardActionAreaElementBuilder(cardActionAreaComponent, classMap.toList()) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.cardActionArea(vararg classMap: Pair<ButtonBaseStyle, String>, factory: (TagConsumer<Unit>) -> T, block: CardActionAreaElementBuilder<T>.() -> Unit)
    = child(CardActionAreaElementBuilder(cardActionAreaComponent, classMap.toList(), factory).apply(block).create())
