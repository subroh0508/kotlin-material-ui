package materialui.components.iconbutton

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.buttonbase.ButtonBaseProps
import materialui.components.iconbutton.enums.IconButtonStyle
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/IconButton")
private external val iconButtonModule: dynamic

external interface IconButtonProps : ButtonBaseProps {
    var color: String?
}

@Suppress("UnsafeCastFromDynamic")
private val iconButtonComponent: RClass<IconButtonProps> = iconButtonModule.default

fun RBuilder.iconButton(vararg classMap: Pair<IconButtonStyle, String>, block: IconButtonElementBuilder<BUTTON>.() -> Unit)
    = child(IconButtonElementBuilder(iconButtonComponent, classMap.toList()) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.iconButton(vararg classMap: Pair<IconButtonStyle, String>, factory: (TagConsumer<Unit>) -> T, block: IconButtonElementBuilder<T>.() -> Unit)
    = child(IconButtonElementBuilder(iconButtonComponent, classMap.toList(), factory).apply(block).create())