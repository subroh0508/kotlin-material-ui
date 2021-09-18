package materialui.components.menu

import materialui.Menu
import materialui.components.menu.enums.MenuStyle
import materialui.components.popover.PopoverProps
import materialui.styles.muitheme.MuiTheme
import react.RBuilder
import react.PropsWithChildren

external interface MenuProps : PopoverProps {
    var disableAutoFocusItem: Boolean?
    var MenuListProps: PropsWithChildren?
    var theme: MuiTheme?
    var PopoveComponentClasses: Any?
}

fun RBuilder.menu(vararg classMap: Pair<MenuStyle, String>, block: MenuElementBuilder.() -> Unit) {
    child(menuElement(classMap.toList(), block))
}
internal fun menuElement(
    classMap: List<Pair<MenuStyle, String>> = listOf(),
    block: MenuElementBuilder.() -> Unit
) = MenuElementBuilder(Menu, classMap.toList()).apply(block).create()
