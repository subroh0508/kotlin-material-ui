package materialui.pickers.components.daterangepicker

import kotlinext.js.jsObject
import materialui.pickers.components.calendar.*
import materialui.pickers.components.calendar.ArrowSwitcherDelegate
import materialui.pickers.components.calendar.ExportedCalendarDelegate
import materialui.pickers.components.internal.desktop.DesktopWrapperElementBuilder
import materialui.pickers.components.internal.modal.ModalWrapperElementBuilder
import materialui.pickers.components.internal.responsive.ResponsiveWrapperElementBuilder
import materialui.pickers.components.internal.static.StaticWrapperElementBuilder
import react.ComponentType

class DateRangePickerElementBuilder internal constructor(
    type: ComponentType<DateRangePickerProps>, className: String?, props: DateRangePickerProps = jsObject { }
) : ResponsiveWrapperElementBuilder<DateRangePickerProps>(type, className, props),
    SharedDateRangePickerElement<DateRangePickerProps> by DateRangePickerDelegate(),
    ArrowSwitcherElement<DateRangePickerProps> by ArrowSwitcherDelegate(),
    ExportedDateRangePickerViewElement<DateRangePickerProps> by ExportedDateRangePickerViewDelegate(),
    ExportedCalendarElement<DateRangePickerProps> by ExportedCalendarDelegate()

class MobileDateRangePickerElementBuilder internal constructor(
    type: ComponentType<MobileDateRangePickerProps>, className: String?, props: MobileDateRangePickerProps = jsObject { }
) : ModalWrapperElementBuilder<MobileDateRangePickerProps>(type, className, props),
    SharedDateRangePickerElement<MobileDateRangePickerProps> by DateRangePickerDelegate(),
    ArrowSwitcherElement<MobileDateRangePickerProps> by ArrowSwitcherDelegate(),
    ExportedDateRangePickerViewElement<MobileDateRangePickerProps> by ExportedDateRangePickerViewDelegate(),
    ExportedCalendarElement<MobileDateRangePickerProps> by ExportedCalendarDelegate()

class DesktopDateRangePickerElementBuilder internal constructor(
    type: ComponentType<DesktopDateRangePickerProps>, className: String?, props: DesktopDateRangePickerProps = jsObject { }
) : DesktopWrapperElementBuilder<DesktopDateRangePickerProps>(type, className, props),
    SharedDateRangePickerElement<DesktopDateRangePickerProps> by DateRangePickerDelegate(),
    ArrowSwitcherElement<DesktopDateRangePickerProps> by ArrowSwitcherDelegate(),
    ExportedDateRangePickerViewElement<DesktopDateRangePickerProps> by ExportedDateRangePickerViewDelegate(),
    ExportedCalendarElement<DesktopDateRangePickerProps> by ExportedCalendarDelegate()


class StaticDateRangePickerElementBuilder internal constructor(
    type: ComponentType<StaticDateRangePickerProps>, className: String?, props: StaticDateRangePickerProps = jsObject { }
) : StaticWrapperElementBuilder<StaticDateRangePickerProps>(type, className, props),
    SharedDateRangePickerElement<StaticDateRangePickerProps> by DateRangePickerDelegate(),
    ArrowSwitcherElement<StaticDateRangePickerProps> by ArrowSwitcherDelegate(),
    ExportedDateRangePickerViewElement<StaticDateRangePickerProps> by ExportedDateRangePickerViewDelegate(),
    ExportedCalendarElement<StaticDateRangePickerProps> by ExportedCalendarDelegate()
