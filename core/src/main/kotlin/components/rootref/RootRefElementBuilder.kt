package components.rootref

import kotlinext.js.jsObject
import kotlinx.html.Tag
import react.*

class RootRefElementBuilder internal constructor(
    val type: RComponent<RProps, RState>,
    private val props: RProps = jsObject { }
) : RBuilder() {
    fun attrs(handler: RProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    var Tag.rootRef: RRef
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["rootRef"]
        set(value) { props.asDynamic()["rootRef"] = value }
}