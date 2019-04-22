package materialui.components.dialog

import materialui.components.dialog.enums.DialogMaxWidth
import materialui.components.dialog.enums.DialogScroll
import materialui.components.dialog.values.TransitionDuration
import materialui.components.modal.ModalElementBuilder
import kotlinx.html.Tag
import react.RComponent
import react.RProps
import react.RState

class DialogElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : ModalElementBuilder(type) {

    var Tag.fullScreen: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["fullScreen"]
        set(value) { setProp("fullScreen", value) }
    var Tag.fullWidth: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["fullWidth"]
        set(value) { setProp("fullWidth", value) }
    var Tag.maxWidth: DialogMaxWidth
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["maxWidth"]
        set(value) { setProp("maxWidth", value) }
    var Tag.paperComponent: RComponent<RProps, RState>
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["PaperComponent"]
        set(value) { setProp("PaperComponent", value) }
    var Tag.paperProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["PaperProps"]
        set(value) { setProp("PaperProps", value) }
    var Tag.scroll: DialogScroll
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["scroll"]
        set(value) { setProp("scroll", value) }
    var Tag.transitionComponent: RComponent<RProps, RState>
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["TransitionComponent"]
        set(value) { setProp("TransitionComponent", value) }
    var Tag.transitionDuration: TransitionDuration
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["transitionDuration"]
        set(value) { setProp("transitionDuration", value) }
    var Tag.transitionProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["TransitionProps"]
        set(value) { setProp("TransitionProps", value) }
}