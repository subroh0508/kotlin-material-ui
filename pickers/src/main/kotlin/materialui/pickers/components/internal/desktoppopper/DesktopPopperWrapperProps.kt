package materialui.pickers.components.internal.desktoppopper

import materialui.components.popper.PopperProps
import materialui.pickers.components.BasePickerProps

external interface DesktopPopperWrapperProps : BasePickerProps {
    @Suppress("PropertyName")
    var PopperProps: PopperProps?
    @Suppress("PropertyName")
    var TransitionComponent: dynamic
}
