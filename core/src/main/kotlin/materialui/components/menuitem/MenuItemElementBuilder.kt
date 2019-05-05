package materialui.components.menuitem

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.listitem.ListItemElementBuilder
import materialui.components.menuitem.enums.MenuItemStyle
import react.RClass

class MenuItemElementBuilder<T: Tag> internal constructor(
    type: RClass<MenuItemProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : ListItemElementBuilder<T, MenuItemProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<MenuItemStyle, String>) {
         classes(classMap.toList())
    }
}