package materialui.pickers.components.internal.static

import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.pickers.components.BasePickerElementBuilder
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.RClass

abstract class StaticWrapperElementBuilder<P: StaticWrapperProps> internal constructor(
    type: RClass<P>, className: String?
) : BasePickerElementBuilder<DIV, P>(type, className, { DIV(mapOf(), it) }) {
    var Tag.displayStaticWrapperAs: DisplayStaticWrapperAs? by pickerProps
}
