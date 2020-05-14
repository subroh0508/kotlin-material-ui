package materialui.pickers.components.datetimepicker

import materialui.pickers.components.datetimepicker.enums.DateTimePickerView
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.RProps

interface DateTimePickerElement {
    var RProps.minDateTime: dynamic
    var RProps.maxDateTime: dynamic

    var RProps.views: Array<out DateTimePickerView>?
    fun RProps.views(vararg view: DateTimePickerView)

    var RProps.openTo: DateTimePickerView?
}

internal class DateTimePickerDelegate<P: SharedDateTimePickerProps>(props: P) : DateTimePickerElement {
    override var RProps.minDateTime: Any? by props
    override var RProps.maxDateTime: Any? by props

    override var RProps.views: Array<out DateTimePickerView>? by props
    override fun RProps.views(vararg view: DateTimePickerView) { views = view }

    override var RProps.openTo: DateTimePickerView? by props
}
