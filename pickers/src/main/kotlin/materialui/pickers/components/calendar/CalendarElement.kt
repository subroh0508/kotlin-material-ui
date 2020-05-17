package materialui.pickers.components.calendar

import materialui.pickers.components.*
import materialui.pickers.components.day.DayProps
import react.RBuilder
import react.ReactElement
import react.buildElement
import kotlin.js.Promise

interface ExportedCalendarElement<P: ExportedCalendarProps> {
    fun P.renderDay(block: RBuilder.(Any, Array<Any>, DayProps) -> Unit)
    fun P.loadingIndicator(block: RBuilder.() -> Unit)
}

internal class ExportedCalendarDelegate<P: ExportedCalendarProps> : ExportedCalendarElement<P> {
    override fun P.renderDay(block: RBuilder.(Any, Array<Any>, DayProps) -> Unit) {
        renderDay = { day ,selectedDates, props ->
            RBuilder().also { it.block(day as Any, selectedDates as Array<Any>, props) }
                .childList.first()
                .unsafeCast<ReactElement>()
        }
    }
    override fun P.loadingIndicator(block: RBuilder.() -> Unit) { loadingIndicator = buildElement(block) }
}

interface ExportedCalendarViewElement<P: ExportedCalendarViewProps> {
    fun P.getViewSwitchingButtonTextFunc(block: (String) -> String)
    fun P.onMonthChangeFunc(block: (Any) -> Unit)
    fun P.onMonthChangeFunc(block: (Any) -> Promise<Unit>)
    fun P.shouldDisableDateFunc(block: (Any) -> Boolean)
    fun P.onYearChangeFunc(block: (Any) -> Unit)
}

internal class ExportedCalendarViewDelegate<P: ExportedCalendarViewProps> : ExportedCalendarViewElement<P> {
    override fun P.getViewSwitchingButtonTextFunc(block: (String) -> String) { getViewSwitchingButtonText = block }

    override fun P.onMonthChangeFunc(block: (Any) -> Unit) { onMonthChange = block }
    override fun P.onMonthChangeFunc(block: (Any) -> Promise<Unit>) { onMonthChange = block }

    override fun P.shouldDisableDateFunc(block: (Any) -> Boolean) { shouldDisableDate = block }

    override fun P.onYearChangeFunc(block: (Any) -> Unit) { onYearChange = block }
}
