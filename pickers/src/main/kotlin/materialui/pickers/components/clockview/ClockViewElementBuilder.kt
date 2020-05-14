package materialui.pickers.components.clockview

import kotlinext.js.jsObject
import kotlinx.html.Tag
import materialui.pickers.components.calendar.*
import materialui.pickers.components.calendar.ArrowSwitcherDelegate
import materialui.pickers.components.calendar.ExportedCalendarDelegate
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import materialui.pickers.components.timepicker.enum.TimePickerView
import react.RClass
import react.RElementBuilder
import react.RProps
import react.createElement

class ClockViewElementBuilder internal constructor(
    private val type: RClass<ClockViewProps>, className: String?, props: ClockViewProps = jsObject { }
) : RElementBuilder<ClockViewProps>(props),
    ArrowSwitcherElement by ArrowSwitcherDelegate(props),
    ExportedClockViewElement by ExportedClockViewDelegate(props)
{
    var RProps.className: String? by props

    init { props.className = className }

    fun create() = createElement(type, attrs, *childList.toTypedArray())

    var Tag.date: Any? by props
    var Tag.type: TimePickerView? by props

    var Tag.onDateChange: ((dynamic, dynamic) -> Unit)? by props
    fun Tag.onDateChange(block: (Any, String) -> Unit) { onDateChange = block }

    var Tag.onChange: ((dynamic, dynamic) -> Unit)? by props
    fun Tag.onChange(block: (Any, String) -> Unit) { onChange = block }

    var Tag.getHoursClockNumberText: ((String) -> String)? by props
    fun Tag.getHoursClockNumberText(block: (String) -> String) { getHoursClockNumberText = block }

    var Tag.getMinutesClockNumberText: ((String) -> String)? by props
    fun Tag.getMinutesClockNumberText(block: (String) -> String) { getMinutesClockNumberText = block }

    var Tag.getSecondsClockNumberText: ((String) -> String)? by props
    fun Tag.getSecondsClockNumberText(block: (String) -> String) { getSecondsClockNumberText = block }

    var Tag.openNextView: (() -> Unit)? by props
    fun Tag.openNextView(block: () -> Unit) { openNextView = block }

    var Tag.openPreviousView: (() -> Unit)? by props
    fun Tag.openPreviousView(block: () -> Unit) { openPreviousView = block }

    var Tag.nextViewAvailable: Boolean? by props
    var Tag.previousViewAvailable: Boolean? by props
    var Tag.showViewSwitcher: Boolean? by props
}
