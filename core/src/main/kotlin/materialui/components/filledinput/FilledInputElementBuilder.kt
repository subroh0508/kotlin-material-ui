package materialui.components.filledinput

import kotlinx.html.Tag
import materialui.components.filledinput.enums.FilledInputStyle
import materialui.components.getValue
import materialui.components.inputbase.InputBaseElementBuilder
import materialui.components.setValue
import react.RClass

class FilledInputElementBuilder internal constructor(
    type: RClass<FilledInputProps>,
    classMap: List<Pair<Enum<*>, String>>
) : InputBaseElementBuilder<FilledInputProps>(type, classMap) {
    fun Tag.classes(vararg classMap: Pair<FilledInputStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.disableUnderline: Boolean? by materialProps
}