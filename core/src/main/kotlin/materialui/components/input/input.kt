package materialui.components.input

import materialui.Input
import materialui.components.input.enums.InputStyle
import materialui.components.inputbase.InputBaseProps
import react.RBuilder

external interface InputProps : InputBaseProps {
    var disableUnderline: Boolean?
}

fun RBuilder.input(vararg classMap: Pair<InputStyle, String>, block: InputElementBuilder<InputProps>.() -> Unit)
    = child(InputElementBuilder(Input, classMap.toList()).apply(block).create())
