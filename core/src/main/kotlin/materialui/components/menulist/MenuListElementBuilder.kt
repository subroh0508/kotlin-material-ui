package materialui.components.menulist

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.getValue
import materialui.components.list.ListElementBuilder
import materialui.components.setValue
import react.RClass

class MenuListElementBuilder<T: Tag> internal constructor(
    type: RClass<MenuListProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : ListElementBuilder<T, MenuListProps>(type, classMap, factory) {
    var Tag.disableListWrap: Boolean? by materialProps
}