package components

import kotlinext.js.js
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

    protected fun setClasses(classMap: List<Pair<String, String>>) {
        val jsObject = js {
            classMap.forEach {
                this[it.first] = it.second
            }
        } as Any

        setProp("classes", jsObject)
    }

    override fun create() = createElement(type, props, *childList.toTypedArray())
}
