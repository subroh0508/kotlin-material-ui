package materialui.components.fade

import materialui.Fade
import materialui.reacttransiton.RTransitionProps
import react.RBuilder
import react.PropsWithChildren

external interface FadeProps : RTransitionProps, PropsWithChildren

fun RBuilder.fade(block: FadeElementBuilder.() -> Unit) {
    child(FadeElementBuilder(Fade).apply(block).create())
}