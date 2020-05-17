package materialui.pickers.components.day

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.buttonbase.ButtonBaseProps
import react.RBuilder
import react.RClass

external interface DayProps : ButtonBaseProps {
    var day: dynamic
    var focused: Boolean?
    var focusable: Boolean?
    var inCurrentMonth: Boolean?
    var isAnimating: Boolean?
    var today: Boolean?
    var selected: Boolean?
    var allowKeyboardControl: Boolean?
    var disableMargin: Boolean?
    var showDaysOutsideCurrentMonth: Boolean?
    var disableHighlightToday: Boolean?
    var onDayFocus: ((dynamic) -> Unit)?
    var onDaySelect: ((dynamic, dynamic) -> Unit)?
}

@JsModule("@material-ui/pickers")
private external val DayModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val DayComponent: RClass<DayProps> = DayModule.Day

fun RBuilder.day(className: String? = null, block: DayElementBuilder<BUTTON>.() -> Unit) =
    child(DayElementBuilder(DayComponent, className) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.day(className: String? = null, factory: (TagConsumer<Unit>) -> T, block: DayElementBuilder<T>.() -> Unit) =
    child(DayElementBuilder(DayComponent, className, factory).apply(block).create())
