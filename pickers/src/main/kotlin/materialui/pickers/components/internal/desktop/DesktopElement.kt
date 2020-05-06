package materialui.pickers.components.internal.desktop

import kotlinext.js.jsObject
import kotlinx.html.Tag
import materialui.components.popover.PopoverProps
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue

interface DesktopElement {
    @Suppress("PropertyName")
    var Tag.PopoverProps: PopoverProps?
    @Suppress("FunctionName")
    fun Tag.PopoverProps(block: PopoverProps.() -> Unit)
}

internal class DesktopDelegate<P: DesktopWrapperProps>(pickerProps: P) : DesktopElement {
    override var Tag.PopoverProps: PopoverProps? by pickerProps
    override fun Tag.PopoverProps(block: PopoverProps.() -> Unit) { PopoverProps = jsObject(block) }
}
