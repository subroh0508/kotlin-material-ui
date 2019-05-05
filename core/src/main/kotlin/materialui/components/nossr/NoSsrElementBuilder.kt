package materialui.components.nossr

import kotlinext.js.jsObject
import react.RBuilder
import react.RClass
import react.buildElement
import react.createElement

class NoSsrElementBuilder internal constructor(
    val type: RClass<NoSsrProps>,
    private val props: NoSsrProps = jsObject { }
) : RBuilder() {
    fun attrs(handler: NoSsrProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    fun NoSsrProps.fallback(block: RBuilder.() -> Unit) { fallback = buildElement(block) }
}