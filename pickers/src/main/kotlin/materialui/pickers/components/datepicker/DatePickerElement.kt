package materialui.pickers.components.datepicker

import materialui.pickers.components.WithViewProps
import materialui.pickers.components.datepicker.enums.DatePickerView
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.RProps

interface DatePickerElement<P: WithViewProps> {
    fun P.views(vararg view: DatePickerView)

    fun P.openTo(v: DatePickerView)
}

internal class DatePickerDelegate<P: WithViewProps> : DatePickerElement<P> {
    override fun P.views(vararg view: DatePickerView) { views = view.map(DatePickerView::name).toTypedArray() }

    override fun P.openTo(v: DatePickerView) { openTo = v.name }
}
