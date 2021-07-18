package materialui.pickers.components.internal.desktop

import kotlinext.js.jsObject
import materialui.pickers.components.BasePickerElementBuilder
import react.ComponentType

abstract class DesktopWrapperElementBuilder<P: DesktopWrapperProps> internal constructor(
    type: ComponentType<P>, className: String?, props: P = jsObject { }
) : BasePickerElementBuilder<P>(type, className, props),
        DesktopElement<P> by DesktopDelegate()
