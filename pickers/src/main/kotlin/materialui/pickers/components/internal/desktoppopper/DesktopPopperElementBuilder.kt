package materialui.pickers.components.internal.desktoppopper

import kotlinext.js.jsObject
import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.components.popper.PopperProps
import materialui.pickers.components.BasePickerElementBuilder
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.*
import kotlin.reflect.KClass

abstract class DesktopPopperElementBuilder<P: DesktopPopperWrapperProps> internal constructor(
    type: RClass<P>, className: String?, pickerProps: P = jsObject { }
): BasePickerElementBuilder<DIV, P>(type, className, { DIV(mapOf(), it) }, pickerProps),
    DesktopPopperElement by DesktopPopperDelegate(pickerProps)
