package materialui.components.divider

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MMaterialElementBuilder
import materialui.components.divider.enums.DividerStyle
import materialui.components.divider.enums.DividerVariant
import materialui.components.getValue
import materialui.components.setValue
import react.RClass

class DividerElementBuilder<T: Tag> internal constructor(
    type: RClass<DividerProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MMaterialElementBuilder<T, DividerProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<DividerStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.absolute: Boolean? by materialProps
    var Tag.inset: Boolean? by materialProps
    var Tag.light: Boolean? by materialProps
    var Tag.variant: DividerVariant? by materialProps
}