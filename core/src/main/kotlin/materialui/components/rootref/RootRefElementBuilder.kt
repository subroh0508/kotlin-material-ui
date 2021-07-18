package materialui.components.rootref

import kotlinext.js.jsObject
import react.*

class RootRefElementBuilder internal constructor(
    val type: ComponentType<RootRefProps>,
    private val props: RootRefProps = jsObject { }
) : RBuilderImpl() {
    fun attrs(handler: RootRefProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())
}