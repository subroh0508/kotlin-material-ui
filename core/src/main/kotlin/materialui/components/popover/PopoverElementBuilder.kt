package materialui.components.popover

import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.getValue
import materialui.components.modal.ModalElementBuilder
import materialui.components.modal.enums.ModalStyle
import materialui.components.paper.PaperElementBuilder
import materialui.components.paper.PaperProps
import materialui.components.paper.paper
import materialui.components.popover.enums.PopoverReference
import materialui.components.popover.enums.PopoverStyle
import materialui.components.setValue
import materialui.reacttransiton.RTransitionProps
import org.w3c.dom.HTMLElement
import org.w3c.dom.Node
import react.*
import kotlin.reflect.KClass

open class PopoverElementBuilder<Props: PopoverProps>(
    type: RClass<Props>,
    classMap: List<Pair<Enum<*>, String>>
) : ModalElementBuilder<Props>(type, classMap) {
    fun Tag.classes(vararg classMap: Pair<PopoverStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.action: ((PopoverActions) -> Unit)? by materialProps
    var Tag.anchorOrigin: PopoverOrigin? by materialProps
    var Tag.anchorPosition: PopoverPosition? by materialProps
    var Tag.anchorReference: PopoverReference? by materialProps
    var Tag.elevation: Number? by materialProps
    var Tag.getContentAnchorEl: ((HTMLElement) -> HTMLElement)? by materialProps
    var Tag.marginThreshold: Number? by materialProps
    var Tag.ModalClasses: Any? by materialProps
    var Tag.onEnter: ((Node) -> Unit)? by materialProps
    var Tag.onEntered: ((Node) -> Unit)? by materialProps
    var Tag.onEntering: ((Node) -> Unit)? by materialProps
    var Tag.onExit: ((Node) -> Unit)? by materialProps
    var Tag.onExited: ((Node) -> Unit)? by materialProps
    var Tag.onExiting: ((Node) -> Unit)? by materialProps
    var Tag.PaperProps: RProps? by materialProps
    var Tag.transformOrigin: PopoverOrigin? by materialProps
    val Tag.transitionDuration: Any? by materialProps
    var Tag.TransitionProps: RProps? by materialProps

    fun Tag.action(actions: (PopoverActions) -> Unit) { action = actions }
    fun Tag.anchorEl(node: Node) { materialProps.anchorEl = node }
    fun Tag.anchorEl(htmlElement: HTMLElement) { materialProps.anchorEl = htmlElement }
    fun Tag.anchorEl(block: RBuilder.() -> Unit) { materialProps.anchorEl = buildElement(block) }
    fun Tag.anchorEl(func: (HTMLElement) -> HTMLElement) { materialProps.anchorEl = func }
    fun Tag.anchorOrigin(block: PopoverOrigin.() -> Unit) { anchorOrigin = jsObject(block) }
    fun Tag.anchorPosition(block: PopoverPosition.() -> Unit) { anchorPosition = jsObject(block) }
    fun Tag.modalClasses(vararg classMap: Pair<ModalStyle, String>) {
        if (classMap.isEmpty()) {
            return
        }

        val classesObj: dynamic = jsObject { }

        classMap.forEach { (key, value) -> classesObj[key] = value }

        ModalClasses = classesObj as Any
    }
    fun Tag.paperProps(block: PaperElementBuilder<DIV, PaperProps>.() -> Unit) {
        PaperProps = RBuilder().paper(block = block).props
    }
    fun <T: Tag, P: PaperProps> Tag.paperProps(factory: (TagConsumer<Unit>) -> T, block: PaperElementBuilder<T, P>.() -> Unit) {
        PaperProps = RBuilder().paper(factory = factory, block = block).props
    }
    fun Tag.transformOrigin(block: PopoverOrigin.() -> Unit) { transformOrigin = jsObject(block) }
    fun <P: RProps, C: Component<P, *>> Tag.transitionComponent(kClass: KClass<C>) {
        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        @Suppress("UNCHECKED_CAST")
        materialProps.TransitionComponent = kClass.js as RClass<P>
    }
    fun Tag.transitionComponent(tagName: String) {
        materialProps.TransitionComponent = tagName
    }
    fun Tag.transitionDuration(msec: Number) { materialProps.transitionDuration = msec }
    fun Tag.transitionDuration(start: Number? = null, exit: Number? = null) { materialProps.transitionDuration = js { this["start"] = start; this["exit"] = exit } }
    fun Tag.transitionDuration(auto: String = "auto") { materialProps.transitionDuration = auto }
    fun Tag.transtionProps(block: RTransitionProps.() -> Unit) { TransitionProps = jsObject(block) }
}