package components.nossr

import kotlinext.js.jsObject
import kotlinx.html.Tag
import react.*

class NoSsrElementBuilder internal constructor(
    val type: RComponent<RProps, RState>,
    private val props: RProps = jsObject { }
) : RBuilder() {
    fun attrs(handler: RProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    var Tag.defer: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["defer"]
        set(value) { props.asDynamic()["defer"] = value }
    var Tag.fallback: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["fallback"]
        set(value) { props.asDynamic()["fallback"] = value }
}