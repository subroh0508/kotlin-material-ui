package materialui.pickers.components.timepicker

import kotlinx.html.Tag
import materialui.pickers.components.TimeValidationProps
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue

interface TimeValidationElement {
    var Tag.minTime: Any?
    var Tag.maxTime: Any?
    var Tag.shouldDisableTime: ((Number, String) -> Boolean)?
    fun Tag.shouldDisableTime(block: (Number, String) -> Boolean)
    var Tag.disableTimeValidationIgnoreDatePart: Boolean?
}

internal class TimeValidationDelegate<P: TimeValidationProps>(props: P) : TimeValidationElement {
    override var Tag.minTime: Any? by props
    override var Tag.maxTime: Any? by props

    override var Tag.shouldDisableTime: ((Number, String) -> Boolean)? by props
    override fun Tag.shouldDisableTime(block: (Number, String) -> Boolean) { shouldDisableTime = block }

    override var Tag.disableTimeValidationIgnoreDatePart: Boolean? by props
}
