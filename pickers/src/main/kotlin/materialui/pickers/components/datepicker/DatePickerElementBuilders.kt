package materialui.pickers.components.datepicker

import materialui.pickers.components.internal.desktop.DesktopWrapperElementBuilder
import materialui.pickers.components.internal.modal.ModalWrapperElementBuilder
import materialui.pickers.components.internal.static.StaticWrapperElementBuilder
import react.RClass

class MobileDatePickerElementBuilder internal constructor(
    type: RClass<MobileDatePickerProps>, className: String?
) : ModalWrapperElementBuilder<MobileDatePickerProps>(type, className)

class DesktopDatePickerElementBuilder internal constructor(
    type: RClass<DesktopDatePickerProps>, className: String?
) : DesktopWrapperElementBuilder<DesktopDatePickerProps>(type, className)

class StaticDatePickerElementBuilder internal constructor(
    type: RClass<StaticDatePickerProps>, className: String?
) : StaticWrapperElementBuilder<StaticDatePickerProps>(type, className)
