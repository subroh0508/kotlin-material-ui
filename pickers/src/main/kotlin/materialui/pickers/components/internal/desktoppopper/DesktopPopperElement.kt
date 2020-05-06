package materialui.pickers.components.internal.desktoppopper

import kotlinext.js.jsObject
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
    var RProps.PopperProps: PopperProps?
    @Suppress("FunctionName")
    fun RProps.PopperProps(block: PopperProps.() -> Unit)

    @Suppress("PropertyName")
    var RProps.TransitionComponent: Any?
    @Suppress("FunctionName")
    fun <P: RProps, C: Component<P, *>> RProps.TransitionComponent(kClass: KClass<C>)
    @Suppress("FunctionName")
    fun <P: RProps> RProps.TransitionComponent(functionalComponent: FunctionalComponent<P>)
}

internal class DesktopPopperDelegate<P: DesktopPopperWrapperProps>(pickerProps: P) : DesktopPopperElement {
    override var RProps.PopperProps: PopperProps? by pickerProps
    override fun RProps.PopperProps(block: PopperProps.() -> Unit) { PopperProps = jsObject(block) }

    override var RProps.TransitionComponent: Any? by pickerProps
    override fun <P: RProps, C: Component<P, *>> RProps.TransitionComponent(kClass: KClass<C>) { TransitionComponent = kClass.rClass }
    override fun <P: RProps> RProps.TransitionComponent(functionalComponent: FunctionalComponent<P>) { TransitionComponent = functionalComponent }
}
