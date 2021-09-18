package materialui.components.iconbutton

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.IconButton
import materialui.components.buttonbase.ButtonBaseProps
import materialui.components.iconbutton.enums.IconButtonStyle
import react.RBuilder

external interface IconButtonProps : ButtonBaseProps {
    var color: String?
    var edge: String?
}

fun RBuilder.iconButton(vararg classMap: Pair<IconButtonStyle, String>, block: IconButtonElementBuilder<BUTTON>.() -> Unit) {
    child(iconButtonElement(classMap.toList(), block))
}
fun <T: Tag> RBuilder.iconButton(vararg classMap: Pair<IconButtonStyle, String>, factory: (TagConsumer<Unit>) -> T, block: IconButtonElementBuilder<T>.() -> Unit) {
    child(iconButtonElement(classMap.toList(), factory, block))
}
internal fun iconButtonElement(
    classMap: List<Pair<IconButtonStyle, String>> = listOf(),
    block: IconButtonElementBuilder<BUTTON>.() -> Unit
) = iconButtonElement(classMap, { BUTTON(mapOf(), it) }, block)

internal fun <T: Tag> iconButtonElement(
    classMap: List<Pair<IconButtonStyle, String>> = listOf(),
    factory: (TagConsumer<Unit>) -> T,
    block: IconButtonElementBuilder<T>.() -> Unit
) = IconButtonElementBuilder(IconButton, classMap, factory).apply(block).create()
