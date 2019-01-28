package components.buttonbase

import components.buttonbase.enums.ButtonType
import org.w3c.dom.events.Event
import react.RProps
import react.RRef

interface ButtonBaseAttributes {
    var buttonRef: RRef
    var centerRipple: Boolean
    var classes: Any
    var disabled: Boolean
    var disableRipple: Boolean
    var disableTouchRipple: Boolean
    var focusRipple: Boolean
    var focusVisibleClassName: String
    var onFocusVisible: (Event) -> Unit
    var touchRippleProps: RProps
    var buttonType: ButtonType
}