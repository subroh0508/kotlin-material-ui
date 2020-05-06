package materialui.pickers.components.datepicker

import materialui.pickers.components.ExportedCalendarViewProps
import materialui.pickers.components.WithViewProps
import materialui.pickers.components.internal.modal.ModalWrapperProps
import materialui.pickers.components.internal.static.StaticWrapperProps
import react.RBuilder
import react.RClass

@JsModule("@material-ui/pickers")
private external val DatePickerModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val MobileDatePickerComponent: RClass<MobileDatePickerProps> = DatePickerModule.MobileDatePicker

external interface MobileDatePickerProps : ExportedCalendarViewProps, WithViewProps, ModalWrapperProps

fun RBuilder.mobileDatePicker(className: String? = null, block: MobileDatePickerElementBuilder.() -> Unit) =
    child(MobileDatePickerElementBuilder(MobileDatePickerComponent, className).apply(block).create())

@Suppress("UnsafeCastFromDynamic")
private val StaticDatePickerComponent: RClass<StaticDatePickerProps> = DatePickerModule.StaticDatePicker

external interface StaticDatePickerProps : ExportedCalendarViewProps, WithViewProps, StaticWrapperProps

fun RBuilder.staticDatePicker(className: String? = null, block: StaticDatePickerElementBuilder.() -> Unit) =
    child(StaticDatePickerElementBuilder(StaticDatePickerComponent, className).apply(block).create())

