package materialui.components.listitem

import kotlinx.html.LI
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.ListItem
import materialui.components.StandardProps
import materialui.components.buttonbase.ButtonBaseProps
import materialui.components.listitem.enums.ListItemStyle
import react.RBuilder
import react.RProps

external interface ListItemProps : StandardProps {
    var alignItems: String?
    var button: Boolean?
    var ContainerComponent: dynamic
    var ContainerProps: RProps?
    var dense: Boolean?
    var disabled: Boolean?
    var disableGutters: Boolean?
    var divider: Boolean?
    var selected: Boolean?
}

external interface ButtonListItemProps : ButtonBaseProps, ListItemProps

fun RBuilder.listItem(vararg classMap: Pair<ListItemStyle, String>, block: ListItemElementBuilder<LI, ListItemProps>.() -> Unit)
    = child(ListItemElementBuilder(ListItem, classMap.toList()) { LI(mapOf(), it) }.apply(block).create())

fun RBuilder.buttonListItem(vararg classMap: Pair<ListItemStyle, String>, block: ButtonListItemElementBuilder.() -> Unit)
    = child(ButtonListItemElementBuilder(ListItem, classMap.toList()).apply {
        block()
        attrs.button = true
    }.create())

fun <T: Tag> RBuilder.listItem(vararg classMap: Pair<ListItemStyle, String>, factory: (TagConsumer<Unit>) -> T, block: ListItemElementBuilder<T, ListItemProps>.() -> Unit)
    = child(ListItemElementBuilder(ListItem, classMap.toList(), factory).apply(block).create())
