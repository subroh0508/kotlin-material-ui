package materialui.components.buttonbase

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.ButtonBase
import materialui.components.StandardProps
import materialui.components.buttonbase.enums.ButtonBaseStyle
import org.w3c.dom.events.Event
import react.RBuilder
import react.PropsWithChildren
import react.RRef

external interface ButtonBaseProps : StandardProps {
    var buttonRef: RRef?
    var centerRipple: Boolean?
    var disabled: Boolean?
    var disableRipple: Boolean?
    var disableTouchRipple: Boolean?
    var focusRipple: Boolean?
    var focusVisibleClassName: String?
    var onFocusVisible: ((Event) -> Unit)?
    var touchRippleProps: PropsWithChildren?
    var type: String?
}

fun RBuilder.buttonBase(vararg classMap: Pair<ButtonBaseStyle, String>, block: ButtonBaseElementBuilder<BUTTON, ButtonBaseProps>.() -> Unit)
    = child(ButtonBaseElementBuilder(ButtonBase, classMap.toList()) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.buttonBase(vararg classMap: Pair<ButtonBaseStyle, String>, factory: (TagConsumer<Unit>) -> T, block: ButtonBaseElementBuilder<T, ButtonBaseProps>.() -> Unit)
    = child(ButtonBaseElementBuilder(ButtonBase, classMap.toList(), factory).apply(block).create())
