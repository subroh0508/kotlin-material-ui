package materialui.pickers.components.datetimepicker

import kotlinext.js.jsObject
import materialui.pickers.components.calendar.*
import materialui.pickers.components.calendar.ArrowSwitcherDelegate
import materialui.pickers.components.calendar.ExportedCalendarDelegate
import materialui.pickers.components.calendar.ExportedCalendarViewDelegate
import materialui.pickers.components.internal.desktop.DesktopWrapperElementBuilder
import materialui.pickers.components.internal.modal.ModalWrapperElementBuilder
import materialui.pickers.components.internal.responsive.ResponsiveWrapperElementBuilder
import materialui.pickers.components.internal.static.StaticWrapperElementBuilder
import materialui.pickers.components.timepicker.TimeValidationDelegate
import materialui.pickers.components.timepicker.TimeValidationElement
import react.ComponentType

class DateTimePickerElementBuilder internal constructor(
    type: ComponentType<DateTimePickerProps>, className: String?, props: DateTimePickerProps = jsObject { }
) : ResponsiveWrapperElementBuilder<DateTimePickerProps>(type, className, props),
    DateTimePickerElement<DateTimePickerProps> by DateTimePickerDelegate(),
    ArrowSwitcherElement<DateTimePickerProps> by ArrowSwitcherDelegate(),
    ExportedCalendarElement<DateTimePickerProps> by ExportedCalendarDelegate(),
    ExportedCalendarViewElement<DateTimePickerProps> by ExportedCalendarViewDelegate(),
    TimeValidationElement<DateTimePickerProps> by TimeValidationDelegate()

class MobileDateTimePickerElementBuilder internal constructor(
    type: ComponentType<MobileDateTimePickerProps>, className: String?, props: MobileDateTimePickerProps = jsObject { }
) : ModalWrapperElementBuilder<MobileDateTimePickerProps>(type, className, props),
    DateTimePickerElement<DateTimePickerProps> by DateTimePickerDelegate(),
    ArrowSwitcherElement<DateTimePickerProps> by ArrowSwitcherDelegate(),
    ExportedCalendarElement<DateTimePickerProps> by ExportedCalendarDelegate(),
    ExportedCalendarViewElement<DateTimePickerProps> by ExportedCalendarViewDelegate(),
    TimeValidationElement<DateTimePickerProps> by TimeValidationDelegate()

class DesktopDateTimePickerElementBuilder internal constructor(
    type: ComponentType<DesktopDateTimePickerProps>, className: String?, props: DesktopDateTimePickerProps = jsObject { }
) : DesktopWrapperElementBuilder<DesktopDateTimePickerProps>(type, className, props),
    DateTimePickerElement<DateTimePickerProps> by DateTimePickerDelegate(),
    ArrowSwitcherElement<DateTimePickerProps> by ArrowSwitcherDelegate(),
    ExportedCalendarElement<DateTimePickerProps> by ExportedCalendarDelegate(),
    ExportedCalendarViewElement<DateTimePickerProps> by ExportedCalendarViewDelegate(),
    TimeValidationElement<DateTimePickerProps> by TimeValidationDelegate()

class StaticDateTimePickerElementBuilder internal constructor(
    type: ComponentType<StaticDateTimePickerProps>, className: String?, props: StaticDateTimePickerProps = jsObject { }
) : StaticWrapperElementBuilder<StaticDateTimePickerProps>(type, className, props),
    DateTimePickerElement<DateTimePickerProps> by DateTimePickerDelegate(),
    ArrowSwitcherElement<DateTimePickerProps> by ArrowSwitcherDelegate(),
    ExportedCalendarElement<DateTimePickerProps> by ExportedCalendarDelegate(),
    ExportedCalendarViewElement<DateTimePickerProps> by ExportedCalendarViewDelegate(),
    TimeValidationElement<DateTimePickerProps> by TimeValidationDelegate()
