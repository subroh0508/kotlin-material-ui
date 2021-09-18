package materialui.pickers.components

import materialui.components.textfield.TextFieldProps
import react.PropsWithClassName

external interface BasePickerProps : DateValidationProps, TextFieldProps, PropsWithClassName {
    var onChange: ((dynamic, String?) -> Unit)?
    var autoOk: Boolean?
    var inputFormat: String?
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

    /* PickerWrapper */
    var isMobileKeyboardViewOpen: Boolean?
    var toggleMobileKeyboardView: (() -> Unit)?
    var date: dynamic
    @Suppress("PropertyName")
    var DateInputProps: DateInputProps?
    var onDateChange: ((dynamic, String, dynamic) -> Unit)?
    @Suppress("PropertyName")
    var KeyboardDateInputComponent: dynamic
    @Suppress("PropertyName")
    var PureDateInputComponent: dynamic
}
