package materialui.components.hidden

import kotlinext.js.jsObject
import materialui.components.hidden.enums.HiddenWidth
import react.*

class HiddenElementBuilder internal constructor(
    val type: ComponentType<HiddenProps>,
    private val props: HiddenProps = jsObject { }
) : RBuilderImpl() {
    fun attrs(handler: HiddenProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    fun HiddenProps.only(v: HiddenWidth) { only = v.toString() }
    fun HiddenProps.only(v: List<HiddenWidth>) { only = v.map { it.toString() }.toTypedArray() }
}