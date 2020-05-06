package materialui.pickers.components.internal.static

import kotlinext.js.jsObject
import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.pickers.components.BasePickerElementBuilder
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.RClass

abstract class StaticWrapperElementBuilder<P: StaticWrapperProps> internal constructor(
    type: RClass<P>, className: String?, props: P = jsObject { }
) : BasePickerElementBuilder<DIV, P>(type, className, { DIV(mapOf(), it) }, props) {
    var Tag.displayStaticWrapperAs: DisplayStaticWrapperAs? by pickerProps
}
