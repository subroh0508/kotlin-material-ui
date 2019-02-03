package components.tooltip

import components.tooltip.enums.TooltipPlacement
import kotlinext.js.jsObject
import org.w3c.dom.events.Event
import react.*

class TooltipElementBuilder internal constructor(
    private val type: RComponent<RProps, RState>,
    private val props: RProps = jsObject { }
) : RBuilder() {
    fun attrs(handler: RProps.() -> Unit) {
        props.handler()
    }

    fun create() = createElement(type, props, *childList.toTypedArray())

    var RProps.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { props.asDynamic()["classes"] = value }
    var RProps.disableFocusListener: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableFocusListener"]
        set(value) { props.asDynamic()["disableFocusListener"] = value }
    var RProps.disableHoverListener: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableHoverListener"]
        set(value) { props.asDynamic()["disableHoverListener"] = value }
    var RProps.disableTouchListener: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableTouchListener"]
        set(value) { props.asDynamic()["disableTouchListener"] = value }
    var RProps.enterDelay: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["enterDelay"]
        set(value) { props.asDynamic()["enterDelay"] = value }
    var RProps.enterTouchDelay: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["enterTouchDelay"]
        set(value) { props.asDynamic()["enterTouchDelay"] = value }
    var RProps.id: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["id"]
        set(value) { props.asDynamic()["id"] = value }
    var RProps.interactive: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["interactive"]
        set(value) { props.asDynamic()["interactive"] = value }
    var RProps.leaveDelay: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["leaveDelay"]
        set(value) { props.asDynamic()["leaveDelay"] = value }
    var RProps.leaveTouchDelay: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["leaveTouchDelay"]
        set(value) { props.asDynamic()["leaveTouchDelay"] = value }
    var RProps.onClose: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onClose"]
        set(value) { props.asDynamic()["onClose"] = value }
    var RProps.onOpen: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onOpen"]
        set(value) { props.asDynamic()["onOpen"] = value }
    var RProps.open: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["open"]
        set(value) { props.asDynamic()["open"] = value }
    var RProps.placement: TooltipPlacement
        get() = TooltipPlacement.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["placement"])
        set(value) { props.asDynamic()["placement"] = value.value }
    var RProps.PopperProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["PopperProps"]
        set(value) { props.asDynamic()["PopperProps"] = value }
    var RProps.theme: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["theme"]
        set(value) { props.asDynamic()["theme"] = value }
    var RProps.title: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["title"]
        set(value) { props.asDynamic()["title"] = value }
    var RProps.TransitionComponent: RComponent<RProps, RState>
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["TransitionComponent"]
        set(value) { props.asDynamic()["TransitionComponent"] = value }
    var RProps.TransitionProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["TransitionProps"]
        set(value) { props.asDynamic()["TransitionProps"] = value }
}