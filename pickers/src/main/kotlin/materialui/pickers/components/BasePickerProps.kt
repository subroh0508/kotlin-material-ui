package materialui.pickers.components

import org.w3c.dom.events.Event
import react.RProps
import react.RRef
import react.dom.WithClassName
import kotlin.reflect.KProperty

external interface BasePickerProps : WithClassName, DateValidationProps {
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
    @Suppress("PropertyName")
    var ToolbarComponent: dynamic
    var toolbarTitle: dynamic
    var toolbarFormat: String?

    /* ExportedPickerProps */
    var hideTabs: Boolean?
    var dateRangeIcon: dynamic
    var timeIcon: dynamic
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
