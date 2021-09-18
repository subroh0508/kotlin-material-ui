package materialui.components.formcontrol

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.FormControl
import materialui.components.StandardProps
import materialui.components.formcontrol.enums.FormControlStyle
import react.RBuilder

external interface FormControlProps : StandardProps {
    var disabled: Boolean?
    var error: Boolean?
    var fullWidth: Boolean?
    var margin: String?
    var required: Boolean?
    var variant: String?
}

fun RBuilder.formControl(vararg classMap: Pair<FormControlStyle, String>, block: FormControlElementBuilder<DIV, FormControlProps>.() -> Unit) {
    child(FormControlElementBuilder(FormControl, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.formControl(vararg classMap: Pair<FormControlStyle, String>, factory: (TagConsumer<Unit>) -> T, block: FormControlElementBuilder<T, FormControlProps>.() -> Unit) {
    child(FormControlElementBuilder(FormControl, classMap.toList(), factory).apply(block).create())
}