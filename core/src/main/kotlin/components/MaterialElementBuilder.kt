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

    protected fun setClasses(vararg classMap: Pair<Enum<*>, String>)
            = setClasses(classMap.map { it.first.toString() to it.second })

    private fun setClasses(classMap: List<Pair<String, String>>) {
        val classes = props.asDynamic()["classes"]
        val rootClass = if (classes != null) classes["root"] else null

        val jsObject = classes ?: js { }

        jsObject["root"] = rootClass
        classMap.forEach {
            jsObject[it.first] = it.second
        }

        setProp("classes", jsObject as Any)
    }

    fun Tag.rootClass(className: String) {
        setClasses(listOf("root" to className))
    }

    override fun create() = createElement(type, props, *childList.toTypedArray())
}
