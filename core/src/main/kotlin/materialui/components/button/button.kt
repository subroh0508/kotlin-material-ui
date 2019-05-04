package materialui.components.button

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.button.enums.ButtonStyle
import materialui.components.buttonbase.ButtonBaseProps
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/Button")
private external val buttonModule: dynamic

external interface ButtonProps : ButtonBaseProps {
    var color: String?
    var fullWidth: Boolean?
    var href: String?
    var mini: Boolean?
    var size: String?
    var variant: String?
}

@Suppress("UnsafeCastFromDynamic")
private val buttonComponent: RClass<ButtonProps> = buttonModule.default

fun RBuilder.button(vararg classMap: Pair<ButtonStyle, String>, block: ButtonElementBuilder<BUTTON>.() -> Unit)
    = child(ButtonElementBuilder(buttonComponent, classMap.toList()) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.button(vararg classMap: Pair<ButtonStyle, String>, factory: (TagConsumer<Unit>) -> T, block: ButtonElementBuilder<T>.() -> Unit)
    = child(ButtonElementBuilder(buttonComponent, classMap.toList(), factory).apply(block).create())

