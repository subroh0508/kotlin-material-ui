package materialui.components.inputlabel

import kotlinx.html.LABEL
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.InputLabel
import materialui.components.formlabel.FormLabelProps
import materialui.components.inputlabel.enums.InputLabelStyle
import react.RBuilder

external interface InputLabelProps : FormLabelProps {
    var disableAnimation: Boolean?
    var margin: String?
    var shrink: Boolean?
    var variant: String?
}

fun RBuilder.inputLabel(vararg classMap: Pair<InputLabelStyle, String>, block: InputLabelElementBuilder<LABEL>.() -> Unit) {
    child(inputLabelElement(classMap.toList(), block))
}
fun <T: Tag> RBuilder.inputLabel(vararg classMap: Pair<InputLabelStyle, String>, factory: (TagConsumer<Unit>) -> T, block: InputLabelElementBuilder<T>.() -> Unit) {
    child(inputLabelElement(classMap.toList(), factory, block))
}
internal fun inputLabelElement(
    classMap: List<Pair<InputLabelStyle, String>> = listOf(),
    block: InputLabelElementBuilder<LABEL>.() -> Unit
) = inputLabelElement(classMap, { LABEL(mapOf(), it) }, block)

internal fun <T: Tag> inputLabelElement(
    classMap: List<Pair<InputLabelStyle, String>> = listOf(),
    factory: (TagConsumer<Unit>) -> T,
    block: InputLabelElementBuilder<T>.() -> Unit
) = InputLabelElementBuilder(InputLabel, classMap, factory).apply(block).create()
