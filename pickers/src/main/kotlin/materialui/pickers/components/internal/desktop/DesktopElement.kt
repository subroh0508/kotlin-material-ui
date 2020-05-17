package materialui.pickers.components.internal.desktop

import kotlinext.js.jsObject
import materialui.components.popover.PopoverProps

interface DesktopElement<P: DesktopWrapperProps> {
    @Suppress("FunctionName")
    fun P.PopoverProps(block: PopoverProps.() -> Unit)
}

internal class DesktopDelegate<P: DesktopWrapperProps> : DesktopElement<P> {
    override fun P.PopoverProps(block: PopoverProps.() -> Unit) { PopoverProps = jsObject(block) }
}
