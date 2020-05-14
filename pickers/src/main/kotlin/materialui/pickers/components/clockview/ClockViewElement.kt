package materialui.pickers.components.clockview

import materialui.pickers.components.ExportedClockViewProps
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.RProps

interface ExportedClockViewElement {
    var RProps.ampm: Boolean?
    var RProps.minutesStep: Int?
    var RProps.ampmInClock: Boolean?
    var RProps.allowKeyboardControl: Boolean?
}

internal class ExportedClockViewDelegate<P: ExportedClockViewProps>(props: P) : ExportedClockViewElement {
    override var RProps.ampm: Boolean? by props
    override var RProps.minutesStep: Int? by props
    override var RProps.ampmInClock: Boolean? by props
    override var RProps.allowKeyboardControl: Boolean? by props
}
