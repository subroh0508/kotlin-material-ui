package materialui.components.backdrop

import materialui.components.backdrop.enum.BackdropStyle
import materialui.components.fade.FadeProps
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/Backdrop")
private external val backdropModule: dynamic

external interface BackdropProps : FadeProps {
    var classes: Any?
    var invisible: Boolean?
    var open: Boolean?
    var transitionDuration: dynamic
}

@Suppress("UnsafeCastFromDynamic")
private val backdropComponent: RClass<BackdropProps> = backdropModule.default

fun RBuilder.backdrop(vararg classMap: Pair<BackdropStyle, String>, block: BackdropElementBuilder.() -> Unit)
    = child(BackdropElementBuilder(backdropComponent, classMap.toList()).apply(block).create())
