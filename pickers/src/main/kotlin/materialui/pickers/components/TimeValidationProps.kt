package materialui.pickers.components

import react.RProps

external interface TimeValidationProps : RProps {
    var minTime: dynamic
    var maxTime: dynamic
    var shouldDisableTime: ((Number, String) -> Boolean)?
    var disableTimeValidationIgnoreDatePart: Boolean?
}
