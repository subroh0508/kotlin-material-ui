package materialui.components.zoom

import materialui.reacttransiton.RTransitionProps
import materialui.styles.muitheme.MuiTheme
import react.RBuilder
import react.RClass
import react.RProps

@JsModule("@material-ui/core/Zoom")
private external val zoomModule: dynamic

external interface ZoomProps : RTransitionProps, RProps {
    var style: Any?
    var theme: MuiTheme?
}

@Suppress("UnsafeCastFromDynamic")
private val zoomComponent: RClass<ZoomProps> = zoomModule.default

fun RBuilder.zoom(block: ZoomElementBuilder.() -> Unit)
    = child(ZoomElementBuilder(zoomComponent).apply(block).create())
