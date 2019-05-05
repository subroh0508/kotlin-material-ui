package materialui.components.formhelpertext

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.formhelpertext.enums.FormHelperTextMargin
import materialui.components.formhelpertext.enums.FormHelperTextStyle
import materialui.components.formhelpertext.enums.FormHelperTextVariant
import materialui.components.getValue
import materialui.components.setValue
import react.RClass

class FormHelperTextElementBuilder<T: Tag> internal constructor(
    type: RClass<FormHelperTextProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, FormHelperTextProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<FormHelperTextStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.disabled: Boolean? by materialProps
    var Tag.error: Boolean? by materialProps
    var Tag.filled: Boolean? by materialProps
    var Tag.focused: Boolean? by materialProps
    var Tag.margin: FormHelperTextMargin? by materialProps
    var Tag.required: Boolean? by materialProps
    var Tag.variant: FormHelperTextVariant? by materialProps
}
