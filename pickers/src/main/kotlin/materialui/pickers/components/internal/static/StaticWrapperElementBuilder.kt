package materialui.pickers.components.internal.static

import kotlinext.js.jsObject
import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.pickers.components.BasePickerElementBuilder
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.RClass
import react.RProps

abstract class StaticWrapperElementBuilder<P: StaticWrapperProps> internal constructor(
    type: RClass<P>, className: String?, props: P = jsObject { }
) : BasePickerElementBuilder<P>(type, className, props),
        StaticElement by StaticDelegate(props)
