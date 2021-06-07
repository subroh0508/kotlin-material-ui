package materialui.reacteventlistener

import kotlinext.js.jsObject
import react.*

abstract class REventListenerBuilder<Props: RProps> internal constructor(
    val type: RClass<Props>,
    protected val props: Props = jsObject { }
) : RBuilderImpl() {
    fun attrs(handler: Props.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())
}