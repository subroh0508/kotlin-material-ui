package materialui.pickers.components.timepicker

import materialui.pickers.components.WithViewProps
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import materialui.pickers.components.timepicker.enum.TimePickerView
import react.RProps

interface TimePickerElement<P: WithViewProps> {
    fun P.views(vararg view: TimePickerView)

    fun P.openTo(v: TimePickerView)
}

internal class TimePickerDelegate<P: WithViewProps> : TimePickerElement<P> {
    override fun P.views(vararg view: TimePickerView) { views = view.map(TimePickerView::name).toTypedArray() }

    override fun P.openTo(v: TimePickerView) { openTo = v.name }
}
