package materialui.pickers.components.internal.desktoppopper

import kotlinext.js.jsObject
import kotlinx.html.Tag
import materialui.components.popper.PopperProps
import materialui.pickers.components.getValue
import materialui.pickers.components.setValue
import react.Component
import react.FunctionalComponent
import react.RProps
import react.rClass
import kotlin.reflect.KClass

interface DesktopPopperElement {
    @Suppress("PropertyName")
    var Tag.PopperProps: PopperProps?
    @Suppress("FunctionName")
    fun Tag.PopperProps(block: PopperProps.() -> Unit)

    @Suppress("PropertyName")
    var Tag.TransitionComponent: Any?
    @Suppress("FunctionName")
    fun <P: RProps, C: Component<P, *>> Tag.TransitionComponent(kClass: KClass<C>)
    @Suppress("FunctionName")
    fun <P: RProps> Tag.TransitionComponent(functionalComponent: FunctionalComponent<P>)
}

internal class DesktopPopperDelegate<P: DesktopPopperWrapperProps>(pickerProps: P) : DesktopPopperElement {
    override var Tag.PopperProps: PopperProps? by pickerProps
    override fun Tag.PopperProps(block: PopperProps.() -> Unit) { PopperProps = jsObject(block) }

    override var Tag.TransitionComponent: Any? by pickerProps
    override fun <P: RProps, C: Component<P, *>> Tag.TransitionComponent(kClass: KClass<C>) { TransitionComponent = kClass.rClass }
    override fun <P: RProps> Tag.TransitionComponent(functionalComponent: FunctionalComponent<P>) { TransitionComponent = functionalComponent }
}
