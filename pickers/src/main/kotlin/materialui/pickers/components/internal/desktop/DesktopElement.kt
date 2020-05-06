package materialui.pickers.components.internal.desktop

import kotlinext.js.jsObject
import materialui.components.popover.PopoverProps
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.RProps

interface DesktopElement {
    @Suppress("PropertyName")
    var RProps.PopoverProps: PopoverProps?
    @Suppress("FunctionName")
    fun RProps.PopoverProps(block: PopoverProps.() -> Unit)
}

internal class DesktopDelegate<P: DesktopWrapperProps>(pickerProps: P) : DesktopElement {
    override var RProps.PopoverProps: PopoverProps? by pickerProps
    override fun RProps.PopoverProps(block: PopoverProps.() -> Unit) { PopoverProps = jsObject(block) }
}
