package materialui.components.filledinput

import materialui.components.filledinput.enums.FilledInputStyle
import materialui.components.inputbase.InputBaseProps
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/FilledInput")
private external val filledInputModule: dynamic

external interface FilledInputProps : InputBaseProps {
    var disableUnderline: Boolean?
}

@Suppress("UnsafeCastFromDynamic")
private val filledInputComponent: RClass<FilledInputProps> = filledInputModule.default

fun RBuilder.filledInput(vararg classMap: Pair<FilledInputStyle, String>, block: FilledInputElementBuilder.() -> Unit)
    = child(FilledInputElementBuilder(filledInputComponent, classMap.toList()).apply(block).create())
