package materialui.components.internal

import materialui.components.StandardProps
import react.RProps
import react.RRef
import react.ReactElement

external interface SwitchBaseProps : StandardProps {
    var autoFocus: Boolean?
    var checked: Boolean?
    var checkedIcon: ReactElement?
    var defaultChecked: Boolean?
    var disabled: Boolean?
    var disableRipple: Boolean?
    var icon: ReactElement?
    var id: String?
    var inputProps: RProps?
    var inputRef: RRef?
    var name: String?
    var readOnly: Boolean?
    var required: Boolean?
    var tabIndex: Any?
    var type: String?
    var value: Any?
}