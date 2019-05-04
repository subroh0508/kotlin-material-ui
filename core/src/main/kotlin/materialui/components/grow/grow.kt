package materialui.components.grow

import materialui.reacttransiton.RTransitionProps
import materialui.styles.muitheme.MuiTheme
import react.RBuilder
import react.RClass
import react.RProps

@JsModule("@material-ui/core/Grow")
private external val growModule: dynamic

external interface GrowProps : RTransitionProps, RProps {
    var style: Any?
    var theme: MuiTheme?
}

@Suppress("UnsafeCastFromDynamic")
private val growComponent: RClass<GrowProps> = growModule.default

fun RBuilder.grow(block: GrowElementBuilder.() -> Unit)
    = child(GrowElementBuilder(growComponent).apply(block).create())
