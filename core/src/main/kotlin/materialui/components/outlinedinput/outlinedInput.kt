package materialui.components.outlinedinput

import materialui.OutlinedInput
import materialui.components.inputbase.InputBaseProps
import materialui.components.outlinedinput.enums.OutlinedInputStyle
import react.*

external interface OutlinedInputProps : InputBaseProps {
    var labelWidth: Number?
    var notched: Boolean?
}

fun RBuilder.outlinedInput(vararg classMap: Pair<OutlinedInputStyle, String>, block: OutlinedInputElementBuilder.() -> Unit) {
    child(OutlinedInputElementBuilder(OutlinedInput, classMap.toList()).apply(block).create())
}