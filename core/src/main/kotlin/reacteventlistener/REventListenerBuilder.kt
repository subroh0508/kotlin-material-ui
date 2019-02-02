package reacteventlistener

import kotlinext.js.jsObject
import react.*

abstract class REventListenerBuilder internal constructor(
    val type: RComponent<RProps, RState>,
    val props: RProps = jsObject { }
) : RBuilder() {
    inline fun attrs(handler: RProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    var RProps.target: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["target"]
        set(value) { props.asDynamic()["target"] = value }
}