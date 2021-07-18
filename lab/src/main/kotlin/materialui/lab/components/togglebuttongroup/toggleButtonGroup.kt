package materialui.lab.components.togglebuttongroup

import materialui.components.StandardProps
import materialui.lab.components.togglebuttongroup.enums.ToggleButtonGroupStyle
import org.w3c.dom.events.Event
import react.ComponentType
import react.RBuilder

@JsModule("@material-ui/lab/ToggleButtonGroup")
@JsNonModule
private external val toggleButtonGroupModule: dynamic

external interface ToggleButtonGroupProps : StandardProps {
    var exclusive: Boolean?
    var onChange: (Event, Any?) -> Unit
    var value: Any?
}

@Suppress("UnsafeCastFromDynamic")
private val toggleButtonGroupComponent: ComponentType<ToggleButtonGroupProps> = toggleButtonGroupModule.default

fun RBuilder.toggleButtonGroup(vararg classMap: Pair<ToggleButtonGroupStyle, String>, block: ToggleButtonGroupElementBuilder.() -> Unit)
    = child(ToggleButtonGroupElementBuilder(toggleButtonGroupComponent, classMap.toList()).apply(block).create())
