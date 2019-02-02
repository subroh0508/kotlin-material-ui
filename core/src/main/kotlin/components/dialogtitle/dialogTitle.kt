package components.dialogtitle

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/DialogTitle")
private external val dialogTitleModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val dialogTitleComponent: RComponent<RProps, RState> = dialogTitleModule.default

fun RBuilder.dialogTitle(block: DialogTitleElementBuilder.() -> Unit)
    = child(DialogTitleElementBuilder(dialogTitleComponent).apply(block).create())
