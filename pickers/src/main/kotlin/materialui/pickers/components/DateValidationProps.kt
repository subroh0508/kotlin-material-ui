package materialui.pickers.components

import react.RProps

external interface DateValidationProps : RProps {
    var invalidDateMessage: dynamic
    var minDateMessage: dynamic
    var maxDateMessage: dynamic
    var strictCompareDate: Boolean?
}
