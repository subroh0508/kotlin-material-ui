package materialui.lab.components.togglebutton

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.buttonbase.ButtonBaseProps
import materialui.lab.components.togglebutton.enums.ToggleButtonStyle
import react.ComponentType
import react.RBuilder

@JsModule("@material-ui/lab/ToggleButton")
@JsNonModule
private external val toggleButtonModule: dynamic

external interface ToggleButtonProps : ButtonBaseProps {
    var disableFocusRipple: Boolean?
    var selected: Boolean?
    var orientation: String?
    var size: String?
    var value: Any?
}

@Suppress("UnsafeCastFromDynamic")
private val toggleButtonComponent: ComponentType<ToggleButtonProps> = toggleButtonModule.default

fun RBuilder.toggleButton(vararg classMap: Pair<ToggleButtonStyle, String>, block: ToggleButtonElementBuilder<BUTTON>.() -> Unit) {
    child(ToggleButtonElementBuilder(toggleButtonComponent, classMap.toList()) { BUTTON(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.toggleButton(vararg classMap: Pair<ToggleButtonStyle, String>, factory: (TagConsumer<Unit>) -> T, block: ToggleButtonElementBuilder<T>.() -> Unit) {
    child(ToggleButtonElementBuilder(toggleButtonComponent, classMap.toList(), factory).apply(block).create())
}