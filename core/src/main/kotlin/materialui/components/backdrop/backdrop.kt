package materialui.components.backdrop

import materialui.Backdrop
import materialui.components.backdrop.enum.BackdropStyle
import materialui.components.fade.FadeProps
import react.RBuilder

external interface BackdropProps : FadeProps {
    var classes: Any?
    var invisible: Boolean?
    var open: Boolean?
    var transitionDuration: dynamic
}

fun RBuilder.backdrop(vararg classMap: Pair<BackdropStyle, String>, block: BackdropElementBuilder.() -> Unit)
    = child(backdropElement(classMap.toList(), block))

internal fun backdropElement(
    classMap: List<Pair<BackdropStyle, String>> = listOf(),
    block: BackdropElementBuilder.() -> Unit,
) = BackdropElementBuilder(Backdrop, classMap.toList()).apply(block).create()
