package materialui.pickers.components.calendar

import kotlinx.html.Tag
import materialui.pickers.components.*
import react.RBuilder
import react.ReactElement
import react.buildElement
import kotlin.js.Promise

interface ExportedCalendarElement {
    var Tag.showDaysOutsideCurrentMonth: Boolean?
    var Tag.disableHighlightToday: Boolean?
    //var onChange: ((dynamic, dynamic) -> Unit)?  TODO delete
    var Tag.disablePast: Boolean?
    var Tag.disableFuture: Boolean?
    var Tag.renderDay: ((Any, Array<Any>, DayProps) -> Any)?
    fun Tag.renderDay(block: RBuilder.(Any, Array<Any>, DayProps) -> Unit)
    var Tag.allowKeyboardController: Boolean?
    var Tag.loadingIndicator: Any?
    fun Tag.loadingIndicator(block: RBuilder.() -> Unit)
}

internal class ExportedCalendarDelegate<P: ExportedCalendarProps>(props: P) : ExportedCalendarElement {
    override var Tag.showDaysOutsideCurrentMonth: Boolean? by props
    override var Tag.disableHighlightToday: Boolean? by props
    //var onChange: ((dynamic, dynamic) -> Unit)?  TODO delete
    override var Tag.disablePast: Boolean? by props
    override var Tag.disableFuture: Boolean? by props

    override var Tag.renderDay: ((Any, Array<Any>, DayProps) -> Any)? by props
    override fun Tag.renderDay(block: RBuilder.(Any, Array<Any>, DayProps) -> Unit) {
        renderDay = { day ,selectedDates, props ->
            RBuilder().also { it.block(day, selectedDates, props) }
                .childList.first()
                .unsafeCast<ReactElement>()
        }
    }
    override var Tag.allowKeyboardController: Boolean? by props

    override var Tag.loadingIndicator: Any? by props
    override fun Tag.loadingIndicator(block: RBuilder.() -> Unit) { loadingIndicator = buildElement(block) }
}

interface ExportedCalendarViewElement {
    var Tag.getViewSwitchingButtonText: ((String) -> String)?
    fun Tag.getViewSwitchingButtonText(block: (String) -> String)
    var Tag.reduceAnimations: Boolean?
    var Tag.onMonthChange: Any?
    fun Tag.onMonthChange(block: (Any) -> Unit)
    fun Tag.onMonthChange(block: (Any) -> Promise<Unit>)
    var Tag.minDate: Any?
    var Tag.maxDate: Any?
    var Tag.shouldDisableDate: ((Any) -> Boolean)?
    fun Tag.shouldDisableDate(block: (Any) -> Boolean)
    var Tag.onYearChange: ((Any) -> Unit)?
    fun Tag.onYearChange(block: (Any) -> Unit)
}

internal class ExportedCalendarViewDelegate<P: ExportedCalendarViewProps>(props: P)  : ExportedCalendarViewElement {
    override var Tag.getViewSwitchingButtonText: ((String) -> String)? by props
    override fun Tag.getViewSwitchingButtonText(block: (String) -> String) { getViewSwitchingButtonText = block }

    override var Tag.reduceAnimations: Boolean? by props

    override var Tag.onMonthChange: Any? by props
    override fun Tag.onMonthChange(block: (Any) -> Unit) { onMonthChange = block }
    override fun Tag.onMonthChange(block: (Any) -> Promise<Unit>) { onMonthChange = block }

    override var Tag.minDate: Any? by props
    override var Tag.maxDate: Any? by props

    override var Tag.shouldDisableDate: ((Any) -> Boolean)? by props
    override fun Tag.shouldDisableDate(block: (Any) -> Boolean) { shouldDisableDate = block }

    override var Tag.onYearChange: ((Any) -> Unit)? by props
    override fun Tag.onYearChange(block: (Any) -> Unit) { onYearChange = block }
}
