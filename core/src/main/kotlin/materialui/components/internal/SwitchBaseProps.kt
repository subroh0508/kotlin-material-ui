package materialui.components.internal

import materialui.components.StandardProps
import react.PropsWithChildren
import react.Ref
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
    var inputProps: PropsWithChildren?
    var inputRef: Ref<*>?
    var name: String?
    var readOnly: Boolean?
    var required: Boolean?
    var tabIndex: Any?
    var type: String?
    var value: Any?
}