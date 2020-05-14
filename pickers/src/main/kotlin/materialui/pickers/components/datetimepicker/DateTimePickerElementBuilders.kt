package materialui.pickers.components.datetimepicker

import kotlinext.js.jsObject
import materialui.pickers.components.calendar.*
import materialui.pickers.components.calendar.ArrowSwitcherDelegate
import materialui.pickers.components.calendar.ExportedCalendarDelegate
import materialui.pickers.components.calendar.ExportedCalendarViewDelegate
import materialui.pickers.components.clockview.ExportedClockViewDelegate
import materialui.pickers.components.clockview.ExportedClockViewElement
import materialui.pickers.components.internal.desktop.DesktopWrapperElementBuilder
import materialui.pickers.components.internal.modal.ModalWrapperElementBuilder
import materialui.pickers.components.internal.responsive.ResponsiveWrapperElementBuilder
import materialui.pickers.components.internal.static.StaticWrapperElementBuilder
import materialui.pickers.components.timepicker.TimeValidationDelegate
import materialui.pickers.components.timepicker.TimeValidationElement
import react.RClass

class DateTimePickerElementBuilder internal constructor(
    type: RClass<DateTimePickerProps>, className: String?, props: DateTimePickerProps = jsObject { }
) : ResponsiveWrapperElementBuilder<DateTimePickerProps>(type, className, props),
    DateTimePickerElement by DateTimePickerDelegate(props),
    ArrowSwitcherElement by ArrowSwitcherDelegate(props),
    ExportedCalendarElement by ExportedCalendarDelegate(props),
    ExportedCalendarViewElement by ExportedCalendarViewDelegate(props),
    TimeValidationElement by TimeValidationDelegate(props),
    ExportedClockViewElement by ExportedClockViewDelegate(props)

class MobileDateTimePickerElementBuilder internal constructor(
    type: RClass<MobileDateTimePickerProps>, className: String?, props: MobileDateTimePickerProps = jsObject { }
) : ModalWrapperElementBuilder<MobileDateTimePickerProps>(type, className, props),
    DateTimePickerElement by DateTimePickerDelegate(props),
    ArrowSwitcherElement by ArrowSwitcherDelegate(props),
    ExportedCalendarElement by ExportedCalendarDelegate(props),
    ExportedCalendarViewElement by ExportedCalendarViewDelegate(props),
    TimeValidationElement by TimeValidationDelegate(props),
    ExportedClockViewElement by ExportedClockViewDelegate(props)

class DesktopDateTimePickerElementBuilder internal constructor(
    type: RClass<DesktopDateTimePickerProps>, className: String?, props: DesktopDateTimePickerProps = jsObject { }
) : DesktopWrapperElementBuilder<DesktopDateTimePickerProps>(type, className, props),
    DateTimePickerElement by DateTimePickerDelegate(props),
    ArrowSwitcherElement by ArrowSwitcherDelegate(props),
    ExportedCalendarElement by ExportedCalendarDelegate(props),
    ExportedCalendarViewElement by ExportedCalendarViewDelegate(props),
    TimeValidationElement by TimeValidationDelegate(props),
    ExportedClockViewElement by ExportedClockViewDelegate(props)

class StaticDateTimePickerElementBuilder internal constructor(
    type: RClass<StaticDateTimePickerProps>, className: String?, props: StaticDateTimePickerProps = jsObject { }
) : StaticWrapperElementBuilder<StaticDateTimePickerProps>(type, className, props),
    DateTimePickerElement by DateTimePickerDelegate(props),
    ArrowSwitcherElement by ArrowSwitcherDelegate(props),
    ExportedCalendarElement by ExportedCalendarDelegate(props),
    ExportedCalendarViewElement by ExportedCalendarViewDelegate(props),
    TimeValidationElement by TimeValidationDelegate(props),
    ExportedClockViewElement by ExportedClockViewDelegate(props)
