package materialui.components.snackbar

import materialui.components.MaterialElementBuilder
import materialui.components.snackbar.values.SnackbarAnchorOrigin
import materialui.components.snackbar.values.SnackbarTransitionDuration
import kotlinx.html.DIV
import kotlinx.html.Tag
import org.w3c.dom.events.Event
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement

class SnackbarElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : MaterialElementBuilder<DIV>(type, { DIV(mapOf(), it) }) {

    var Tag.action: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["action"]
        set(value) { setProp("action", value) }
    var Tag.anchorOrigin: SnackbarAnchorOrigin
        get() = SnackbarAnchorOrigin(props.asDynamic()["anchorOrigin"])
        set(value) { setProp("anchorOrigin", value.value) }
    var Tag.autoHideDuration: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["autoHideDuration"]
        set(value) { setProp("autoHideDuration", value) }
    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.clickAwayListenerProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["ClickAwayListenerProps"]
        set(value) { setProp("ClickAwayListenerProps", value) }
    var Tag.contentProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["ContentProps"]
        set(value) { setProp("ContentProps", value) }
    var Tag.disableWindowBlurListener: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableWindowBlurListener"]
        set(value) { setProp("disableWindowBlurListener", value) }
    var Tag.key: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["key"]
        set(value) { setProp("key", value) }
    var Tag.message: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["message"]
        set(value) { setProp("message", value) }
    var Tag.onClose: (Event, String) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onClose"]
        set(value) { setProp("onClose", value) }
    var Tag.onEnter: (ReactElement, Boolean) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onEnter"]
        set(value) { setProp("onEnter", value) }
    var Tag.onEntered: (ReactElement, Boolean) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onEntered"]
        set(value) { setProp("onEntered", value) }
    var Tag.onEntering: (ReactElement, Boolean) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onEntering"]
        set(value) { setProp("onEntering", value) }
    var Tag.onExit: (ReactElement) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onExit"]
        set(value) { setProp("onExit", value) }
    var Tag.onExited: (ReactElement) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onExited"]
        set(value) { setProp("onExited", value) }
    var Tag.onExiting: (ReactElement) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onExiting"]
        set(value) { setProp("onExiting", value) }
    var Tag.onMouseEnter: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onMouseEnter"]
        set(value) { setProp("onMouseEnter", value) }
    var Tag.onMouseLeave: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onMouseLeave"]
        set(value) { setProp("onMouseLeave", value) }
    var Tag.open: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["open"]
        set(value) { setProp("open", value) }
    var Tag.resumeHideDuration: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["resumeHideDuration"]
        set(value) { setProp("resumeHideDuration", value) }
    var Tag.transitionComponent: RComponent<RProps, RState>
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["TransitionComponent"]
        set(value) { setProp("TransitionComponent", value) }
    var Tag.transitionDuration: SnackbarTransitionDuration
        get() = SnackbarTransitionDuration(jsObject = props.asDynamic()["transitionDuration"])
        set(value) { setProp("transitionDuration", value.value) }
    var Tag.transitionProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["TransitionProps"]
        set(value) { setProp("TransitionProps", value) }
}