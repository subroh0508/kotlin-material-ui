package materialui.reacteventlistener

import kotlinext.js.jsObject
import react.RBuilder
import react.RClass
import react.RProps
import react.createElement

abstract class REventListenerBuilder<Props: RProps> internal constructor(
    val type: RClass<Props>,
    protected val props: Props = jsObject { }
) : RBuilder() {
    fun attrs(handler: Props.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())
}