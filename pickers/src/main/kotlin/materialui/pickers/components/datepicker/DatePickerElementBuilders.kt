package materialui.pickers.components.datepicker

import kotlinext.js.jsObject
import materialui.pickers.components.calendar.*
import materialui.pickers.components.calendar.ArrowSwitcherDelegate
import materialui.pickers.components.calendar.ExportedCalendarDelegate
import materialui.pickers.components.internal.desktop.DesktopWrapperElementBuilder
import materialui.pickers.components.internal.modal.ModalWrapperElementBuilder
import materialui.pickers.components.internal.responsive.ResponsiveWrapperElementBuilder
import materialui.pickers.components.internal.static.StaticWrapperElementBuilder
import react.RClass

class DatePickerElementBuilder internal constructor(
    type: RClass<DatePickerProps>, className: String?, props: DatePickerProps = jsObject { }
) : ResponsiveWrapperElementBuilder<DatePickerProps>(type, className, props),
        DatePickerElement by DatePickerDelegate(props),
        ArrowSwitcherElement by ArrowSwitcherDelegate(props),
        ExportedCalendarElement by ExportedCalendarDelegate(props),
        ExportedCalendarViewElement by ExportedCalendarViewDelegate(props)

class MobileDatePickerElementBuilder internal constructor(
    type: RClass<MobileDatePickerProps>, className: String?, props: MobileDatePickerProps = jsObject { }
) : ModalWrapperElementBuilder<MobileDatePickerProps>(type, className, props),
        DatePickerElement by DatePickerDelegate(props),
        ArrowSwitcherElement by ArrowSwitcherDelegate(props),
        ExportedCalendarElement by ExportedCalendarDelegate(props),
        ExportedCalendarViewElement by ExportedCalendarViewDelegate(props)

class DesktopDatePickerElementBuilder internal constructor(
    type: RClass<DesktopDatePickerProps>, className: String?, props: DesktopDatePickerProps = jsObject { }
) : DesktopWrapperElementBuilder<DesktopDatePickerProps>(type, className, props),
        DatePickerElement by DatePickerDelegate(props),
        ArrowSwitcherElement by ArrowSwitcherDelegate(props),
        ExportedCalendarElement by ExportedCalendarDelegate(props),
        ExportedCalendarViewElement by ExportedCalendarViewDelegate(props)

class StaticDatePickerElementBuilder internal constructor(
    type: RClass<StaticDatePickerProps>, className: String?, props: StaticDatePickerProps = jsObject { }
) : StaticWrapperElementBuilder<StaticDatePickerProps>(type, className, props),
        DatePickerElement by DatePickerDelegate(props),
        ArrowSwitcherElement by ArrowSwitcherDelegate(props),
        ExportedCalendarElement by ExportedCalendarDelegate(props),
        ExportedCalendarViewElement by ExportedCalendarViewDelegate(props)
