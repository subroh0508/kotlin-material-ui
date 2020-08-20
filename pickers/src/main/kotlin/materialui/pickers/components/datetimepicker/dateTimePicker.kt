package materialui.pickers.components.datetimepicker

import materialui.pickers.components.ExportedCalendarViewProps
import materialui.pickers.components.ExportedClockViewProps
import materialui.pickers.components.WithViewProps
import materialui.pickers.components.internal.desktop.DesktopWrapperProps
import materialui.pickers.components.internal.modal.ModalWrapperProps
import materialui.pickers.components.internal.responsive.ResponsiveWrapperProps
import materialui.pickers.components.internal.static.StaticWrapperProps
import react.RBuilder
import react.RClass

external interface SharedDateTimePickerProps : ExportedCalendarViewProps, ExportedClockViewProps, WithViewProps {
    var minDateTime: dynamic
    var maxDateTime: dynamic
}

@JsModule("@material-ui/pickers")
@JsNonModule
private external val DateTimePickerModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val DateTimePickerComponent: RClass<DateTimePickerProps> = DateTimePickerModule.DateTimePicker

external interface DateTimePickerProps : SharedDateTimePickerProps, ExportedCalendarViewProps, ExportedClockViewProps, WithViewProps, ResponsiveWrapperProps

fun RBuilder.dateTimePicker(className: String? = null, block: DateTimePickerElementBuilder.() -> Unit) =
        child(DateTimePickerElementBuilder(DateTimePickerComponent, className).apply(block).create())

@Suppress("UnsafeCastFromDynamic")
private val MobileDateTimePickerComponent: RClass<MobileDateTimePickerProps> = DateTimePickerModule.MobileDateTimePicker

external interface MobileDateTimePickerProps : SharedDateTimePickerProps, ExportedCalendarViewProps, ExportedClockViewProps, WithViewProps, ModalWrapperProps

fun RBuilder.mobileDateTimePicker(className: String? = null, block: MobileDateTimePickerElementBuilder.() -> Unit) =
        child(MobileDateTimePickerElementBuilder(MobileDateTimePickerComponent, className).apply(block).create())

@Suppress("UnsafeCastFromDynamic")
private val DesktopDateTimePickerComponent: RClass<DesktopDateTimePickerProps> = DateTimePickerModule.DesktopDateTimePicker

external interface DesktopDateTimePickerProps : SharedDateTimePickerProps, ExportedCalendarViewProps, ExportedClockViewProps, WithViewProps, DesktopWrapperProps

fun RBuilder.desktopDateTimePicker(className: String? = null, block: DesktopDateTimePickerElementBuilder.() -> Unit) =
        child(DesktopDateTimePickerElementBuilder(DesktopDateTimePickerComponent, className).apply(block).create())

@Suppress("UnsafeCastFromDynamic")
private val StaticDateTimePickerComponent: RClass<StaticDateTimePickerProps> = DateTimePickerModule.StaticDateTimePicker

external interface StaticDateTimePickerProps : SharedDateTimePickerProps, ExportedCalendarViewProps, ExportedClockViewProps, WithViewProps, StaticWrapperProps

fun RBuilder.staticDateTimePicker(className: String? = null, block: StaticDateTimePickerElementBuilder.() -> Unit) =
        child(StaticDateTimePickerElementBuilder(StaticDateTimePickerComponent, className).apply(block).create())


