package materialui.pickers.components.internal.desktop

import kotlinext.js.jsObject
import materialui.components.popover.PopoverProps
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.RProps

interface DesktopElement<P: DesktopWrapperProps> {
    @Suppress("FunctionName")
    fun P.PopoverProps(block: PopoverProps.() -> Unit)
}

internal class DesktopDelegate<P: DesktopWrapperProps> : DesktopElement<P> {
    override fun P.PopoverProps(block: PopoverProps.() -> Unit) { PopoverProps = jsObject(block) }
}
