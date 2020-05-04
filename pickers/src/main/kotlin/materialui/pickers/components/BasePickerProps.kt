package materialui.pickers.components

import org.w3c.dom.events.Event
import react.RProps
import react.RRef
import react.dom.WithClassName
import kotlin.reflect.KProperty

external interface BasePickerProps : WithClassName {
    var value: dynamic
    var onChange: ((dynamic, String?) -> Unit)?
    var autoOk: Boolean?
    var inputFormat: String?
    var disabled: Boolean?
    var readOnly: Boolean?
    var defaultHighlight: dynamic
    var onAccept: ((dynamic) -> Unit)?
    var onError: ((dynamic, dynamic) -> Unit)?
    var onOpen: (() -> Unit)?
    var onClose: (() -> Unit)?
    var open: Boolean?
    var showToolbar: Boolean?
    var orientation: String?
    var ToolbarComponent: dynamic
    var toolbarTitle: dynamic
    var toolbarFormat: String?
}

@Suppress("EnumEntryName")
enum class PickerOrientation {
    portrait, landscape
}

external interface DayProps : RProps {
    var day: dynamic
    var focused: Boolean?
    var focusable: Boolean?
    var inCurrentMonth: Boolean?
    var isAnimating: Boolean?
    var today: Boolean?
    var disabled: Boolean?
    var selected: Boolean?
    var allowKeyboardControl: Boolean?
    var disableMargin: Boolean?
    var showDaysOutsideCurrentMonth: Boolean?
    var disableHighlightToday: Boolean?
    var onDayFocus: ((dynamic) -> Unit)?
    var onDaySelect: ((dynamic, dynamic) -> Unit)?

    /* ButtonBaseProps properties */
    var buttonRef: RRef?
    var centerRipple: Boolean?
    var disableRipple: Boolean?
    var disableTouchRipple: Boolean?
    var focusRipple: Boolean?
    var focusVisibleClassName: String?
    var onFocusVisible: ((Event) -> Unit)?
    var touchRippleProps: RProps?
    var type: String?
}

external interface ExportedCalendarProps : RProps {
    var showDaysOutsideCurrentMonth: Boolean?
    var disableHighlightToday: Boolean?
    //var onChange: ((dynamic, dynamic) -> Unit)?  TODO delete
    var disablePast: Boolean?
    var disableFuture: Boolean?
    var renderDay: ((dynamic, dynamic, DayProps) -> dynamic)?
    var allowKeyboardController: Boolean?
    var loadingIndicator: dynamic
}

external interface ExportedClockViewProps : RProps {
    var ampm: Boolean?
    var minutesStep: Int?
    var ampmInClock: Boolean?
    var allowKeyboardControl: Boolean?
    var minTime: dynamic
    var maxTime: dynamic
    var shouldDisableTime: ((Int, String) -> Boolean)?
    var disableTimeValidationIgnoreDatePart: Boolean?
}

external interface ToolbarComponentProps : ExportedCalendarProps, ExportedClockViewProps {
    var views: Array<String>?
    var openView: String?
    var date: dynamic
    var setOpenView: ((String) -> Unit)
    var onChange: ((dynamic, Boolean) -> Unit)?
    var toolbarTitle: dynamic
    var toolbarFormat: String?
    var hideTabs: Boolean?
    var dateRangeIcon: dynamic
    var timeIcon: dynamic
    var isLandscape: Boolean?
    //var ampmInClock: Boolean? TODO delete
    var isMobileKeyBoardViewOpen: Boolean?
    var toggleMobileKeyboardView: Boolean?
    var getMobileKeyboardInputViewButtonText: (() -> String)?
}

operator fun BasePickerProps.get(key: String): Any? = asDynamic()[key]

operator fun BasePickerProps.getValue(thisRef: Any?, property: KProperty<*>): dynamic
        = asDynamic()[property.name]

operator fun BasePickerProps.setValue(thisRef: Any?, property: KProperty<*>, value: dynamic) {
    asDynamic()[property.name] = value
}

inline operator fun <reified T: Enum<T>> BasePickerProps.getValue(thisRef: Any?, property: KProperty<*>): T?
        = (asDynamic()[property.name] as String?)?.let { name -> enumValues<T>().find { it.toString() == name } }

inline operator fun <reified T: Enum<T>> BasePickerProps.setValue(thisRef: Any?, property: KProperty<*>, value: T?) {
    asDynamic()[property.name] = value?.toString()
}
