package materialui.components.zoom

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Zoom")
private external val zoomModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val zoomComponent: RComponent<RProps, RState> = zoomModule.default

fun RBuilder.zoom(block: ZoomElementBuilder.() -> Unit)
    = child(ZoomElementBuilder(zoomComponent).apply(block).create())
