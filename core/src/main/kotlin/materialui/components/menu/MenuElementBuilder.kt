package materialui.components.menu

import kotlinext.js.jsObject
import kotlinx.html.Tag
import kotlinx.html.UL
import materialui.components.getValue
import materialui.components.menu.enums.MenuStyle
import materialui.components.menulist.MenuListElementBuilder
import materialui.components.menulist.menuList
import materialui.components.popover.PopoverElementBuilder
import materialui.components.popover.enums.PopoverStyle
import materialui.components.setValue
import materialui.styles.muitheme.MuiTheme
import react.ComponentType
import react.RBuilder
import react.RProps

class MenuElementBuilder internal constructor(
    type: ComponentType<MenuProps>,
    classMap: List<Pair<Enum<*>, String>>
) : PopoverElementBuilder<MenuProps>(type, classMap) {
    fun Tag.classes(vararg classMap: Pair<MenuStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.disableAutoFocusItem: Boolean? by materialProps
    var Tag.MenuListProps: PropsWithChildren? by materialProps
    var Tag.theme: MuiTheme? by materialProps
    var Tag.PopoveComponentClasses: Any? by materialProps

    fun Tag.menuListProps(block: MenuListElementBuilder<UL>.() -> Unit) {
        MenuListProps = RBuilder().menuList(block).props
    }
    fun Tag.popoveComponentClasses(vararg classMap: Pair<PopoverStyle, String>) {
        if (classMap.isEmpty()) {
            return
        }

        val classesObj: dynamic = jsObject { }

        classMap.forEach { (key, value) -> classesObj[key] = value }

        PopoveComponentClasses = classesObj as Any
    }
}