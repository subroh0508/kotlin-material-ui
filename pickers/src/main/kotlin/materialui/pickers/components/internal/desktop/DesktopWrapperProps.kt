package materialui.pickers.components.internal.desktop

import materialui.components.popover.PopoverProps
import materialui.pickers.components.BasePickerProps

external interface DesktopWrapperProps : BasePickerProps {
    @Suppress("PropertyName")
    var PopoverProps: PopoverProps?
}
