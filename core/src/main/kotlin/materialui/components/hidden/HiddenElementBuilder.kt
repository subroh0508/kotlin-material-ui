package materialui.components.hidden

import kotlinext.js.jsObject
import materialui.components.hidden.enums.HiddenWidth
import react.RBuilder
import react.RClass
import react.createElement

class HiddenElementBuilder internal constructor(
    val type: RClass<HiddenProps>,
    private val props: HiddenProps = jsObject { }
) : RBuilder() {
    fun attrs(handler: HiddenProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    fun HiddenProps.only(v: HiddenWidth) { only = v.toString() }
    fun HiddenProps.only(v: List<HiddenWidth>) { only = v.map { it.toString() }.toTypedArray() }
}