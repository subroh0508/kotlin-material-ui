package materialui.components.button

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.Button
import materialui.components.button.enums.ButtonStyle
import materialui.components.buttonbase.ButtonBaseProps
import react.RBuilder
import react.ReactElement

external interface ButtonProps : ButtonBaseProps {
    var color: String?
    var endIcon: ReactElement?
    var fullWidth: Boolean?
    var href: String?
    var size: String?
    var startIcon: ReactElement?
    var variant: String?
}

fun RBuilder.button(vararg classMap: Pair<ButtonStyle, String>, block: ButtonElementBuilder<BUTTON>.() -> Unit)
    = child(ButtonElementBuilder(Button, classMap.toList()) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.button(vararg classMap: Pair<ButtonStyle, String>, factory: (TagConsumer<Unit>) -> T, block: ButtonElementBuilder<T>.() -> Unit)
    = child(ButtonElementBuilder(Button, classMap.toList(), factory).apply(block).create())

