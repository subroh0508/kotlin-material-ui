package materialui.components.inputlabel

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.formlabel.FormLabelElementBuilder
import materialui.components.getValue
import materialui.components.inputlabel.enums.InputLabelMargin
import materialui.components.inputlabel.enums.InputLabelStyle
import materialui.components.inputlabel.enums.InputLabelVariant
import materialui.components.setValue
import react.ComponentType

class InputLabelElementBuilder<T: Tag> internal constructor(
    type: ComponentType<InputLabelProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : FormLabelElementBuilder<T, InputLabelProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<InputLabelStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.disableAnimation: Boolean? by materialProps
    var Tag.margin: InputLabelMargin? by materialProps
    var Tag.shrink: Boolean? by materialProps
    var Tag.variant: InputLabelVariant? by materialProps
}
