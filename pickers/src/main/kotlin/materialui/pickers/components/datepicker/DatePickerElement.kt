package materialui.pickers.components.datepicker

import materialui.pickers.components.WithViewProps
import materialui.pickers.components.datepicker.enums.DatePickerView
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.RProps

interface DatePickerElement {
    var RProps.views: Array<out DatePickerView>?
    fun RProps.views(vararg view: DatePickerView)

    var RProps.openTo: DatePickerView?
}

internal class DatePickerDelegate<P: WithViewProps>(props: P) : DatePickerElement {
    override var RProps.views: Array<out DatePickerView>? by props
    override fun RProps.views(vararg view: DatePickerView) { views = view }

    override var RProps.openTo: DatePickerView? by props
}
