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

fun RBuilder.iconButton(vararg classMap: Pair<IconButtonStyle, String>, block: IconButtonElementBuilder<BUTTON>.() -> Unit)
    = child(IconButtonElementBuilder(IconButton, classMap.toList()) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.iconButton(vararg classMap: Pair<IconButtonStyle, String>, factory: (TagConsumer<Unit>) -> T, block: IconButtonElementBuilder<T>.() -> Unit)
    = child(IconButtonElementBuilder(IconButton, classMap.toList(), factory).apply(block).create())
