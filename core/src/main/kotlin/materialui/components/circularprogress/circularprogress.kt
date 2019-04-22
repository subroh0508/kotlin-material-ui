package materialui.components.circularprogress

import materialui.components.circularprogress.values.CircularProgressValue
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/CircularProgress")
private external val circularProgressModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val circularProgressComponent: RComponent<RProps, RState> = circularProgressModule.default

fun RBuilder.circularProgress(block: CircularProgressElementBuilder.() -> Unit)
    = child(CircularProgressElementBuilder(circularProgressComponent).apply(block).create())

fun cv(v: String) = CircularProgressValue(v)
fun cv(v: Number) = CircularProgressValue(v)
