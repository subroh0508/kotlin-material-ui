package materialui.pickers.components.internal.responsive

import kotlinext.js.jsObject
import kotlinx.html.DIV
import materialui.pickers.components.BasePickerElementBuilder
import materialui.pickers.components.internal.desktop.DesktopDelegate
import materialui.pickers.components.internal.desktop.DesktopElement
import materialui.pickers.components.internal.desktoppopper.DesktopPopperDelegate
import materialui.pickers.components.internal.desktoppopper.DesktopPopperElement
import materialui.pickers.components.internal.modal.ModalDelegate
import materialui.pickers.components.internal.modal.ModalElement
import react.RClass

abstract class ResponsiveWrapperElement<P: ResponsiveWrapperProps> internal constructor(
    type: RClass<P>, className: String?, pickerProps: P = jsObject { }
) : BasePickerElementBuilder<DIV, P>(type, className, { DIV(mapOf(), it) }, pickerProps),
        DesktopElement by DesktopDelegate(pickerProps),
        DesktopPopperElement by DesktopPopperDelegate(pickerProps),
        ModalElement by ModalDelegate(pickerProps)
