package materialui.pickers.components.datepicker

import kotlinx.html.Tag
import materialui.pickers.components.WithViewProps
import materialui.pickers.components.datepicker.enums.DatePickerView
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue

interface DatePickerElement {
    var Tag.views: Array<out DatePickerView>?
    fun Tag.views(vararg view: DatePickerView)

    var Tag.openTo: DatePickerView?
}

internal class DatePickerDelegate<P: WithViewProps>(props: P) : DatePickerElement {
    override var Tag.views: Array<out DatePickerView>? by props
    override fun Tag.views(vararg view: DatePickerView) { views = view }

    override var Tag.openTo: DatePickerView? by props
}
