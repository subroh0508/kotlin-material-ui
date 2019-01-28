package components

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.*
import react.dom.InnerHTML
import react.dom.RDOMBuilder
import kotlin.reflect.KClass

abstract class MaterialElementBuilder<T: Tag>(
    val type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : RDOMBuilder<T>(factory) {
    init {
        setProp("component", attrs.tagName)
    }

    var className: String?
        get() = props.className
        set(value) { props.className = value }

    var dangerouslySetInnerHTML: InnerHTML?
        get() = props.dangerouslySetInnerHTML
        set(value) { props.dangerouslySetInnerHTML = value }

    override fun create(): ReactElement = createElement(type, props, *childList.toTypedArray())
}