package materialui.pickers.components.internal.desktop

import kotlinext.js.jsObject
import kotlinx.html.DIV
import materialui.pickers.components.BasePickerElementBuilder
import react.RClass

abstract class DesktopWrapperElementBuilder<P: DesktopWrapperProps> internal constructor(
    type: RClass<P>, className: String?, pickerProps: P = jsObject { }
) : BasePickerElementBuilder<DIV, P>(type, className, { DIV(mapOf(), it) }, pickerProps),
        DesktopElement by DesktopDelegate(pickerProps)
