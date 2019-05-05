package materialui.components.outlinedinput

import kotlinx.html.Tag
import materialui.components.getValue
import materialui.components.inputbase.InputBaseElementBuilder
import materialui.components.outlinedinput.enums.OutlinedInputStyle
import materialui.components.setValue
import react.RClass

class OutlinedInputElementBuilder internal constructor(
    type: RClass<OutlinedInputProps>,
    classMap: List<Pair<Enum<*>, String>>
) : InputBaseElementBuilder<OutlinedInputProps>(type, classMap) {
    fun Tag.classes(vararg classMap: Pair<OutlinedInputStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.labelWidth: Number? by materialProps
    var Tag.notched: Boolean? by materialProps
}