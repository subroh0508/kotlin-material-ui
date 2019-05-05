package materialui.components.listitemavatar

import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.components.MaterialElementBuilder
import materialui.components.listitemavatar.enums.ListItemAvaterStyle
import react.RClass

class ListItemAvatarElementBuilder internal constructor(
    type: RClass<ListItemAvatarProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, ListItemAvatarProps>(type, classMap, { DIV(mapOf(), it) }) {
    fun Tag.classes(vararg classMap: Pair<ListItemAvaterStyle, String>) {
        classes(classMap.toList())
    }
}