package components.menu

import components.menulist.MenuListProps
import components.paper.PaperProps
import org.w3c.dom.events.Event
import react.ReactElement
import values.TransitionDuration

interface MenuAttributes : BaseMaterialAttributes {
    var anchorEl: ReactElement?
    var classes: Any
    var disableAutoFocusItem: Boolean
    @JsName("MenuListProps")
    var menuListProps: MenuListProps
    var onClose: (Event) -> Unit
    var onEnter: (Event) -> Unit
    var onEntered: (Event) -> Unit
    var onEntering: (Event) -> Unit
    var onExit: (Event) -> Unit
    var onExited: (Event) -> Unit
    var onExiting: (Event) -> Unit
    var open: Boolean
    @JsName("PaperProps")
    var paperProps: PaperProps
    @JsName("PopoverClasses")
    var popoverClasses: Any
    var theme: Any
    var transitionDuration: TransitionDuration
}