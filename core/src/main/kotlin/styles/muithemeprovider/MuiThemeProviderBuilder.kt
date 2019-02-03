package styles.muithemeprovider

import kotlinext.js.jsObject
import kotlinx.html.Tag
import react.*

class MuiThemeProviderBuilder internal constructor(
    val type: RComponent<RProps, RState>,
    private val props: RProps = jsObject { }
) : RBuilder() {
    fun attrs(handler: RProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    var Tag.disableStylesGeneration: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableStylesGeneration"]
        set(value) { props.asDynamic()["disableStylesGeneration"] = value }
    var Tag.sheetsCache: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["sheetsCache"]
        set(value) { props.asDynamic()["sheetsCache"] = value }
    var Tag.sheetsManager: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["sheetsManager"]
        set(value) { props.asDynamic()["sheetsManager"] = value }
    var Tag.theme: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["theme"]
        set(value) { props.asDynamic()["theme"] = value }
}
