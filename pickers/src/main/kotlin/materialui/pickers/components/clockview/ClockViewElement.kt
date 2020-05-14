package materialui.pickers.components.clockview

import kotlinx.html.Tag
import materialui.pickers.components.ExportedClockViewProps
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue

interface ExportedClockViewElement {
    var Tag.ampm: Boolean?
    var Tag.minutesStep: Int?
    var Tag.ampmInClock: Boolean?
    var Tag.allowKeyboardControl: Boolean?
}

internal class ExportedClockViewDelegate<P: ExportedClockViewProps>(props: P) : ExportedClockViewElement {
    override var Tag.ampm: Boolean? by props
    override var Tag.minutesStep: Int? by props
    override var Tag.ampmInClock: Boolean? by props
    override var Tag.allowKeyboardControl: Boolean? by props
}
