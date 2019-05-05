package materialui.components.formlabel

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.formlabel.enums.FormLabelStyle
import materialui.components.getValue
import materialui.components.setValue
import react.RClass

open class FormLabelElementBuilder<T: Tag, Props: FormLabelProps> internal constructor(
    type: RClass<Props>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, Props>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<FormLabelStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.disabled: Boolean? by materialProps
    var Tag.error: Boolean? by materialProps
    var Tag.filled: Boolean? by materialProps
    var Tag.focused: Boolean? by materialProps
    var Tag.required: Boolean? by materialProps
}