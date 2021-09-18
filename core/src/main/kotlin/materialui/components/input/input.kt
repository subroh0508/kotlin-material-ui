package materialui.components.input

import materialui.Input
import materialui.components.input.enums.InputStyle
import materialui.components.inputbase.InputBaseProps
import react.RBuilder

external interface InputProps : InputBaseProps {
    var disableUnderline: Boolean?
}

fun RBuilder.input(vararg classMap: Pair<InputStyle, String>, block: InputElementBuilder<InputProps>.() -> Unit)
    = child(inputElement(classMap.toList(), block))

internal fun inputElement(
    classMap: List<Pair<InputStyle, String>> = listOf(),
    block: InputElementBuilder<InputProps>.() -> Unit
) = InputElementBuilder(Input, classMap).apply(block).create()
