package materialui.components.dialog

import materialui.components.dialog.enums.DialogStyle
import materialui.components.modal.ModalProps
import react.RBuilder
import react.RClass
import react.RProps

@JsModule("@material-ui/core/Dialog")
private external val dialogModule: dynamic

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

@Suppress("UnsafeCastFromDynamic")
private val dialogComponent: RClass<DialogProps> = dialogModule.default

fun RBuilder.dialog(vararg classMap: Pair<DialogStyle, String>, block: DialogElementBuilder.() -> Unit)
    = child(DialogElementBuilder(dialogComponent, classMap.toList()).apply(block).create())
