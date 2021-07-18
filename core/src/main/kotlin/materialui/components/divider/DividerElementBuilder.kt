package materialui.components.divider

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.divider.enums.DividerOrientation
import materialui.components.divider.enums.DividerStyle
import materialui.components.divider.enums.DividerVariant
import materialui.components.getValue
import materialui.components.setValue
import react.ComponentType

class DividerElementBuilder<T: Tag> internal constructor(
    type: ComponentType<DividerProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, DividerProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<DividerStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.absolute: Boolean? by materialProps
    var Tag.light: Boolean? by materialProps
    var Tag.variant: DividerVariant? by materialProps
    var Tag.orientation: DividerOrientation? by materialProps
    var Tag.flexItem: Boolean? by materialProps
}