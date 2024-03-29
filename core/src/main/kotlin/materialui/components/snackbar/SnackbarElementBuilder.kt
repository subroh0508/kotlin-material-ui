package materialui.components.snackbar

import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.clickawaylistener.ClickAwayListenerBuilder
import materialui.components.clickawaylistener.clickAwayListener
import materialui.components.clickawaylistener.clickAwayListenerElement
import materialui.components.getValue
import materialui.components.setValue
import materialui.components.snackbar.enums.SnackbarStyle
import materialui.components.snackbarcontent.SnackbarContentElementBuilder
import materialui.components.snackbarcontent.snackbarContent
import materialui.components.snackbarcontent.snackbarContentElement
import materialui.reacttransiton.RTransitionProps
import org.w3c.dom.events.Event
import react.*
import kotlin.reflect.KClass

class SnackbarElementBuilder internal constructor(
    type: ComponentType<SnackbarProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, SnackbarProps>(type, classMap, { DIV(mapOf(), it) }) {
    fun Tag.classes(vararg classMap: Pair<SnackbarStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.action: ReactElement? by materialProps
    var Tag.anchorOrigin: SnackbarOrigin? by materialProps
    var Tag.autoHideDuration: Number? by materialProps
    var Tag.ClickAwayListenerProps: PropsWithChildren? by materialProps
    var Tag.ContentProps: PropsWithChildren? by materialProps
    var Tag.disableWindowBlurListener: Boolean? by materialProps
    var Tag.key: Any? by materialProps
    var Tag.message: ReactElement? by materialProps
    var Tag.onClose: ((Event, String) -> Unit)? by materialProps
    var Tag.onEnter: ((ReactElement, Boolean) -> Unit)? by materialProps
    var Tag.onEntered: ((ReactElement, Boolean) -> Unit)? by materialProps
    var Tag.onEntering: ((ReactElement, Boolean) -> Unit)? by materialProps
    var Tag.onExit: ((ReactElement) -> Unit)? by materialProps
    var Tag.onExited: ((ReactElement) -> Unit)? by materialProps
    var Tag.onExiting: ((ReactElement) -> Unit)? by materialProps
    var Tag.onMouseEnter: ((Event) -> Unit)? by materialProps
    var Tag.onMouseLeave: ((Event) -> Unit)? by materialProps
    var Tag.open: Boolean? by materialProps
    var Tag.resumeHideDuration: Number? by materialProps
    val Tag.transitionDuration: Any? by materialProps
    var Tag.TransitionProps: RTransitionProps? by materialProps

    fun Tag.action(block: RBuilder.() -> Unit) { action = buildElement(block) }
    fun Tag.anchorOrigin(block: SnackbarOrigin.() -> Unit) { anchorOrigin = jsObject(block) }
    @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "UNCHECKED_CAST")
    fun Tag.clickAwayListenerProps(block: ClickAwayListenerBuilder.() -> Unit) {
        ClickAwayListenerProps = clickAwayListenerElement(block).props as PropsWithChildren
    }
    @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "UNCHECKED_CAST")
    fun Tag.contentProps(block: SnackbarContentElementBuilder<DIV>.() -> Unit) {
        ContentProps = snackbarContentElement(block = block).props as PropsWithChildren
    }
    @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "UNCHECKED_CAST")
    fun <T: Tag> Tag.contentProps(factory: (TagConsumer<Unit>) -> T, block: SnackbarContentElementBuilder<T>.() -> Unit) {
        ContentProps = snackbarContentElement(factory = factory, block = block).props as PropsWithChildren
    }
    fun Tag.message(block: RBuilder.() -> Unit) { message = buildElement(block) }
    fun <P: PropsWithChildren, C: Component<P, *>> Tag.transitionComponent(kClass: KClass<C>) {
        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE", "UNCHECKED_CAST")
        materialProps.TransitionComponent = kClass.js as ComponentClass<P>
    }
    fun Tag.transitionComponent(tagName: String) { materialProps.TransitionComponent = tagName }
    fun Tag.transitionDuration(msec: Long) { materialProps.transitionDuration = msec }
    fun Tag.transitionDuration(start: Long? = null, exit: Long? = null) { materialProps.transitionDuration = js { this["start"] = start; this["exit"] = exit } }
    fun Tag.transitionProps(block: RTransitionProps.() -> Unit) { TransitionProps = jsObject(block) }
}