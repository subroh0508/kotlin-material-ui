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

interface DesktopPopperElement<Props: DesktopPopperWrapperProps> {
    @Suppress("FunctionName")
    fun Props.PopperProps(block: PopperProps.() -> Unit)

    @Suppress("FunctionName")
    fun <P: RProps, C: Component<P, *>> Props.TransitionComponent(kClass: KClass<C>)
    @Suppress("FunctionName")
    fun <P: RProps> Props.TransitionComponent(functionalComponent: FunctionalComponent<P>)
}

internal class DesktopPopperDelegate<Props: DesktopPopperWrapperProps> : DesktopPopperElement<Props> {
    override fun Props.PopperProps(block: PopperProps.() -> Unit) { PopperProps = jsObject(block) }

    override fun <P: RProps, C: Component<P, *>> Props.TransitionComponent(kClass: KClass<C>) { TransitionComponent = kClass.rClass }
    override fun <P: RProps> Props.TransitionComponent(functionalComponent: FunctionalComponent<P>) { TransitionComponent = functionalComponent }
}
