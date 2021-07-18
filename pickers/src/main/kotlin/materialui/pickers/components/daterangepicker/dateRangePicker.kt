package materialui.pickers.components.daterangepicker

import materialui.pickers.components.ExportedDateRangePickerViewProps
import materialui.pickers.components.internal.desktop.DesktopWrapperProps
import materialui.pickers.components.internal.modal.ModalWrapperProps
import materialui.pickers.components.internal.responsive.ResponsiveWrapperProps
import materialui.pickers.components.internal.static.StaticWrapperProps
import react.ComponentType
import react.RBuilder

external interface SharedDateRangePickerProps : ExportedDateRangePickerViewProps {
    var startText: dynamic
    var endText: dynamic
}

@JsModule("@material-ui/pickers")
@JsNonModule
private external val DateRangePickerModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val DateRangePickerComponent: ComponentType<DateRangePickerProps> = DateRangePickerModule.DateRangePicker

external interface DateRangePickerProps : SharedDateRangePickerProps, ExportedDateRangePickerViewProps, ResponsiveWrapperProps

fun RBuilder.dateRangePicker(className: String? = null, block: DateRangePickerElementBuilder.() -> Unit) =
    child(DateRangePickerElementBuilder(DateRangePickerComponent, className).apply(block).create())

@Suppress("UnsafeCastFromDynamic")
private val MobileDateRangePickerComponent: ComponentType<MobileDateRangePickerProps> = DateRangePickerModule.MobileDateRangePicker

external interface MobileDateRangePickerProps : SharedDateRangePickerProps, ExportedDateRangePickerViewProps, ModalWrapperProps

fun RBuilder.mobileDateRangePicker(className: String? = null, block: MobileDateRangePickerElementBuilder.() -> Unit) =
    child(MobileDateRangePickerElementBuilder(MobileDateRangePickerComponent, className).apply(block).create())

@Suppress("UnsafeCastFromDynamic")
private val DesktopDateRangePickerComponent: ComponentType<DesktopDateRangePickerProps> = DateRangePickerModule.DesktopDateRangePicker

external interface DesktopDateRangePickerProps : SharedDateRangePickerProps, ExportedDateRangePickerViewProps, DesktopWrapperProps

fun RBuilder.desktopDateRangePicker(className: String? = null, block: DesktopDateRangePickerElementBuilder.() -> Unit) =
    child(DesktopDateRangePickerElementBuilder(DesktopDateRangePickerComponent, className).apply(block).create())

@Suppress("UnsafeCastFromDynamic")
private val StaticDateRangePickerComponent: ComponentType<StaticDateRangePickerProps> = DateRangePickerModule.StaticDateRangePicker

external interface StaticDateRangePickerProps : SharedDateRangePickerProps, ExportedDateRangePickerViewProps, StaticWrapperProps

fun RBuilder.staticDateRangePicker(className: String? = null, block: StaticDateRangePickerElementBuilder.() -> Unit) =
    child(StaticDateRangePickerElementBuilder(StaticDateRangePickerComponent, className).apply(block).create())
