package materialui.components.listitemavatar

import materialui.ListItemAvatar
import materialui.components.StandardProps
import materialui.components.listitemavatar.enums.ListItemAvaterStyle
import react.RBuilder

@JsModule("@material-ui/core/ListItemAvatar")
private external val listItemAvatarModule: dynamic

external interface ListItemAvatarProps : StandardProps

fun RBuilder.listAvatar(vararg classMap: Pair<ListItemAvaterStyle, String>, block: ListItemAvatarElementBuilder.() -> Unit)
    = child(ListItemAvatarElementBuilder(ListItemAvatar, classMap.toList()).apply(block).create())
