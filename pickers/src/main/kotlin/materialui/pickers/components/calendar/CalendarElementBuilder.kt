package materialui.pickers.components.calendar

import kotlinext.js.jsObject
import materialui.components.slide.enums.SlideDirection
import react.*

class CalendarElementBuilder internal constructor(
    private val type: ComponentType<CalendarProps>, className: String?, props: CalendarProps = jsObject { }
) : RElementBuilderImpl<CalendarProps>(props),
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

    fun CalendarProps.onChangeFunc(block: (Any, Any) -> Unit) { this.asDynamic()["onChange"] = block }
}
