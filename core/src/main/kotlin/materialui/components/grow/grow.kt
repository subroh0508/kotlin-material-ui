package materialui.components.grow

import materialui.Grow
import materialui.reacttransiton.RTransitionProps
import materialui.styles.muitheme.MuiTheme
import react.RBuilder
import react.PropsWithChildren

external interface GrowProps : RTransitionProps, PropsWithChildren {
    var style: Any?
    var theme: MuiTheme?
}

fun RBuilder.grow(block: GrowElementBuilder.() -> Unit)
    = child(GrowElementBuilder(Grow).apply(block).create())
