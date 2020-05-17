package materialui.pickers.components

import materialui.components.iconbutton.IconButtonProps
import materialui.components.textfield.TextFieldProps
import react.RProps

external interface WithViewProps : RProps {
    var views: Array<String>?
    var openTo: String?
}

external interface ExportedArrowSwitcherProps : RProps {
    var leftArrowIcon: dynamic
    var rightArrowIcon: dynamic
    var leftArrowButtonText: String?
    var rightArrowButtonText: String?
    var leftArrowButtonProps: IconButtonProps?
    var rightArrowButtonProps: IconButtonProps?
}

external interface ExportedCalendarProps : RProps {
    var showDaysOutsideCurrentMonth: Boolean?
    var disableHighlightToday: Boolean?
    //var onChange: ((dynamic, dynamic) -> Unit)?  TODO delete
    var disablePast: Boolean?
    var disableFuture: Boolean?
    var renderDay: ((dynamic, dynamic, DayProps) -> dynamic)?
    var allowKeyboardController: Boolean?
    var loadingIndicator: dynamic
}

external interface ExportedCalendarViewProps : ExportedCalendarProps, ExportedArrowSwitcherProps {
    var getViewSwitchingButtonText: ((String) -> String)?
    var reduceAnimations: Boolean?
    var onMonthChange: ((dynamic) -> dynamic)?
    var minDate: dynamic
    var maxDate: dynamic
    var shouldDisableDate: ((dynamic) -> Boolean)?
    var onYearChange: ((dynamic) -> Unit)?
}

external interface ExportedClockViewProps : TimeValidationProps, ExportedArrowSwitcherProps {
    var ampm: Boolean?
    var minutesStep: Int?
    var ampmInClock: Boolean?
    var allowKeyboardControl: Boolean?
}

external interface ExportedDateRangePickerViewProps : ExportedCalendarProps, ExportedArrowSwitcherProps {
    var getViewSwitchingButtonText: ((String) -> String)?
    var reduceAnimations: Boolean?
    var onMonthChange: ((dynamic) -> dynamic)?
    var minDate: dynamic
    var maxDate: dynamic
    var shouldDisableDate: ((dynamic) -> Boolean)?
    var disableAutoMonthSwitching: Boolean?
    var calendars: Int?

    /* ExportedDateRangePickerInputProps */
    var renderInput: ((TextFieldProps, TextFieldProps) -> Any)?
}
