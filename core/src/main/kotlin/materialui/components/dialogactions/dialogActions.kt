package materialui.components.dialogactions

import materialui.components.StandardProps
import materialui.components.dialogactions.enums.DialogActionsStyle
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/DialogActions")
private external val dialogActionsModule: dynamic

external interface DialogActionProps : StandardProps {
    var disableActionSpacing: Boolean?
}

@Suppress("UnsafeCastFromDynamic")
private val dialogActionsComponent: RClass<DialogActionProps> = dialogActionsModule.default

fun RBuilder.dialogActions(vararg classMap: Pair<DialogActionsStyle, String>, block: DialogActionsElementBuilder.() -> Unit)
    = child(DialogActionsElementBuilder(dialogActionsComponent, classMap.toList()).apply(block).create())
