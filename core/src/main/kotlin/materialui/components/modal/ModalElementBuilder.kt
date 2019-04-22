package materialui.components.modal

import materialui.components.MaterialElementBuilder
import kotlinx.html.DIV
import kotlinx.html.Tag
import org.w3c.dom.events.Event
import react.RComponent
import react.RProps
import react.RState

open class ModalElementBuilder(
    type: RComponent<RProps, RState>
) : MaterialElementBuilder<DIV>(type, { DIV(mapOf(), it) }) {

    var Tag.backdropComponent: RComponent<RProps, RState>
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["BackdropComponent"]
        set(value) { setProp("BackdropComponent", value) }
    var Tag.backdropProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["BackdropProps"]
        set(value) { setProp("BackdropProps", value) }
    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.container: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["container"]
        set(value) { setProp("container", value) }
    var Tag.disableAutoFocus: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableAutoFocus"]
        set(value) { setProp("disableAutoFocus", value) }
    var Tag.disableBackdropClick: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableBackdropClick"]
        set(value) { setProp("disableBackdropClick", value) }
    var Tag.disableEnforceFocus: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableEnforceFocus"]
        set(value) { setProp("disableEnforceFocus", value) }
    var Tag.disableEscapeKeyDown: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableEscapeKeyDown"]
        set(value) { setProp("disableEscapeKeyDown", value) }
    var Tag.disablePortal: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disablePortal"]
        set(value) { setProp("disablePortal", value) }
    var Tag.disableRestoreFocus: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableRestoreFocus"]
        set(value) { setProp("disableRestoreFocus", value) }
    var Tag.hideBackdrop: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["hideBackdrop"]
        set(value) { setProp("hideBackdrop", value) }
    var Tag.keepMounted: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["keepMounted"]
        set(value) { setProp("keepMounted", value) }
    var Tag.manager: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["manager"]
        set(value) { setProp("manager", value) }
    var Tag.onBackdropClick: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onBackdropClick"]
        set(value) { setProp("onBackdropClick", value) }
    var Tag.onClose: (Event, String) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onClose"]
        set(value) { setProp("onClose", value) }
    var Tag.onEscapeKeyDown: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onEscapeKeyDown"]
        set(value) { setProp("onEscapeKeyDown", value) }
    var Tag.onRendered: () -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onRendered"]
        set(value) { setProp("onRendered", value) }
    var Tag.open: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["open"]
        set(value) { setProp("open", value) }
}