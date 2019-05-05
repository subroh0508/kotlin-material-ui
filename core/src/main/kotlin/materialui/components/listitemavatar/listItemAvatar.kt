package materialui.components.listitemavatar

import materialui.components.StandardProps
import materialui.components.listitemavatar.enums.ListItemAvaterStyle
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/ListItemAvatar")
private external val listItemAvatarModule: dynamic

external interface ListItemAvatarProps : StandardProps

@Suppress("UnsafeCastFromDynamic")
private val listItemAvatarComponent: RClass<ListItemAvatarProps> = listItemAvatarModule.default

fun RBuilder.listAvatar(vararg classMap: Pair<ListItemAvaterStyle, String>, block: ListItemAvatarElementBuilder.() -> Unit)
    = child(ListItemAvatarElementBuilder(listItemAvatarComponent, classMap.toList()).apply(block).create())
