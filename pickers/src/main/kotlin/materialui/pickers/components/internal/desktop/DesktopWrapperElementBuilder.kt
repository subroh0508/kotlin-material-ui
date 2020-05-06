package materialui.pickers.components.internal.desktop

import kotlinext.js.jsObject
import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.components.popover.PopoverProps
import materialui.pickers.components.BasePickerElementBuilder
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.RClass

abstract class DesktopWrapperElementBuilder<P: DesktopWrapperProps> internal constructor(
    type: RClass<P>, className: String?
) : BasePickerElementBuilder<DIV, P>(type, className, { DIV(mapOf(), it) }) {
    @Suppress("PropertyName")
    var Tag.PopoverProps: PopoverProps? by pickerProps
    @Suppress("FunctionName")
    fun Tag.PopoverProps(block: PopoverProps.() -> Unit) { PopoverProps = jsObject(block) }
}
