package materialui.components.modal

import materialui.Modal
import materialui.components.StandardProps
import materialui.components.modal.enums.ModalStyle
import org.w3c.dom.events.Event
import react.RBuilder
import react.PropsWithChildren

external interface ModalProps : StandardProps {
    var BackdropComponent: dynamic
    var BackdropProps: PropsWithChildren?
    var container: dynamic
    var disableAutoFocus: Boolean?
    var disableBackdropClick: Boolean?
    var disableEnforceFocus: Boolean?
    var disableEscapeKeyDown: Boolean?
    var disablePortal: Boolean?
    var disableRestoreFocus: Boolean?
    var hideBackdrop: Boolean?
    var keepMounted: Boolean?
    var onBackdropClick: ((Event) -> Unit)?
    var onClose: ((Event, String) -> Unit)?
    var onRendered: (() -> Unit)?
    var open: Boolean?
}

fun RBuilder.modal(vararg classMap: Pair<ModalStyle, String>, block: ModalElementBuilder<ModalProps>.() -> Unit) {
    child(ModalElementBuilder(Modal, classMap.toList()).apply(block).create())
}