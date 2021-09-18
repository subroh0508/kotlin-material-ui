package materialui.components.menuitem

import kotlinx.html.DIV
import kotlinx.html.LI
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.MenuItem
import materialui.components.listitem.ListItemProps
import materialui.components.listitem.enums.ListItemStyle
import materialui.components.menuitem.enums.MenuItemStyle
import react.RBuilder

external interface MenuItemProps : ListItemProps

fun RBuilder.menuItem(vararg classMap: Pair<MenuItemStyle, String>, block: MenuItemElementBuilder<LI>.() -> Unit) {
    child(MenuItemElementBuilder(MenuItem, classMap.toList()) { LI(mapOf(), it) }.apply(block).create())
}
fun RBuilder.menuItem(button: Boolean, vararg classMap: Pair<ListItemStyle, String>, block: MenuItemElementBuilder<DIV>.() -> Unit) {
    child(MenuItemElementBuilder(MenuItem, classMap.toList()) { DIV(mapOf(), it) }.apply {
        block()
        attrs.button = button
    }.create())
}

fun <T: Tag> RBuilder.menuItem(vararg classMap: Pair<MenuItemStyle, String>, factory: (TagConsumer<Unit>) -> T, block: MenuItemElementBuilder<T>.() -> Unit) {
    child(MenuItemElementBuilder(MenuItem, classMap.toList(), factory).apply(block).create())
}