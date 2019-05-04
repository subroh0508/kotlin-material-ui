package materialui.components.slide

import materialui.reacttransiton.RTransitionProps
import materialui.styles.muitheme.MuiTheme
import react.RBuilder
import react.RClass
import react.RProps

@JsModule("@material-ui/core/Slide")
private external val slideModule: dynamic

external interface SlideProps : RTransitionProps, RProps {
    var style: Any?
    var theme: MuiTheme?
}

@Suppress("UnsafeCastFromDynamic")
private val slideComponent: RClass<SlideProps> = slideModule.default

fun RBuilder.slide(block: SlideElementBuilder.() -> Unit)
    = child(SlideElementBuilder(slideComponent).apply(block).create())
