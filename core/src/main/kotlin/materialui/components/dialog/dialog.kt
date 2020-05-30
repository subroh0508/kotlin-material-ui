package materialui.components.dialog

import materialui.Dialog
import materialui.components.dialog.enums.DialogStyle
import materialui.components.modal.ModalProps
import react.RBuilder
import react.RProps

external interface DialogProps : ModalProps {
    var fullScreen: Boolean?
    var fullWidth: Boolean?
    var maxWidth: String?
    var PaperComponent: dynamic
    var PaperProps: RProps?
    var scroll: String?
    var TransitionComponent: dynamic
    var transitionDuration: dynamic
    var TransitionProps: RProps?
}

fun RBuilder.dialog(vararg classMap: Pair<DialogStyle, String>, block: DialogElementBuilder.() -> Unit)
    = child(DialogElementBuilder(Dialog, classMap.toList()).apply(block).create())
