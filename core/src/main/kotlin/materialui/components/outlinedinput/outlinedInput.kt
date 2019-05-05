package materialui.components.outlinedinput

import materialui.components.inputbase.InputBaseProps
import materialui.components.outlinedinput.enums.OutlinedInputStyle
import react.*

@JsModule("@material-ui/core/OutlinedInput")
private external val outlinedInputModule: dynamic

external interface OutlinedInputProps : InputBaseProps {
    var labelWidth: Number?
    var notched: Boolean?
}

@Suppress("UnsafeCastFromDynamic")
private val outlinedInputComponent: RClass<OutlinedInputProps> = outlinedInputModule.default

fun RBuilder.outlinedInput(vararg classMap: Pair<OutlinedInputStyle, String>, block: OutlinedInputElementBuilder.() -> Unit)
    = child(OutlinedInputElementBuilder(outlinedInputComponent, classMap.toList()).apply(block).create())
