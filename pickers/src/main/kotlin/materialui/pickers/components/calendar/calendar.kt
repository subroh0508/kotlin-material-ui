package materialui.pickers.components.calendar

import materialui.pickers.components.ExportedArrowSwitcherProps
import materialui.pickers.components.ExportedCalendarProps
import react.ComponentType
import react.RBuilder
import react.dom.WithClassName

@JsModule("@material-ui/pickers")
@JsNonModule
private external val CalendarModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val CalendarComponent: ComponentType<CalendarProps> = CalendarModule.Calendar

external interface CalendarProps : ExportedCalendarProps, ExportedArrowSwitcherProps, WithClassName {
    var date: dynamic
    var minDate: dynamic
    var maxDate: dynamic
    var isDateDisabled: ((dynamic) -> Boolean)?
    var slideDirection: String?
    var currentMonth: dynamic
    var reduceAnimation: Boolean?
    var focusedDay: dynamic
    var changeFocusedDay: ((dynamic) -> Unit)?
    var isMonthSwitchingAnimating: Boolean?
    var onMonthSwitchingAnimationEnd: (() -> Unit)?
    @Suppress("PropertyName")
    var TransitionProps: SlideTransitionProps
}

external interface SlideTransitionProps : WithClassName {
    var transKey: dynamic
    var reduceAnimation: Boolean?
    var slideDirection: String?
}

fun RBuilder.calendar(className: String? = null, block: CalendarElementBuilder.() -> Unit) =
        child(CalendarElementBuilder(CalendarComponent, className).apply(block).create())
