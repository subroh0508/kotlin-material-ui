package materialui.pickers.components.timepicker

import materialui.pickers.components.TimeValidationProps
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.RProps

interface TimeValidationElement {
    var RProps.minTime: Any?
    var RProps.maxTime: Any?
    var RProps.shouldDisableTime: ((Number, String) -> Boolean)?
    fun RProps.shouldDisableTime(block: (Number, String) -> Boolean)
    var RProps.disableTimeValidationIgnoreDatePart: Boolean?
}

internal class TimeValidationDelegate<P: TimeValidationProps>(props: P) : TimeValidationElement {
    override var RProps.minTime: Any? by props
    override var RProps.maxTime: Any? by props

    override var RProps.shouldDisableTime: ((Number, String) -> Boolean)? by props
    override fun RProps.shouldDisableTime(block: (Number, String) -> Boolean) { shouldDisableTime = block }

    override var RProps.disableTimeValidationIgnoreDatePart: Boolean? by props
}
