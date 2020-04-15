package materialui.components.button

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.button.enums.ButtonColor
import materialui.components.button.enums.ButtonSize
import materialui.components.button.enums.ButtonStyle
import materialui.components.button.enums.ButtonVariant
import materialui.components.buttonbase.ButtonBaseProps
import materialui.components.getValue
import materialui.components.setValue
import react.RBuilder
import react.RClass
import react.ReactElement

@JsModule("@material-ui/core/Button")
private external val buttonModule: dynamic

external interface ButtonProps : ButtonBaseProps {
    var color: String?
    var endIcon: ReactElement?
    var fullWidth: Boolean?
    var href: String?
    var size: String?
    var startIcon: ReactElement?
    var variant: String?
}

@Suppress("UnsafeCastFromDynamic")
private val buttonComponent: RClass<ButtonProps> = buttonModule.default

fun RBuilder.button(vararg classMap: Pair<ButtonStyle, String>, block: ButtonElementBuilder<BUTTON>.() -> Unit)
    = child(ButtonElementBuilder(buttonComponent, classMap.toList()) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.button(vararg classMap: Pair<ButtonStyle, String>, factory: (TagConsumer<Unit>) -> T, block: ButtonElementBuilder<T>.() -> Unit)
    = child(ButtonElementBuilder(buttonComponent, classMap.toList(), factory).apply(block).create())

