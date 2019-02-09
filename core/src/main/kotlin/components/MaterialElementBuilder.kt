package components

import kotlinext.js.js
import kotlinx.css.CSSBuilder
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.*
import react.dom.InnerHTML
import react.dom.RDOMBuilder

abstract class MaterialElementBuilder<T: Tag>(
    val type: RComponent<RProps, RState>,
    factory: (TagConsumer<Unit>) -> T
) : RDOMBuilder<T>(factory) {
    init {
        setProp("component", attrs.tagName)
    }

    protected val styles: MaterialElementStyles = LinkedHashMap()
    protected val MaterialElementStyles.toDynamic: Any
        get() = js {
            forEach { (key, value) ->
                this[key] = value
            }
        } as Any

    protected val CSSBuilder.toDynamic: Any
        get() = js {
           declarations.forEach { (key, value) ->
                this[key] = value
            }
         } as Any

    var Tag.className: String?
        get() = props.className
        set(value) { props.className = value }
    var Tag.dangerouslySetInnerHTML: InnerHTML?
        get() = props.dangerouslySetInnerHTML
        set(value) { props.dangerouslySetInnerHTML = value }

    fun MaterialElementStyles.rootStyle(handler: CSSBuilder.() -> Unit) {
        this["root"] = CSSBuilder().apply(handler).toDynamic
    }

    override fun create(): ReactElement = createElement(type, props, *childList.toTypedArray())
}
