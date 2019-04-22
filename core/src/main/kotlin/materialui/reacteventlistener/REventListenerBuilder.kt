package materialui.reacteventlistener

import kotlinext.js.jsObject
import react.*

abstract class REventListenerBuilder internal constructor(
    val type: RComponent<RProps, RState>,
    protected val props: RProps = jsObject { }
) : RBuilder() {
    fun attrs(handler: RProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    var RProps.target: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["target"]
        set(value) { props.asDynamic()["target"] = value }
}