package materialui.pickers.components

import org.w3c.dom.events.Event
import react.RProps
import react.RRef

external interface DayProps : RProps {
    var day: dynamic
    var focused: Boolean?
    var focusable: Boolean?
    var inCurrentMonth: Boolean?
    var isAnimating: Boolean?
    var today: Boolean?
    var disabled: Boolean?
    var selected: Boolean?
    var allowKeyboardControl: Boolean?
    var disableMargin: Boolean?
    var showDaysOutsideCurrentMonth: Boolean?
    var disableHighlightToday: Boolean?
    var onDayFocus: ((dynamic) -> Unit)?
    var onDaySelect: ((dynamic, dynamic) -> Unit)?

    /* ButtonBaseProps properties */
    var buttonRef: RRef?
    var centerRipple: Boolean?
    var disableRipple: Boolean?
    var disableTouchRipple: Boolean?
    var focusRipple: Boolean?
    var focusVisibleClassName: String?
    var onFocusVisible: ((Event) -> Unit)?
    var touchRippleProps: RProps?
    var type: String?
}
