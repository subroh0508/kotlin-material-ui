package materialui.components.formcontrol

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.formcontrol.enums.FormControlMargin
import materialui.components.formcontrol.enums.FormControlStyle
import materialui.components.formcontrol.enums.FormControlVariant
import materialui.components.getValue
import materialui.components.setValue
import react.RClass

open class FormControlElementBuilder<T: Tag, Props: FormControlProps> internal constructor(
    type: RClass<Props>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, Props>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<FormControlStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.disabled: Boolean? by materialProps
    var Tag.error: Boolean? by materialProps
    var Tag.fullWidth: Boolean? by materialProps
    var Tag.margin: FormControlMargin? by materialProps
    var Tag.required: Boolean? by materialProps
    var Tag.variant: FormControlVariant? by materialProps
}