package materialui.pickers.components.clockview

import kotlinext.js.jsObject
import materialui.pickers.components.calendar.*
import materialui.pickers.components.calendar.ArrowSwitcherDelegate
import materialui.pickers.components.timepicker.enum.TimePickerView
import react.RClass
import react.RElementBuilder
import react.createElement

class ClockViewElementBuilder internal constructor(
    private val type: RClass<ClockViewProps>, className: String?, props: ClockViewProps = jsObject { }
) : RElementBuilder<ClockViewProps>(props),
    ArrowSwitcherElement<ClockViewProps> by ArrowSwitcherDelegate()
{
    init { props.className = className }

    fun create() = createElement(type, attrs, *childList.toTypedArray())

    fun ClockViewProps.type(v: TimePickerView) { type = v.name }

    fun ClockViewProps.onDateChangeFunc(block: (Any, String) -> Unit) { onDateChange = block }
    fun ClockViewProps.onChangeFunc(block: (Any, Boolean) -> Unit) { onChange = block }

    fun ClockViewProps.getHoursClockNumberTextFunc(block: (String) -> String) { getHoursClockNumberText = block }
    fun ClockViewProps.getMinutesClockNumberTextFunc(block: (String) -> String) { getMinutesClockNumberText = block }
    fun ClockViewProps.getSecondsClockNumberTextFunc(block: (String) -> String) { getSecondsClockNumberText = block }

    fun ClockViewProps.openNextViewFunc(block: () -> Unit) { openNextView = block }
    fun ClockViewProps.openPreviousViewFunc(block: () -> Unit) { openPreviousView = block }
}
