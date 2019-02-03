package styles.muithemeprovider

import kotlinext.js.jsObject
import react.*

class MuiThemeProviderBuilder internal constructor(
    val type: RComponent<RProps, RState>,
    private val props: RProps = jsObject { }
) : RBuilder() {
    fun attrs(handler: RProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    var RProps.disableStylesGeneration: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableStylesGeneration"]
        set(value) { props.asDynamic()["disableStylesGeneration"] = value }
    var RProps.sheetsCache: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["sheetsCache"]
        set(value) { props.asDynamic()["sheetsCache"] = value }
    var RProps.sheetsManager: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["sheetsManager"]
        set(value) { props.asDynamic()["sheetsManager"] = value }
    var RProps.theme: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["theme"]
        set(value) { props.asDynamic()["theme"] = value }
}
