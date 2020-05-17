package materialui.pickers.components.daterangepicker

import materialui.components.textfield.TextFieldProps
import materialui.pickers.components.ExportedDateRangePickerViewProps
import react.RBuilder
import react.buildElement
import kotlin.js.Promise

interface SharedDateRangePickerElement<P: SharedDateRangePickerProps> {
    fun P.startText(block: RBuilder.() -> Unit)
    fun P.endText(block: RBuilder.() -> Unit)
}

internal class DateRangePickerDelegate<P: SharedDateRangePickerProps> : SharedDateRangePickerElement<P> {
    override fun P.startText(block: RBuilder.() -> Unit) { startText = buildElement(block) }
    override fun P.endText(block: RBuilder.() -> Unit) { endText = buildElement(block) }
}

interface ExportedDateRangePickerViewElement<P: ExportedDateRangePickerViewProps> {
    fun P.getViewSwitchingButtonTextFunc(block: (String) -> String)
    fun P.onMonthChangeFunc(block: (Any) -> Unit)
    fun P.onMonthChangeFunc(block: (Any) -> Promise<Unit>)
    fun P.shouldDisableDateFunc(block: (Any) -> Boolean)
    fun P.renderInput(block: RBuilder.(TextFieldProps, TextFieldProps) -> Unit)
}

internal class ExportedDateRangePickerViewDelegate<P: ExportedDateRangePickerViewProps> : ExportedDateRangePickerViewElement<P> {
    override fun P.getViewSwitchingButtonTextFunc(block: (String) -> String) { getViewSwitchingButtonText = block }

    override fun P.onMonthChangeFunc(block: (Any) -> Unit) { onMonthChange = block }
    override fun P.onMonthChangeFunc(block: (Any) -> Promise<Unit>) { onMonthChange = block }

    override fun P.shouldDisableDateFunc(block: (Any) -> Boolean) { shouldDisableDate = block }

    override fun P.renderInput(block: RBuilder.(TextFieldProps, TextFieldProps) -> Unit) {
        renderInput = { startProps, endProps -> buildElement { block(startProps, endProps) } }
    }
}
