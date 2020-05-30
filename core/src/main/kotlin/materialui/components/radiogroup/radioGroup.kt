package materialui.components.radiogroup

import materialui.RadioGroup
import materialui.components.formgroup.FormGroupProps
import react.RBuilder

external interface RadioGroupProps : FormGroupProps {
    var defaultValue: Any?
    var name: String?
    var value: Any?
}

fun RBuilder.radioGroup(block: RadioGroupElementBuilder.() -> Unit)
    = child(RadioGroupElementBuilder(RadioGroup, listOf()).apply(block).create())
