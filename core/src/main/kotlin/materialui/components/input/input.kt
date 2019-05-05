package materialui.components.input

import materialui.components.input.enums.InputStyle
import materialui.components.inputbase.InputBaseProps
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/Input")
private external val inputModule: dynamic

external interface InputProps : InputBaseProps {
    var disableUnderline: Boolean?
}

@Suppress("UnsafeCastFromDynamic")
private val inputComponent: RClass<InputProps> = inputModule.default

fun RBuilder.input(vararg classMap: Pair<InputStyle, String>, block: InputElementBuilder<InputProps>.() -> Unit)
    = child(InputElementBuilder(inputComponent, classMap.toList()).apply(block).create())
