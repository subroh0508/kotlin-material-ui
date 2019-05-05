package materialui.components.popper

import materialui.components.StandardProps
import react.*

@JsModule("@material-ui/core/Popper")
private external val popperModule: dynamic

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

@Suppress("UnsafeCastFromDynamic")
private val popperComponent: RClass<PopperProps> = popperModule.default

fun RBuilder.popper(block: PopperElementBuilder.() -> Unit)
    = child(PopperElementBuilder(popperComponent).apply(block).create())
