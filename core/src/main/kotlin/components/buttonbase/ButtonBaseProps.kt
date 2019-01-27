package components.buttonbase

import org.w3c.dom.events.Event
import react.RProps
import react.RRef
import styled.StyledProps

interface ButtonBaseProps : StyledProps {
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
    @JsName("TouchRippleProps")
    var touchRippleProps: RProps
    var type: String
    var style: String

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