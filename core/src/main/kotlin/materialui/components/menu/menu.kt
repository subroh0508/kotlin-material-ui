package materialui.components.menu

import materialui.components.menu.enums.MenuStyle
import materialui.components.popover.PopoverProps
import materialui.styles.muitheme.MuiTheme
import react.RBuilder
import react.RClass
import react.RProps

@JsModule("@material-ui/core/Menu")
private external val menuModule: dynamic

external interface MenuProps : PopoverProps {
    var disableAutoFocusItem: Boolean?
    var MenuListProps: RProps?
    var theme: MuiTheme?
    var PopoverClasses: Any?
}

@Suppress("UnsafeCastFromDynamic")
private val menuComponent: RClass<MenuProps> = menuModule.default

fun RBuilder.menu(vararg classMap: Pair<MenuStyle, String>, block: MenuElementBuilder.() -> Unit)
    = child(MenuElementBuilder(menuComponent, classMap.toList()).apply(block).create())