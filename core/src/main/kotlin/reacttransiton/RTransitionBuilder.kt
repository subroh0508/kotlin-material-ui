package reacttransiton

import kotlinext.js.jsObject
import org.w3c.dom.events.Event
import react.*
import reacttransiton.values.TransitionTimeout

abstract class RTransitionBuilder(
    val type: RComponent<RProps, RState>,
    protected val props: RProps = jsObject { }
) : RBuilder() {
    fun attrs(handler: RProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    var RProps.`in`: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["in"]
        set(value) { props.asDynamic()["in"] = value }
    var RProps.mountOnEnter: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["mountOnEnter"]
        set(value) { props.asDynamic()["mountOnEnter"] = value }
    var RProps.unmountOnExit: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["unmountOnExit"]
        set(value) { props.asDynamic()["unmountOnExit"] = value }
    var RProps.appear: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["appear"]
        set(value) { props.asDynamic()["appear"] = value }
    var RProps.enter: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["enter"]
        set(value) { props.asDynamic()["enter"] = value }
    var RProps.exit: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["exit"]
        set(value) { props.asDynamic()["exit"] = value }
    var RProps.timeout: TransitionTimeout
        get() = TransitionTimeout.fromDynamic(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["timeout"])
        set(value) { props.asDynamic()["timeout"] = value.value }
    var RProps.addEndListener: (ReactElement, (Event) -> Unit) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["addEndListener"]
        set(value) { props.asDynamic()["addEndListener"] = value }
    var RProps.onEnter: (ReactElement, Boolean) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onEnter"]
        set(value) { props.asDynamic()["onEnter"] = value }
    var RProps.onEntering: (ReactElement, Boolean) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onEntering"]
        set(value) { props.asDynamic()["onEntering"] = value }
    var RProps.onEntered: (ReactElement, Boolean) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onEntered"]
        set(value) { props.asDynamic()["onEntered"] = value }
    var RProps.onExit: (ReactElement) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onExit"]
        set(value) { props.asDynamic()["onExit"] = value }
    var RProps.onExiting: (ReactElement) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onExiting"]
        set(value) { props.asDynamic()["onExiting"] = value }
    var RProps.onExited: (ReactElement) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onExited"]
        set(value) { props.asDynamic()["onExited"] = value }
}