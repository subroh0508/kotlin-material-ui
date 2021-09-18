package materialui.components.cardactionarea

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.CardActionArea
import materialui.components.buttonbase.ButtonBaseProps
import materialui.components.buttonbase.enums.ButtonBaseStyle
import react.RBuilder

external interface CardActionAreaProps : ButtonBaseProps

fun RBuilder.cardActionArea(vararg classMap: Pair<ButtonBaseStyle, String>, block: CardActionAreaElementBuilder<BUTTON>.() -> Unit) {
    child(CardActionAreaElementBuilder(CardActionArea, classMap.toList()) { BUTTON(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.cardActionArea(vararg classMap: Pair<ButtonBaseStyle, String>, factory: (TagConsumer<Unit>) -> T, block: CardActionAreaElementBuilder<T>.() -> Unit) {
    child(CardActionAreaElementBuilder(CardActionArea, classMap.toList(), factory).apply(block).create())
}