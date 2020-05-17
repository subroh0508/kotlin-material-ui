package materialui.pickers.components.internal.desktop

import kotlinext.js.jsObject
import kotlinx.html.DIV
import materialui.pickers.components.BasePickerElementBuilder
import react.RClass

abstract class DesktopWrapperElementBuilder<P: DesktopWrapperProps> internal constructor(
    type: RClass<P>, className: String?, props: P = jsObject { }
) : BasePickerElementBuilder<P>(type, className, props),
        DesktopElement<P> by DesktopDelegate()
