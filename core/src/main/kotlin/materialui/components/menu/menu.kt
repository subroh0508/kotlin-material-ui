package materialui.components.menu

import materialui.Menu
import materialui.components.menu.enums.MenuStyle
import materialui.components.popover.PopoverProps
import materialui.styles.muitheme.MuiTheme
import react.RBuilder
import react.RProps

external interface MenuProps : PopoverProps {
    var disableAutoFocusItem: Boolean?
    var MenuListProps: RProps?
    var theme: MuiTheme?
    var PopoverClasses: Any?
}

fun RBuilder.menu(vararg classMap: Pair<MenuStyle, String>, block: MenuElementBuilder.() -> Unit)
    = child(MenuElementBuilder(Menu, classMap.toList()).apply(block).create())
