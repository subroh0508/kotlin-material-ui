package materialui.components.buttongroup

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.ButtonGroup
import materialui.components.StandardProps
import materialui.components.buttongroup.enums.ButtonGroupStyle
import react.RBuilder

external interface ButtonGroupProps : StandardProps {
    var color: String?
    var disabled: Boolean?
    var disableRipple: Boolean?
    var disableTouchRipple: Boolean?
    var fullWidth: Boolean?
    var orientation: String?
    var size: String?
    var variant: String?
}

fun RBuilder.buttonGroup(vararg classMap: Pair<ButtonGroupStyle, String>, block: ButtonGroupElementBuilder<DIV>.() -> Unit)
    = child(ButtonGroupElementBuilder(ButtonGroup, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.buttonGroup(vararg classMap: Pair<ButtonGroupStyle, String>, factory: (TagConsumer<Unit>) -> T, block: ButtonGroupElementBuilder<T>.() -> Unit)
    = child(ButtonGroupElementBuilder(ButtonGroup, classMap.toList(), factory).apply(block).create())

