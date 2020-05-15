package materialui.pickers.components.datetimepicker

import materialui.pickers.components.datetimepicker.enums.DateTimePickerView

interface DateTimePickerElement<P: SharedDateTimePickerProps> {
    fun P.views(vararg view: DateTimePickerView)

    fun P.openTo(v: DateTimePickerView)
}

internal class DateTimePickerDelegate<P: SharedDateTimePickerProps> : DateTimePickerElement<P> {
    override fun P.views(vararg view: DateTimePickerView) { views = view.map(DateTimePickerView::name).toTypedArray() }

    override fun P.openTo(v: DateTimePickerView) { openTo = v.name }
}
