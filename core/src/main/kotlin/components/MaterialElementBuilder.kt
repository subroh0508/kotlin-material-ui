package components

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import react.createElement
import react.dom.InnerHTML
import react.dom.RDOMBuilder

abstract class MaterialElementBuilder<T: Tag>(
    val type: RComponent<RProps, RState>,
    factory: (TagConsumer<Unit>) -> T
) : RDOMBuilder<T>(factory) {
    init {
        setProp("component", attrs.tagName)
    }

    var Tag.className: String?
        get() = props.className
        set(value) { props.className = value }
    var Tag.dangerouslySetInnerHTML: InnerHTML?
        get() = props.dangerouslySetInnerHTML
        set(value) { props.dangerouslySetInnerHTML = value }

    override fun create() = createElement(type, props, *childList.toTypedArray())
}
