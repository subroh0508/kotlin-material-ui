package materialui.pickers.components.internal.desktoppopper

import kotlinext.js.jsObject
import kotlinx.html.DIV
import materialui.pickers.components.BasePickerElementBuilder
import react.*

abstract class DesktopPopperElementBuilder<P: DesktopPopperWrapperProps> internal constructor(
    type: ComponentClass<P>, className: String?, props: P = jsObject { }
): BasePickerElementBuilder<P>(type, className, props),
    DesktopPopperElement<P> by DesktopPopperDelegate()
