package materialui.components.inputadornment

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.InputAdornment
import materialui.components.StandardProps
import materialui.components.inputadornment.enums.InputAdornmentStyle
import react.RBuilder

external interface InputAdornmentProps : StandardProps {
    var disablePointerEvents: Boolean?
    var disableTypography: Boolean?
    var position: String?
    var variant: String?
}

fun RBuilder.inputAdornment(vararg classMap: Pair<InputAdornmentStyle, String>, block: InputAdornmentElementBuilder<DIV>.() -> Unit) {
    child(inputAdornmentElement(classMap.toList(), block))
}
fun <T: Tag> RBuilder.inputAdornment(vararg classMap: Pair<InputAdornmentStyle, String>, factory: (TagConsumer<Unit>) -> T, block: InputAdornmentElementBuilder<T>.() -> Unit) {
    child(inputAdornmentElement(classMap.toList(), factory, block))
}
fun inputAdornmentElement(
    classMap: List<Pair<InputAdornmentStyle, String>> = listOf(),
    block: InputAdornmentElementBuilder<DIV>.() -> Unit
) = inputAdornmentElement(classMap, { DIV(mapOf(), it) }, block)

fun <T: Tag> inputAdornmentElement(
    classMap: List<Pair<InputAdornmentStyle, String>> = listOf(),
    factory: (TagConsumer<Unit>) -> T,
    block: InputAdornmentElementBuilder<T>.() -> Unit
) = InputAdornmentElementBuilder(InputAdornment, classMap, factory).apply(block).create()
