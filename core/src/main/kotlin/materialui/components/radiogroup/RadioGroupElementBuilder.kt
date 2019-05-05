package materialui.components.radiogroup

import kotlinx.html.Tag
import materialui.components.formgroup.FormGroupElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import react.RClass

class RadioGroupElementBuilder internal constructor(
    type: RClass<RadioGroupProps>,
    classMap: List<Pair<Enum<*>, String>>
) : FormGroupElementBuilder<RadioGroupProps>(type, classMap.toList()) {

    var Tag.defaultValue: Any? by materialProps
    var Tag.name: String? by materialProps
    var Tag.value: Any? by materialProps

    fun Tag.defaultValue(v: String) { defaultValue = v }
    fun Tag.defaultValue(v: Number) { defaultValue = v }
    fun Tag.defaultValue(v: Boolean) { defaultValue = v }
    fun Tag.value(v: String) { value = v }
    fun Tag.value(v: Number) { value = v }
    fun Tag.value(v: Boolean) { value = v }
}