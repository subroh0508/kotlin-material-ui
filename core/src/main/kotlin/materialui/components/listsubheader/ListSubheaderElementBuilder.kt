package materialui.components.listsubheader

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.listsubheader.enums.ListSubheaderColor
import materialui.components.listsubheader.enums.ListSubheaderStyle
import materialui.components.setValue
import react.RClass

class ListSubheaderElementBuilder<T: Tag> internal constructor(
    type: RClass<ListSubheaderProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, ListSubheaderProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<ListSubheaderStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.color: ListSubheaderColor? by materialProps
    var Tag.disableGutters: Boolean? by materialProps
    var Tag.disableSticky: Boolean? by materialProps
    var Tag.inset: Boolean? by materialProps
}