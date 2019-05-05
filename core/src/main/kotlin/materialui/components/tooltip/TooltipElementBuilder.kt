package materialui.components.tooltip

import kotlinext.js.jsObject
import materialui.components.popper.PopperElementBuilder
import materialui.components.popper.popper
import materialui.reacttransiton.RTransitionProps
import org.w3c.dom.events.Event
import react.*
import kotlin.reflect.KClass

class TooltipElementBuilder internal constructor(
    private val type: RClass<TooltipProps>,
    classMap: List<Pair<Enum<*>, String>>,
    private val props: TooltipProps = jsObject { }
) : RBuilder() {
    init {
        props.classes(classMap)
    }

    fun attrs(handler: TooltipProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    fun TooltipProps.classes(vararg classMap: Pair<Enum<*>, String>) {
        classes(classMap.map { (key, value) -> key to value })
    }

    fun TooltipProps.classes(classMap: List<Pair<Enum<*>, String>>) {
        classes(classMap.map { (key, value) -> key.toString() to value })
    }

    fun TooltipProps.classes(vararg classMap: Pair<String, String>) {
        classes(classMap.map { (key, value) -> key to value })
    }

    fun TooltipProps.classes(classMap: List<Pair<String, String>>) {
        if (classMap.isEmpty()) {
            return
        }

        val classesObj: dynamic = jsObject { }

        classMap.forEach { (key, value) -> classesObj[key] = value }

        asDynamic()["classes"] = classesObj as Any
    }

    fun TooltipProps.onClose(block: (Event) -> Unit) { onClose = block }
    fun TooltipProps.onOpen(block: (Event) -> Unit) { onOpen = block }
    fun TooltipProps.PopperProps(block: PopperElementBuilder.() -> Unit) {
        PopperProps = RBuilder().popper(block).props
    }
    fun TooltipProps.title(block: RBuilder.() -> Unit) { title = buildElement(block) }
    fun <P: RProps, C: Component<P, *>> TooltipProps.transitionComponent(kClass: KClass<C>) {
        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        @Suppress("UNCHECKED_CAST")
        TransitionComponent = kClass.js as RClass<P>
    }
    fun TooltipProps.transitionComponet(tagName: String) { TransitionComponent = tagName }
    fun TooltipProps.transitionProips(block: RTransitionProps.() -> Unit) { TransitionProps = jsObject(block) }
}