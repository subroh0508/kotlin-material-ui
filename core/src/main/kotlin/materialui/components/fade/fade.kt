package materialui.components.fade

import materialui.Fade
import materialui.reacttransiton.RTransitionProps
import react.RBuilder
import react.RProps

external interface FadeProps : RTransitionProps, RProps

fun RBuilder.fade(block: FadeElementBuilder.() -> Unit)
    = child(FadeElementBuilder(Fade).apply(block).create())
