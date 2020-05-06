package materialui.pickers.components.internal.modal

import kotlinext.js.jsObject
import kotlinx.html.DIV
import materialui.pickers.components.BasePickerElementBuilder
import react.RClass

abstract class ModalWrapperElementBuilder<P: ModalWrapperProps> internal constructor(
    type: RClass<P>, className: String?, pickerProps: P = jsObject { }
): BasePickerElementBuilder<DIV, P>(type, className, { DIV(mapOf(), it) }, pickerProps),
        ModalElement by ModalDelegate(pickerProps)
