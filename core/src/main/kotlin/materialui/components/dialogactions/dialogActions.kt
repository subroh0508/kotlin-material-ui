package materialui.components.dialogactions

import materialui.DialogActions
import materialui.components.StandardProps
import materialui.components.dialogactions.enums.DialogActionsStyle
import react.RBuilder

external interface DialogActionsProps : StandardProps {
    var disableSpacing: Boolean?
}

fun RBuilder.dialogActions(vararg classMap: Pair<DialogActionsStyle, String>, block: DialogActionsElementBuilder.() -> Unit) {
    child(DialogActionsElementBuilder(DialogActions, classMap.toList()).apply(block).create())
}