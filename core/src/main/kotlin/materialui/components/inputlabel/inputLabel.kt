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

fun RBuilder.inputLabel(vararg classMap: Pair<InputLabelStyle, String>, block: InputLabelElementBuilder<LABEL>.() -> Unit)
    = child(InputLabelElementBuilder(InputLabel, classMap.toList()) { LABEL(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.inputLabel(vararg classMap: Pair<InputLabelStyle, String>, factory: (TagConsumer<Unit>) -> T, block: InputLabelElementBuilder<T>.() -> Unit)
    = child(InputLabelElementBuilder(InputLabel, classMap.toList(), factory).apply(block).create())
