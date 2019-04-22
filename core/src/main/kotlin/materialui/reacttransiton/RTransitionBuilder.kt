package materialui.reacttransiton

import org.w3c.dom.events.Event
import react.RProps
import react.ReactElement
import materialui.reacttransiton.values.TransitionTimeout

internal class RTransitionBuilder : RTransition {
    lateinit var props: RProps

    override var RProps.`in`: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["in"]
        set(value) { props.asDynamic()["in"] = value }
    override var RProps.mountOnEnter: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["mountOnEnter"]
        set(value) { props.asDynamic()["mountOnEnter"] = value }
    override var RProps.unmountOnExit: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["unmountOnExit"]
        set(value) { props.asDynamic()["unmountOnExit"] = value }
    override var RProps.appear: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["appear"]
        set(value) { props.asDynamic()["appear"] = value }
    override var RProps.enter: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["enter"]
        set(value) { props.asDynamic()["enter"] = value }
    override var RProps.exit: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["exit"]
        set(value) { props.asDynamic()["exit"] = value }
    override var RProps.timeout: TransitionTimeout
        get() = TransitionTimeout.fromDynamic(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["timeout"])
        set(value) { props.asDynamic()["timeout"] = value.value }
    override var RProps.addEndListener: (ReactElement, (Event) -> Unit) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["addEndListener"]
        set(value) { props.asDynamic()["addEndListener"] = value }
    override var RProps.onEnter: (ReactElement, Boolean) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onEnter"]
        set(value) { props.asDynamic()["onEnter"] = value }
    override var RProps.onEntering: (ReactElement, Boolean) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onEntering"]
        set(value) { props.asDynamic()["onEntering"] = value }
    override var RProps.onEntered: (ReactElement, Boolean) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onEntered"]
        set(value) { props.asDynamic()["onEntered"] = value }
    override var RProps.onExit: (ReactElement) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onExit"]
        set(value) { props.asDynamic()["onExit"] = value }
    override var RProps.onExiting: (ReactElement) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onExiting"]
        set(value) { props.asDynamic()["onExiting"] = value }
    override var RProps.onExited: (ReactElement) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onExited"]
        set(value) { props.asDynamic()["onExited"] = value }
}