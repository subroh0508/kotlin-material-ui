package components.portal

import kotlinext.js.jsObject
import react.*

class PortalElementBuilder internal constructor(
    val type: RComponent<RProps, RState>,
    private val props: RProps = jsObject { }
) : RBuilder() {
    fun attrs(handler: RProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    var RProps.container: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["container"]
        set(value) { props.asDynamic()["container"] = value }
    var RProps.disablePortal: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disablePortal"]
        set(value) { props.asDynamic()["disablePortal"] = value }
    var RProps.onRendered: () -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onRendered"]
        set(value) { props.asDynamic()["onRendered"] = value }
}