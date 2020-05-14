package materialui.pickers.components.timepicker

import materialui.pickers.components.WithViewProps
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import materialui.pickers.components.timepicker.enum.TimePickerView
import react.RProps

interface TimePickerElement {
    var RProps.views: Array<out TimePickerView>?
    fun RProps.views(vararg view: TimePickerView)

    var RProps.openTo: TimePickerView?
}

internal class TimePickerDelegate<P: WithViewProps>(props: P) : TimePickerElement {
    override var RProps.views: Array<out TimePickerView>? by props
    override fun RProps.views(vararg view: TimePickerView) { views = view }

    override var RProps.openTo: TimePickerView? by props
}
