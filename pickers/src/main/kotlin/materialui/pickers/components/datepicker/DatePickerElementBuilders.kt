package materialui.pickers.components.datepicker

import materialui.pickers.components.internal.modal.ModalWrapperElementBuilder
import react.RClass

class MobileDatePickerElementBuilder internal constructor(
    type: RClass<MobileDatePickerProps>, className: String?
) : ModalWrapperElementBuilder<MobileDatePickerProps>(type, className)
