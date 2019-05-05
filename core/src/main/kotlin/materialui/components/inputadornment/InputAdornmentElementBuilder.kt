package materialui.components.inputadornment

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.inputadornment.enums.InputAdornmentPosition
import materialui.components.inputadornment.enums.InputAdornmentStyle
import materialui.components.inputadornment.enums.InputAdornmentVariant
import materialui.components.setValue
import react.RClass

class InputAdornmentElementBuilder<T: Tag> internal constructor(
    type: RClass<InputAdornmentProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, InputAdornmentProps>(type, classMap, factory){
    fun Tag.classes(vararg classMap: Pair<InputAdornmentStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.disablePointerEvents: Boolean? by materialProps
    var Tag.disableTypography: Boolean? by materialProps
    var Tag.position: InputAdornmentPosition? by materialProps
    var Tag.variant: InputAdornmentVariant? by materialProps
}