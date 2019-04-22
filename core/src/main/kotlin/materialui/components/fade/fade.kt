package materialui.components.fade

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Fade")
private external val fadeModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val fadeComponent: RComponent<RProps, RState> = fadeModule.default

fun RBuilder.fade(block: FadeElementBuilder.() -> Unit)
    = child(FadeElementBuilder(fadeComponent).apply(block).create())
