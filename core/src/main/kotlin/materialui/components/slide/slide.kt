package materialui.components.slide

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Slide")
private external val slideModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val slideComponent: RComponent<RProps, RState> = slideModule.default

fun RBuilder.slide(block: SlideElementBuilder.() -> Unit)
    = child(SlideElementBuilder(slideComponent).apply(block).create())
