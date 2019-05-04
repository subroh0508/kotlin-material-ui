package materialui.components.checkbox

import materialui.components.checkbox.enums.CheckboxStyle
import materialui.components.internal.SwitchBaseProps
import react.*

@JsModule("@material-ui/core/Checkbox")
private external val checkboxModule: dynamic

external interface CheckboxProps : SwitchBaseProps {
    var color: String?
    var indeterminate: Boolean?
    var indeterminateIcon: ReactElement?
}

@Suppress("UnsafeCastFromDynamic")
private val checkboxComponent: RClass<CheckboxProps> = checkboxModule.default

fun RBuilder.checkbox(vararg classMap: Pair<CheckboxStyle, String>, block: CheckboxElementBuilder.() -> Unit)
    = child(CheckboxElementBuilder(checkboxComponent, classMap.toList()).apply(block).create())
