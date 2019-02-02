package components.dialogactions

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/DialogActions")
private external val dialogActionsModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val dialogActionsComponent: RComponent<RProps, RState> = dialogActionsModule.default

fun RBuilder.dialogActions(block: DialogActionsElementBuilder.() -> Unit)
    = child(DialogActionsElementBuilder(dialogActionsComponent).apply(block).create())
