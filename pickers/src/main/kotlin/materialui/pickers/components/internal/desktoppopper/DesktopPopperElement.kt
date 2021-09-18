package materialui.pickers.components.internal.desktoppopper

import kotlinext.js.jsObject
import materialui.components.popper.PopperProps
import react.*
import kotlin.reflect.KClass

interface DesktopPopperElement<Props: DesktopPopperWrapperProps> {
    @Suppress("FunctionName")
    fun Props.PopperProps(block: PopperProps.() -> Unit)

    @Suppress("FunctionName")
    fun <P: PropsWithChildren, C: Component<P, *>> Props.TransitionComponent(kClass: KClass<C>)
    @Suppress("FunctionName")
    fun <P: PropsWithChildren> Props.TransitionComponent(functionComponent: FunctionComponent<P>)
}

internal class DesktopPopperDelegate<Props: DesktopPopperWrapperProps> : DesktopPopperElement<Props> {
    override fun Props.PopperProps(block: PopperProps.() -> Unit) { PopperProps = jsObject(block) }

    override fun <P: PropsWithChildren, C: Component<P, *>> Props.TransitionComponent(kClass: KClass<C>) { TransitionComponent = kClass.react }
    override fun <P: PropsWithChildren> Props.TransitionComponent(functionComponent: FunctionComponent<P>) { TransitionComponent = functionComponent }
}
