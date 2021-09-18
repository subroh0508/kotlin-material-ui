package materialui.components.dialog

import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.dialog.enums.DialogMaxWidth
import materialui.components.dialog.enums.DialogScroll
import materialui.components.dialog.enums.DialogStyle
import materialui.components.getValue
import materialui.components.modal.ModalElementBuilder
import materialui.components.paper.PaperElementBuilder
import materialui.components.paper.PaperProps
import materialui.components.paper.paper
import materialui.components.paper.paperElement
import materialui.components.setValue
import materialui.reacttransiton.RTransitionProps
import react.*
import kotlin.reflect.KClass

class DialogElementBuilder internal constructor(
    type: ComponentType<DialogProps>,
    classMap: List<Pair<Enum<*>, String>>
) : ModalElementBuilder<DialogProps>(type, classMap) {
    fun Tag.classes(vararg classMap: Pair<DialogStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.fullScreen: Boolean? by materialProps
    var Tag.fullWidth: Boolean? by materialProps
    var Tag.maxWidth: DialogMaxWidth? by materialProps
    var Tag.PaperProps: PropsWithChildren? by materialProps
    var Tag.scroll: DialogScroll? by materialProps
    var Tag.TransitionProps: PropsWithChildren? by materialProps

    fun <P: PropsWithChildren, C: Component<P, *>> Tag.paperComponent(kClass: KClass<C>) {
        materialProps.PaperComponent = kClass.react
    }

    fun <P: PaperProps> Tag.paperComponent(component: FunctionComponent<P>) {
        materialProps.PaperComponent = component
    }

    fun Tag.paperComponent(tagName: String) { materialProps.PaperComponent = tagName }
    @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "UNCHECKED_CAST")
    fun Tag.paperProps(block: PaperElementBuilder<DIV, PaperProps>.() -> Unit) {
        PaperProps = paperElement(block = block).props as PropsWithChildren
    }
    @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "UNCHECKED_CAST")
    fun <T: Tag, P: PaperProps> Tag.paperProps(factory: (TagConsumer<Unit>) -> T, block: PaperElementBuilder<T, P>.() -> Unit) {
        PaperProps = paperElement(factory = factory, block = block).props as PropsWithChildren
    }
    fun Tag.transitionDuration(duration: Number) { materialProps.transitionDuration = duration }
    fun Tag.transitionDuration(enter: Number? = null, exit: Number? = null) { materialProps.transitionDuration = js { this["enter"] = enter; this["end"] = exit } }
    fun <P: PropsWithChildren, C: Component<P, *>> Tag.transitionComponent(kClass: KClass<C>) {
        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "UNCHECKED_CAST")
        materialProps.TransitionComponent = kClass.js as ComponentClass<P>
    }
    fun Tag.transitionComponent(tagName: String) { materialProps.TransitionComponent = tagName }
    fun Tag.transitionProps(block: RTransitionProps.() -> Unit) { TransitionProps = jsObject(block) }
}