package materialui.components.checkbox

import kotlinx.html.Tag
import materialui.components.checkbox.enums.CheckboxColor
import materialui.components.checkbox.enums.CheckboxStyle
import materialui.components.getValue
import materialui.components.internal.SwitchBaseElementBuilder
import materialui.components.setValue
import react.RClass
import react.ReactElement

class CheckboxElementBuilder internal constructor(
    type: RClass<CheckboxProps>,
    classMap: List<Pair<Enum<*>, String>>
) : SwitchBaseElementBuilder<CheckboxProps>(type, classMap) {
    fun Tag.classes(vararg classMap: Pair<CheckboxStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.color: CheckboxColor? by materialProps
    var Tag.indeterminate: Boolean? by materialProps
    var Tag.indeterminateIcon: ReactElement? by materialProps
    var Tag.value: String? by materialProps
}
