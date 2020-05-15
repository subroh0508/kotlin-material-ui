package materialui.pickers.components.timepicker

import materialui.pickers.components.TimeValidationProps

interface TimeValidationElement<P: TimeValidationProps> {
    fun P.shouldDisableTimeFunc(block: (Number, String) -> Boolean)
}

internal class TimeValidationDelegate<P: TimeValidationProps> : TimeValidationElement<P> {
    override fun P.shouldDisableTimeFunc(block: (Number, String) -> Boolean) { shouldDisableTime = block }
}
