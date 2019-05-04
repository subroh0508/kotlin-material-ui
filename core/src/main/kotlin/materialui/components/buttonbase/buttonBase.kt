package materialui.components.buttonbase

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.buttonbase.enums.ButtonBaseStyle
import org.w3c.dom.events.Event
import react.RBuilder
import react.RClass
import react.RProps
import react.RRef

@JsModule("@material-ui/core/ButtonBase")
private external val buttonBaseModule: dynamic

external interface ButtonBaseProps : StandardProps {
    var buttonRef: RRef?
    var centerRipple: Boolean?
    var disabled: Boolean?
    var disableRipple: Boolean?
    var disableTouchRipple: Boolean?
    var focusRipple: Boolean?
    var focusVisibleClassName: String?
    var onFocusVisible: ((Event) -> Unit)?
    var touchRippleProps: RProps?
    var type: String?
}

@Suppress("UnsafeCastFromDynamic")
private val buttonBaseComponent: RClass<ButtonBaseProps> = buttonBaseModule.default

fun RBuilder.buttonBase(vararg classMap: Pair<ButtonBaseStyle, String>, block: ButtonBaseElementBuilder<BUTTON, ButtonBaseProps>.() -> Unit)
    = child(ButtonBaseElementBuilder(buttonBaseComponent, classMap.toList()) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.buttonBase(vararg classMap: Pair<ButtonBaseStyle, String>, factory: (TagConsumer<Unit>) -> T, block: ButtonBaseElementBuilder<T, ButtonBaseProps>.() -> Unit)
    = child(ButtonBaseElementBuilder(buttonBaseComponent, classMap.toList(), factory).apply(block).create())
