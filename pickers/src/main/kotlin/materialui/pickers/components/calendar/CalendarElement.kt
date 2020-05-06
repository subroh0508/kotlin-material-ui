package materialui.pickers.components.calendar

import materialui.pickers.components.*
import react.RBuilder
import react.RProps
import react.ReactElement
import react.buildElement
import kotlin.js.Promise

interface ExportedCalendarElement {
    var RProps.showDaysOutsideCurrentMonth: Boolean?
    var RProps.disableHighlightToday: Boolean?
    var RProps.disablePast: Boolean?
    var RProps.disableFuture: Boolean?
    var RProps.renderDay: ((Any, Array<Any>, DayProps) -> Any)?
    fun RProps.renderDay(block: RBuilder.(Any, Array<Any>, DayProps) -> Unit)
    var RProps.allowKeyboardController: Boolean?
    var RProps.loadingIndicator: Any?
    fun RProps.loadingIndicator(block: RBuilder.() -> Unit)
}

internal class ExportedCalendarDelegate<P: ExportedCalendarProps>(props: P) : ExportedCalendarElement {
    override var RProps.showDaysOutsideCurrentMonth: Boolean? by props
    override var RProps.disableHighlightToday: Boolean? by props
    override var RProps.disablePast: Boolean? by props
    override var RProps.disableFuture: Boolean? by props

    override var RProps.renderDay: ((Any, Array<Any>, DayProps) -> Any)? by props
    override fun RProps.renderDay(block: RBuilder.(Any, Array<Any>, DayProps) -> Unit) {
        renderDay = { day ,selectedDates, props ->
            RBuilder().also { it.block(day, selectedDates, props) }
                .childList.first()
                .unsafeCast<ReactElement>()
        }
    }
    override var RProps.allowKeyboardController: Boolean? by props

    override var RProps.loadingIndicator: Any? by props
    override fun RProps.loadingIndicator(block: RBuilder.() -> Unit) { loadingIndicator = buildElement(block) }
}

interface ExportedCalendarViewElement {
    var RProps.getViewSwitchingButtonText: ((String) -> String)?
    fun RProps.getViewSwitchingButtonText(block: (String) -> String)
    var RProps.reduceAnimations: Boolean?
    var RProps.onMonthChange: Any?
    fun RProps.onMonthChange(block: (Any) -> Unit)
    fun RProps.onMonthChange(block: (Any) -> Promise<Unit>)
    var RProps.minDate: Any?
    var RProps.maxDate: Any?
    var RProps.shouldDisableDate: ((Any) -> Boolean)?
    fun RProps.shouldDisableDate(block: (Any) -> Boolean)
    var RProps.onYearChange: ((Any) -> Unit)?
    fun RProps.onYearChange(block: (Any) -> Unit)
}

internal class ExportedCalendarViewDelegate<P: ExportedCalendarViewProps>(props: P)  : ExportedCalendarViewElement {
    override var RProps.getViewSwitchingButtonText: ((String) -> String)? by props
    override fun RProps.getViewSwitchingButtonText(block: (String) -> String) { getViewSwitchingButtonText = block }

    override var RProps.reduceAnimations: Boolean? by props

    override var RProps.onMonthChange: Any? by props
    override fun RProps.onMonthChange(block: (Any) -> Unit) { onMonthChange = block }
    override fun RProps.onMonthChange(block: (Any) -> Promise<Unit>) { onMonthChange = block }

    override var RProps.minDate: Any? by props
    override var RProps.maxDate: Any? by props

    override var RProps.shouldDisableDate: ((Any) -> Boolean)? by props
    override fun RProps.shouldDisableDate(block: (Any) -> Boolean) { shouldDisableDate = block }

    override var RProps.onYearChange: ((Any) -> Unit)? by props
    override fun RProps.onYearChange(block: (Any) -> Unit) { onYearChange = block }
}
