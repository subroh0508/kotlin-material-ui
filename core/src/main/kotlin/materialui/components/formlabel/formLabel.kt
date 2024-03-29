package materialui.components.formlabel

import kotlinx.html.LABEL
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.FormLabel
import materialui.components.StandardProps
import materialui.components.formlabel.enums.FormLabelStyle
import react.RBuilder

external interface FormLabelProps : StandardProps {
    var disabled: Boolean?
    var error: Boolean?
    var filled: Boolean?
    var focused: Boolean?
    var required: Boolean?
}

fun RBuilder.formLabel(vararg classMap: Pair<FormLabelStyle, String>, block: FormLabelElementBuilder<LABEL, FormLabelProps>.() -> Unit) {
    child(FormLabelElementBuilder(FormLabel, classMap.toList()) { LABEL(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.formLabel(vararg classMap: Pair<FormLabelStyle, String>, factory: (TagConsumer<Unit>) -> T, block: FormLabelElementBuilder<T, FormLabelProps>.() -> Unit) {
    child(FormLabelElementBuilder(FormLabel, classMap.toList(), factory).apply(block).create())
}