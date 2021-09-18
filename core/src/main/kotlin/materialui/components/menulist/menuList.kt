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

fun RBuilder.menuList(block: MenuListElementBuilder<UL>.() -> Unit) {
    child(menuListElement(block))
}
fun <T: Tag> RBuilder.menuList(factory: (TagConsumer<Unit>) -> T, block: MenuListElementBuilder<T>.() -> Unit) {
    child(menuListElement(factory, block))
}
internal fun menuListElement(
    block: MenuListElementBuilder<UL>.() -> Unit
) = menuListElement({ UL(mapOf(), it) }, block)

internal fun <T: Tag> menuListElement(
    factory: (TagConsumer<Unit>) -> T,
    block: MenuListElementBuilder<T>.() -> Unit
) = MenuListElementBuilder(MenuList, listOf(), factory).apply(block).create()
