package materialui.components.formhelpertext

import kotlinx.html.P
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.FormHelperText
import materialui.components.StandardProps
import materialui.components.formhelpertext.enums.FormHelperTextStyle
import react.*

external interface FormHelperTextProps : StandardProps {
    var disabled: Boolean?
    var error: Boolean?
    var filled: Boolean?
    var focused: Boolean?
    var margin: String?
    var required: Boolean?
    var variant: String?
}

fun RBuilder.formHelperText(vararg classMap: Pair<FormHelperTextStyle, String>, block: FormHelperTextElementBuilder<P>.() -> Unit)
    = child(FormHelperTextElementBuilder(FormHelperText, classMap.toList()) { P(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.formHelperText(vararg classMap: Pair<FormHelperTextStyle, String>, factory: (TagConsumer<Unit>) -> T, block: FormHelperTextElementBuilder<T>.() -> Unit)
    = child(FormHelperTextElementBuilder(FormHelperText, classMap.toList(), factory).apply(block).create())
