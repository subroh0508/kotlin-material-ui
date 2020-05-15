package materialui.pickers.components.calendar

import kotlinext.js.jsObject
import materialui.components.slide.enums.SlideDirection
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.*

class CalendarElementBuilder internal constructor(
    private val type: RClass<CalendarProps>, className: String?, props: CalendarProps = jsObject { }
) : RElementBuilder<CalendarProps>(props),
        ArrowSwitcherElement<CalendarProps> by ArrowSwitcherDelegate(),
        ExportedCalendarElement<CalendarProps> by ExportedCalendarDelegate()
{
    init { props.className = className }

    fun create() = createElement(type, attrs, *childList.toTypedArray())

    fun CalendarProps.isDateDisabledFunc(block: (Any) -> Boolean) { isDateDisabled = block }

    fun CalendarProps.slideDirection(v: SlideDirection?) { slideDirection = v?.name }

    fun CalendarProps.changeFocusedDayFunc(block: (Any) -> Unit) { changeFocusedDay = block }

    fun CalendarProps.onMonthSwitchingAnimationEndFunc(block: () -> Unit) { onMonthSwitchingAnimationEnd = block }

    @Suppress("FunctionName")
    fun CalendarProps.TransitionProps(block: SlideTransitionProps.() -> Unit) { TransitionProps = jsObject(block) }

    var RProps.onChange: ((Any, Any) -> Unit)? by props
    fun CalendarProps.onChangeFunc(block: (Any, Any) -> Unit) { onChange = block }
}
