package materialui.pickers.components

import react.PropsWithChildren

external interface TimeValidationProps : PropsWithChildren {
    var minTime: dynamic
    var maxTime: dynamic
    var shouldDisableTime: ((Number, String) -> Boolean)?
    var disableTimeValidationIgnoreDatePart: Boolean?
}
