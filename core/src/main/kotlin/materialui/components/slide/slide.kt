package materialui.components.slide

import materialui.Slide
import materialui.reacttransiton.RTransitionProps
import materialui.styles.muitheme.MuiTheme
import react.RBuilder
import react.PropsWithChildren

external interface SlideProps : RTransitionProps, PropsWithChildren {
    var style: Any?
    var theme: MuiTheme?
}

fun RBuilder.slide(block: SlideElementBuilder.() -> Unit)
    = child(SlideElementBuilder(Slide).apply(block).create())
