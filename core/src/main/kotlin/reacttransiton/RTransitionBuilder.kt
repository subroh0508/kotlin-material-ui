package reacttransiton

import components.MaterialElementBuilder
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import org.w3c.dom.HTMLElement
import org.w3c.dom.events.Event
import react.RComponent
import react.RProps
import react.RState
import reacttransiton.values.TransitionTimeout

abstract class RTransitionBuilder<CHILD: Tag>(
    type: RComponent<RProps, RState>,
    factory: (TagConsumer<Unit>) -> CHILD
) : MaterialElementBuilder<CHILD>(type, factory) {
    var Tag.`in`: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["`in`"]
        set(value) { setProp("`in`", value) }
    var Tag.mountOnEnter: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["mountOnEnter"]
        set(value) { setProp("mountOnEnter", value) }
    var Tag.unmountOnExit: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["unmountOnExit"]
        set(value) { setProp("unmountOnExit", value) }
    var Tag.appear: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["appear"]
        set(value) { setProp("appear", value) }
    var Tag.enter: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["enter"]
        set(value) { setProp("enter", value) }
    var Tag.exit: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["exit"]
        set(value) { setProp("exit", value) }
    var Tag.timeout: TransitionTimeout
        get() = TransitionTimeout.fromDynamic(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["timeout"])
        set(value) { setProp("timeout", value.value) }
    var Tag.addEndListener: (HTMLElement, (Event) -> Unit) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["addEndListener"]
        set(value) { setProp("addEndListener", value) }
    var Tag.onEnter: (HTMLElement, Boolean) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onEnter"]
        set(value) { setProp("onEnter", value) }
    var Tag.onEntering: (HTMLElement, Boolean) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onEntering"]
        set(value) { setProp("onEntering", value) }
    var Tag.onEntered: (HTMLElement, Boolean) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onEntered"]
        set(value) { setProp("onEntered", value) }
    var Tag.onExit: (HTMLElement) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onExit"]
        set(value) { setProp("onExit", value) }
    var Tag.onExiting: (HTMLElement) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onExiting"]
        set(value) { setProp("onExiting", value) }
    var Tag.onExited: (HTMLElement) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onExited"]
        set(value) { setProp("onExited", value) }


}