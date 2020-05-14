package materialui.pickers.components.clockview

import kotlinext.js.jsObject
import materialui.pickers.components.calendar.*
import materialui.pickers.components.calendar.ArrowSwitcherDelegate
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

    var RProps.date: Any? by props
    var RProps.type: TimePickerView? by props

    var RProps.onDateChange: ((dynamic, dynamic) -> Unit)? by props
    fun RProps.onDateChange(block: (Any, String) -> Unit) { onDateChange = block }

    var RProps.onChange: ((dynamic, dynamic) -> Unit)? by props
    fun RProps.onChange(block: (Any, Boolean) -> Unit) { onChange = block }

    var RProps.getHoursClockNumberText: ((String) -> String)? by props
    fun RProps.getHoursClockNumberText(block: (String) -> String) { getHoursClockNumberText = block }

    var RProps.getMinutesClockNumberText: ((String) -> String)? by props
    fun RProps.getMinutesClockNumberText(block: (String) -> String) { getMinutesClockNumberText = block }

    var RProps.getSecondsClockNumberText: ((String) -> String)? by props
    fun RProps.getSecondsClockNumberText(block: (String) -> String) { getSecondsClockNumberText = block }

    var RProps.openNextView: (() -> Unit)? by props
    fun RProps.openNextView(block: () -> Unit) { openNextView = block }

    var RProps.openPreviousView: (() -> Unit)? by props
    fun RProps.openPreviousView(block: () -> Unit) { openPreviousView = block }

    var RProps.nextViewAvailable: Boolean? by props
    var RProps.previousViewAvailable: Boolean? by props
    var RProps.showViewSwitcher: Boolean? by props
}
