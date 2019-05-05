package materialui.components.toolbar

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.components.toolbar.enums.ToolbarStyle
import materialui.components.toolbar.enums.ToolbarVariant
import react.RClass

class ToolbarElementBuilder<T: Tag> internal constructor(
    type: RClass<ToolbarProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, ToolbarProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<ToolbarStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.disableGutters: Boolean? by materialProps
    var Tag.variant: ToolbarVariant? by materialProps
}