package materialui.pickers.components.calendar

import kotlinext.js.jsObject
import materialui.components.slide.enums.SlideDirection
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.*

class CalendarElementBuilder internal constructor(
    private val type: RClass<CalendarProps>, className: String?, props: CalendarProps = jsObject { }
) : RElementBuilder<CalendarProps>(props),
        ArrowSwitcherElement by ArrowSwitcherDelegate(props),
        ExportedCalendarElement by ExportedCalendarDelegate(props)
{
    var RProps.className: String? by props

    init { props.className = className }

    fun create() = createElement(type, attrs, *childList.toTypedArray())

    var RProps.date: Any? by props
    var RProps.minDate: Any? by props
    var RProps.maxDate: Any? by props

    var RProps.isDateDisabled: ((Any) -> Boolean)? by props
    fun RProps.isDateDisabled(block: (Any) -> Boolean) { isDateDisabled = block }

    var RProps.slideDirection: SlideDirection? by props
    var RProps.currentMonth: Any? by props
    var RProps.reduceAnimation: Boolean? by props
    var RProps.focusedDay: Any? by props

    var RProps.changeFocusedDay: ((Any) -> Unit)? by props
    fun RProps.changeFocusedDay(block: (Any) -> Unit) { changeFocusedDay = block }

    var RProps.isMonthSwitchingAnimating: Boolean? by props

    var RProps.onMonthSwitchingAnimationEnd: (() -> Unit)? by props
    fun RProps.onMonthSwitchingAnimationEnd(block: () -> Unit) { onMonthSwitchingAnimationEnd = block }

    @Suppress("PropertyName")
    var RProps.TransitionProps: SlideTransitionProps? by props
    @Suppress("FunctionName")
    fun RProps.TransitionProps(block: SlideTransitionProps.() -> Unit) { TransitionProps = jsObject(block) }

    var RProps.onChange: ((Any, Any) -> Unit)? by props
    fun RProps.onChange(block: (Any, Any) -> Unit) { onChange = block }
}
