package materialui.pickers.components.internal.modal

import kotlinext.js.jsObject
import materialui.pickers.components.BasePickerElementBuilder
import react.ComponentType

abstract class ModalWrapperElementBuilder<P: ModalWrapperProps> internal constructor(
    type: ComponentType<P>, className: String?, pickerProps: P = jsObject { }
): BasePickerElementBuilder<P>(type, className, pickerProps),
        ModalElement<P> by ModalDelegate()
