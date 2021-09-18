package materialui.reacttransiton

import kotlinext.js.jsObject
import react.*

abstract class RTransitionBuilder<P: PropsWithChildren>(
    protected val type: ComponentType<P>,
    protected val props: P = jsObject { }
) : RBuilderImpl() {
    fun attrs(handler: P.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())
}