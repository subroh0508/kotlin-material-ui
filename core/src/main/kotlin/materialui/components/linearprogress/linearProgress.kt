package materialui.components.linearprogress

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/LinearProgress")
private external val linearProgressModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val linearProgressComponent: RComponent<RProps, RState> = linearProgressModule.default

fun RBuilder.linearProgress(block: LinearProgressElementBuilder.() -> Unit)
    = child(LinearProgressElementBuilder(linearProgressComponent).apply(block).create())
