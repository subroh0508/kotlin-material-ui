package materialui.components.popper

import materialui.Popper
import materialui.components.StandardProps
import react.*

external interface PopperProps : StandardProps {
    var anchorEl: dynamic
    var container: dynamic
    var disablePortal: Boolean?
    var keepMounted: Boolean?
    // todo Make external interface(https://github.com/FezVrasta/popper.js/blob/master/packages/popper/src/modifiers/index.js)
    var modifiers: dynamic
    var open: Boolean?
    var placement: String?
    // todo Make external interface(https://github.com/FezVrasta/popper.js/blob/master/packages/popper/src/methods/defaults.js)
    var popperOptions: dynamic
    var transition: Boolean
}

fun RBuilder.popper(block: PopperElementBuilder.() -> Unit)
    = child(popperElement(block))

internal fun popperElement(
    block: PopperElementBuilder.() -> Unit
) = PopperElementBuilder(Popper).apply(block).create()
