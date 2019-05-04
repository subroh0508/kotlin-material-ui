package materialui.components.fade

import materialui.reacttransiton.RTransitionProps
import react.RBuilder
import react.RClass
import react.RProps

@JsModule("@material-ui/core/Fade")
private external val fadeModule: dynamic

external interface FadeProps : RTransitionProps, RProps

@Suppress("UnsafeCastFromDynamic")
private val fadeComponent: RClass<FadeProps> = fadeModule.default

fun RBuilder.fade(block: FadeElementBuilder.() -> Unit)
    = child(FadeElementBuilder(fadeComponent).apply(block).create())
