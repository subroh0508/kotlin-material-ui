package materialui.reacttransiton

import kotlinext.js.jsObject
import react.RBuilder
import react.RClass
import react.RProps
import react.createElement

abstract class RTransitionBuilder<P: RProps>(
    protected val type: RClass<P>,
    protected val props: P = jsObject { }
) : RBuilder() {
    fun attrs(handler: P.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())
}