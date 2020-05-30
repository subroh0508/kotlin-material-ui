package materialui.components.menulist

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import kotlinx.html.UL
import materialui.MenuList
import materialui.components.list.ListProps
import react.RBuilder

external interface MenuListProps : ListProps {
    var disableListWrap: Boolean?
}

fun RBuilder.menuList(block: MenuListElementBuilder<UL>.() -> Unit)
    = child(MenuListElementBuilder(MenuList, listOf()) { UL(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.menuList(factory: (TagConsumer<Unit>) -> T, block: MenuListElementBuilder<T>.() -> Unit)
    = child(MenuListElementBuilder(MenuList, listOf(), factory).apply(block).create())
