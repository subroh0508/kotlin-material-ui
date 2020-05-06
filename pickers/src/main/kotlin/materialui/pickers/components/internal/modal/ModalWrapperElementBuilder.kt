package materialui.pickers.components.internal.modal

import kotlinext.js.jsObject
import materialui.pickers.components.BasePickerElementBuilder
import react.RClass

abstract class ModalWrapperElementBuilder<P: ModalWrapperProps> internal constructor(
    type: RClass<P>, className: String?, pickerProps: P = jsObject { }
): BasePickerElementBuilder<P>(type, className, pickerProps),
        ModalElement by ModalDelegate(pickerProps)
