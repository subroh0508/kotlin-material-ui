package components.buttonbase

import components.BaseMaterialAttributes
import components.buttonbase.enums.ButtonType
import org.w3c.dom.events.Event
import react.RProps
import react.RRef

interface ButtonBaseAttributes : BaseMaterialAttributes {
    var buttonRef: RRef
    var centerRipple: Boolean
    var classes: Any
    var component: String
    var disabled: Boolean
    var disableRipple: Boolean
    var disableTouchRipple: Boolean
    var focusRipple: Boolean
    var focusVisibleClassName: String
    var onFocusVisible: (Event) -> Unit
    var touchRippleProps: RProps
    var buttonType: ButtonType

    var onBlur: (Event) -> Unit
    var onFocus: (Event) -> Unit
    var onKeyDown: (Event) -> Unit
    var onKeyUp: (Event) -> Unit
    var onMouseDown: (Event) -> Unit
    var onMouseLeave: (Event) -> Unit
    var onMouseUp: (Event) -> Unit
    var onTouchEnd: (Event) -> Unit
    var onTouchMove: (Event) -> Unit
    var onTouchStart: (Event) -> Unit
    var onContextMenu: (Event) -> Unit
}