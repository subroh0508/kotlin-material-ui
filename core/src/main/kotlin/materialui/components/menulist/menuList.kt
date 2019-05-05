package materialui.components.menulist

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import kotlinx.html.UL
import materialui.components.list.ListProps
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/MenuList")
private external val menuListModule: dynamic

external interface MenuListProps : ListProps {
    var disableListWrap: Boolean?
}

@Suppress("UnsafeCastFromDynamic")
private val menuListComponent: RClass<MenuListProps> = menuListModule.default

fun RBuilder.menuList(block: MenuListElementBuilder<UL>.() -> Unit)
    = child(MenuListElementBuilder(menuListComponent, listOf()) { UL(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.menuList(factory: (TagConsumer<Unit>) -> T, block: MenuListElementBuilder<T>.() -> Unit)
    = child(MenuListElementBuilder(menuListComponent, listOf(), factory).apply(block).create())
