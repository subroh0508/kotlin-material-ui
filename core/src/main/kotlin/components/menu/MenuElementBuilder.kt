package components.menu

import components.popover.PopoverElementBuilder
import kotlinx.html.Tag
import react.RComponent
import react.RProps
import react.RState

class MenuElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : PopoverElementBuilder(type) {

    var Tag.disableAutoFocusItem: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableAutoFocusItem"]
        set(value) { setProp("disableAutoFocusItem", value) }
    var Tag.menuListProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["MenuListProps"]
        set(value) { setProp("MenuListProps", value) }
    var Tag.theme: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["theme"]
        set(value) { setProp("theme", value) }
    var Tag.popoverClasses: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["PopoverClasses"]
        set(value) { setProp("PopoverClasses", value) }
}