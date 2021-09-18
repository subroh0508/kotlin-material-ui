package materialui.pickers.components

import react.PropsWithChildren

external interface DateValidationProps : PropsWithChildren {
    var invalidDateMessage: dynamic
    var minDateMessage: dynamic
    var maxDateMessage: dynamic
    var strictCompareDate: Boolean?
}
