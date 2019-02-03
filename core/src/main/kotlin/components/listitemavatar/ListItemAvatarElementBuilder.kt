package components.listitemavatar

import kotlinext.js.jsObject
import kotlinx.html.Tag
import react.*

class ListItemAvatarElementBuilder internal constructor(
    val type: RComponent<RProps, RState>,
    private val props: RProps = jsObject { }
) : RBuilder() {
    fun attrs(handler: RProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { props.asDynamic()["classes"] = value }
    var Tag.className: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["className"]
        set(value) { props.asDynamic()["className"] = value }
}