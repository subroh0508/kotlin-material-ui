package materialui.components.snackbar

import materialui.components.StandardProps
import materialui.components.snackbar.enums.SnackbarOriginHorizontal
import materialui.components.snackbar.enums.SnackbarOriginVertical
import materialui.components.snackbar.enums.SnackbarStyle
import materialui.reacttransiton.RTransitionHandlerProps
import materialui.reacttransiton.RTransitionProps
import react.RBuilder
import react.RClass
import react.RProps
import react.ReactElement

@JsModule("@material-ui/core/Snackbar")
private external val snackbarModule: dynamic

external interface SnackbarProps : RTransitionHandlerProps, StandardProps {
    var action: ReactElement?
    var anchorOrigin: SnackbarOrigin?
    var autoHideDuration: Number?
    var ClickAwayListenerProps: RProps?
    var ContentProps: RProps?
    var disableWindowBlurListener: Boolean?
    var key: Any?
    var message: ReactElement?
    var open: Boolean?
    var resumeHideDuration: Number?
    var TransitionComponent: dynamic
    var transitionDuration: dynamic
    var TransitionProps: RTransitionProps?
}

external interface SnackbarOrigin

var SnackbarOrigin.horizontal: SnackbarOriginHorizontal?
    get() = (asDynamic()["horizontal"] as String?)?.let { SnackbarOriginHorizontal.valueOf(it) }
    set(value) { asDynamic()["horizontal"] = value?.toString() }
var SnackbarOrigin.vertical: SnackbarOriginVertical?
    get() = (asDynamic()["vertical"] as String?)?.let { SnackbarOriginVertical.valueOf(it) }
    set(value) { asDynamic()["vertical"] = value?.toString() }

@Suppress("UnsafeCastFromDynamic")
private val snackbarComponent: RClass<SnackbarProps> = snackbarModule.default

fun RBuilder.snackbar(vararg classMap: Pair<SnackbarStyle, String>, block: SnackbarElementBuilder.() -> Unit)
    = child(SnackbarElementBuilder(snackbarComponent, classMap.toList()).apply(block).create())
