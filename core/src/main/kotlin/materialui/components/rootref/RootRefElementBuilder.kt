package materialui.components.rootref

import kotlinext.js.jsObject
import react.RBuilder
import react.RBuilderImpl
import react.RClass
import react.createElement

class RootRefElementBuilder internal constructor(
    val type: RClass<RootRefProps>,
    private val props: RootRefProps = jsObject { }
) : RBuilderImpl() {
    fun attrs(handler: RootRefProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())
}