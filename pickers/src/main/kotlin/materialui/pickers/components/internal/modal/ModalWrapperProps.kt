package materialui.pickers.components.internal.modal

import materialui.components.dialog.DialogProps
import materialui.pickers.components.BasePickerProps

external interface ModalWrapperProps : BasePickerProps {
    var okLabel: dynamic
    var cancelLabel: dynamic
    var clearLabel: dynamic
    var todayLabel: dynamic
    var showTodayButton: Boolean?
    var clearable: Boolean?
    @Suppress("PropertyName")
    var DialogProps: DialogProps?
    var showTabs: Boolean?
    var wider: Boolean?
}
