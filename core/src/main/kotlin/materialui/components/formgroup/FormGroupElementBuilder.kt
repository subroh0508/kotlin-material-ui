package materialui.components.formgroup

import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.components.MaterialElementBuilder
import materialui.components.formgroup.enums.FormGroupStyle
import materialui.components.getValue
import materialui.components.setValue
import react.RClass

open class FormGroupElementBuilder<Props: FormGroupProps> internal constructor(
    type: RClass<Props>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, Props>(type, classMap, { DIV(mapOf(), it) }) {
    fun Tag.classes(vararg classMap: Pair<FormGroupStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.row: Boolean? by materialProps
}