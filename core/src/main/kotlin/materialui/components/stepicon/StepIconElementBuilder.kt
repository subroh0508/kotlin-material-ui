package materialui.components.stepicon

import kotlinext.js.jsObject
import react.*

class StepIconElementBuilder internal constructor(
    private val type: RClass<StepIconProps>,
    classMap: List<Pair<Enum<*>, String>>,
    private val props: StepIconProps = jsObject {  }
) : RBuilder() {
    init {
        props.classes(classMap)
    }

    fun attrs(handler: RProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    fun StepIconProps.classes(vararg classMap: Pair<Enum<*>, String>) {
        classes(classMap.map { (key, value) -> key to value })
    }

    fun StepIconProps.classes(classMap: List<Pair<Enum<*>, String>>) {
        classes(classMap.map { (key, value) -> key.toString() to value })
    }

    fun StepIconProps.classes(vararg classMap: Pair<String, String>) {
        classes(classMap.map { (key, value) -> key to value })
    }

    fun StepIconProps.classes(classMap: List<Pair<String, String>>) {
        if (classMap.isEmpty()) {
            return
        }

        val classesObj: dynamic = jsObject { }

        classMap.forEach { (key, value) -> classesObj[key] = value }

        asDynamic()["classes"] = classesObj as Any
    }

    fun StepIconProps.icon(block: RBuilder.() -> Unit) { icon = buildElement(block) }
}