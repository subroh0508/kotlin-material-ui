package materialui.components.buttongroup

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.buttongroup.enums.ButtonGroupStyle
import org.w3c.dom.events.Event
import react.RBuilder
import react.RClass
import react.RProps

@JsModule("@material-ui/core/ButtonGroup")
private external val buttonGroupModule: dynamic

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

@Suppress("UnsafeCastFromDynamic")
private val buttonGroupComponent: RClass<ButtonGroupProps> = buttonGroupModule.default

fun RBuilder.buttonGroup(vararg classMap: Pair<ButtonGroupStyle, String>, block: ButtonGroupElementBuilder<DIV>.() -> Unit)
    = child(ButtonGroupElementBuilder(buttonGroupComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.buttonGroup(vararg classMap: Pair<ButtonGroupStyle, String>, factory: (TagConsumer<Unit>) -> T, block: ButtonGroupElementBuilder<T>.() -> Unit)
    = child(ButtonGroupElementBuilder(buttonGroupComponent, classMap.toList(), factory).apply(block).create())

