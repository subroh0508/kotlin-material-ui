package materialui.reacttransiton

import kotlinext.js.Object
import kotlinext.js.jsObject
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.ComponentType
import react.ReactElement
import react.createElement
import react.dom.DOMProps
import react.dom.RDOMBuilderImpl
import react.dom.setProp

abstract class RTransitionGroupBuilder<T: Tag, Props: RTransitionGroupProps>(
    private val type: ComponentType<Props>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : RDOMBuilderImpl<T>(factory) {
    protected val groupProps: Props = jsObject { }

    fun Tag.classes(vararg classMap: Pair<Enum<*>, String>) {
        classes(classMap.map { (key, value) -> key to value })
    }

    fun Tag.classes(classMap: List<Pair<Enum<*>, String>>) {
        classes(classMap.map { (key, value) -> key.toString() to value })
    }

    fun Tag.classes(vararg classMap: Pair<String, String>) {
        classes(classMap.map { (key, value) -> key to value })
    }

    fun Tag.classes(classMap: List<Pair<String, String>>) {
        if (classMap.isEmpty()) {
            return
        }

        val classesObj: dynamic = jsObject { }

        classMap.forEach { (key, value) -> classesObj[key] = value }

        classes = classesObj as Any
    }

    var Tag.classes: Any? by groupProps
    var Tag.className: String? by groupProps

    var Tag.appear: Boolean? by groupProps
    var Tag.enter: Boolean? by groupProps
    var Tag.exit: Boolean? by groupProps
    var Tag.childFactory: ((ReactElement) -> ReactElement)? by groupProps

    init {
        attrs.classes(classMap)
    }

    override fun create(): ReactElement {
        Object.keys(groupProps).forEach { key -> setProp(key, groupProps[key]) }

        @Suppress("UNCHECKED_CAST", "UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        return createElement(type as ComponentType<DOMProps>, domProps, *childList.toTypedArray())
    }
}