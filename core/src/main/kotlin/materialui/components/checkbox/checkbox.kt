package materialui.components.checkbox

import materialui.Checkbox
import materialui.components.checkbox.enums.CheckboxStyle
import materialui.components.internal.SwitchBaseProps
import react.*

external interface CheckboxProps : SwitchBaseProps {
    var color: String?
    var indeterminate: Boolean?
    var indeterminateIcon: ReactElement?
}

fun RBuilder.checkbox(vararg classMap: Pair<CheckboxStyle, String>, block: CheckboxElementBuilder.() -> Unit)
    = child(CheckboxElementBuilder(Checkbox, classMap.toList()).apply(block).create())
