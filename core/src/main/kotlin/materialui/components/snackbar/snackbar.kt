package materialui.components.snackbar

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Snackbar")
private external val snackbarModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val snackbarComponent: RComponent<RProps, RState> = snackbarModule.default

fun RBuilder.snackbar(block: SnackbarElementBuilder.() -> Unit)
    = child(SnackbarElementBuilder(snackbarComponent).apply(block).create())
