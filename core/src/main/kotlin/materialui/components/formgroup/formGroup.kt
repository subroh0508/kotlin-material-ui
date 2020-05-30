package materialui.components.formgroup

import materialui.FormGroup
import materialui.components.StandardProps
import materialui.components.formgroup.enums.FormGroupStyle
import react.RBuilder

external interface FormGroupProps : StandardProps {
    var row: Boolean?
}

fun RBuilder.formGroup(vararg classMap: Pair<FormGroupStyle, String>, block: FormGroupElementBuilder<FormGroupProps>.() -> Unit)
    = child(FormGroupElementBuilder(FormGroup, classMap.toList()).apply(block).create())
