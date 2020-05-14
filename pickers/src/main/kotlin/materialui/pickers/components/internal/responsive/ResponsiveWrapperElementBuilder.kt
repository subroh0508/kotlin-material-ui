package materialui.pickers.components.internal.responsive

import kotlinext.js.jsObject
import materialui.pickers.components.BasePickerElementBuilder
import materialui.pickers.components.internal.desktop.DesktopDelegate
import materialui.pickers.components.internal.desktop.DesktopElement
import materialui.pickers.components.internal.desktoppopper.DesktopPopperDelegate
import materialui.pickers.components.internal.desktoppopper.DesktopPopperElement
import materialui.pickers.components.internal.modal.ModalDelegate
import materialui.pickers.components.internal.modal.ModalElement
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.RClass
import react.RProps

abstract class ResponsiveWrapperElementBuilder<P: ResponsiveWrapperProps> internal constructor(
    type: RClass<P>, className: String?, props: P = jsObject { }
) : BasePickerElementBuilder<P>(type, className, props),
        DesktopElement by DesktopDelegate(props),
        DesktopPopperElement by DesktopPopperDelegate(props),
        ModalElement by ModalDelegate(props)
{
    var RProps.desktopModeMediaQuery: String? by props
}
