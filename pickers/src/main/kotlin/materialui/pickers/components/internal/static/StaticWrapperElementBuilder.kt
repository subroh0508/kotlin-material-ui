package materialui.pickers.components.internal.static

import kotlinext.js.jsObject
import materialui.pickers.components.BasePickerElementBuilder
import react.ComponentType

abstract class StaticWrapperElementBuilder<P: StaticWrapperProps> internal constructor(
    type: ComponentType<P>, className: String?, props: P = jsObject { }
) : BasePickerElementBuilder<P>(type, className, props),
        StaticElement<P> by StaticDelegate()
