package materialui.pickers.components.datepicker

import kotlinext.js.jsObject
import materialui.pickers.components.calendar.*
import materialui.pickers.components.calendar.ArrowSwitcherDelegate
import materialui.pickers.components.calendar.ExportedCalendarDelegate
import materialui.pickers.components.internal.desktop.DesktopWrapperElementBuilder
import materialui.pickers.components.internal.modal.ModalWrapperElementBuilder
import materialui.pickers.components.internal.responsive.ResponsiveWrapperElementBuilder
import materialui.pickers.components.internal.static.StaticWrapperElementBuilder
import react.ComponentType

class DatePickerElementBuilder internal constructor(
    type: ComponentType<DatePickerProps>, className: String?, props: DatePickerProps = jsObject { }
) : ResponsiveWrapperElementBuilder<DatePickerProps>(type, className, props),
        DatePickerElement<DatePickerProps> by DatePickerDelegate(),
        ArrowSwitcherElement<DatePickerProps> by ArrowSwitcherDelegate(),
        ExportedCalendarElement<DatePickerProps> by ExportedCalendarDelegate(),
        ExportedCalendarViewElement<DatePickerProps> by ExportedCalendarViewDelegate()

class MobileDatePickerElementBuilder internal constructor(
    type: ComponentType<MobileDatePickerProps>, className: String?, props: MobileDatePickerProps = jsObject { }
) : ModalWrapperElementBuilder<MobileDatePickerProps>(type, className, props),
        DatePickerElement<DatePickerProps> by DatePickerDelegate(),
        ArrowSwitcherElement<DatePickerProps> by ArrowSwitcherDelegate(),
        ExportedCalendarElement<DatePickerProps> by ExportedCalendarDelegate(),
        ExportedCalendarViewElement<DatePickerProps> by ExportedCalendarViewDelegate()

class DesktopDatePickerElementBuilder internal constructor(
    type: ComponentType<DesktopDatePickerProps>, className: String?, props: DesktopDatePickerProps = jsObject { }
) : DesktopWrapperElementBuilder<DesktopDatePickerProps>(type, className, props),
        DatePickerElement<DatePickerProps> by DatePickerDelegate(),
        ArrowSwitcherElement<DatePickerProps> by ArrowSwitcherDelegate(),
        ExportedCalendarElement<DatePickerProps> by ExportedCalendarDelegate(),
        ExportedCalendarViewElement<DatePickerProps> by ExportedCalendarViewDelegate()

class StaticDatePickerElementBuilder internal constructor(
    type: ComponentType<StaticDatePickerProps>, className: String?, props: StaticDatePickerProps = jsObject { }
) : StaticWrapperElementBuilder<StaticDatePickerProps>(type, className, props),
        DatePickerElement<DatePickerProps> by DatePickerDelegate(),
        ArrowSwitcherElement<DatePickerProps> by ArrowSwitcherDelegate(),
        ExportedCalendarElement<DatePickerProps> by ExportedCalendarDelegate(),
        ExportedCalendarViewElement<DatePickerProps> by ExportedCalendarViewDelegate()
