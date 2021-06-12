package materialui.pickers.components.day

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.buttonbase.ButtonBaseElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import react.RClass

class DayElementBuilder<T: Tag> internal constructor(
    type: RClass<DayProps>, className: String?, factory: (TagConsumer<Unit>) -> T
) : ButtonBaseElementBuilder<T, DayProps>(type, emptyList(), factory) {
    init { domProps.className = className }

    var Tag.day: Any? by materialProps
    var Tag.focused: Boolean? by materialProps
    var Tag.focusable: Boolean? by materialProps
    var Tag.inCurrentMonth: Boolean? by materialProps
    var Tag.isAnimating: Boolean? by materialProps
    var Tag.today: Boolean? by materialProps
    var Tag.selected: Boolean? by materialProps
    var Tag.allowKeyboardControl: Boolean? by materialProps
    var Tag.disableMargin: Boolean? by materialProps
    var Tag.showDaysOutsideCurrentMonth: Boolean? by materialProps
    var Tag.disableHighlightToday: Boolean? by materialProps

    fun Tag.onDayFocusFunc(block: (Any) -> Unit) { materialProps.onDayFocus = block }
    fun Tag.onDaySelectFunc(block: (Any, Boolean) -> Unit) { materialProps.onDaySelect = block }
}
