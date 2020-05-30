package materialui.components.filledinput

import materialui.FilledInput
import materialui.components.filledinput.enums.FilledInputStyle
import materialui.components.inputbase.InputBaseProps
import react.RBuilder

external interface FilledInputProps : InputBaseProps {
    var disableUnderline: Boolean?
}

fun RBuilder.filledInput(vararg classMap: Pair<FilledInputStyle, String>, block: FilledInputElementBuilder.() -> Unit)
    = child(FilledInputElementBuilder(FilledInput, classMap.toList()).apply(block).create())
