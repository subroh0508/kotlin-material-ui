package materialui.components.hidden

import materialui.components.StandardProps
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/Hidden")
private external val hiddenModule: dynamic

external interface HiddenProps : StandardProps {
    var implementation: String?
    var initialWidth: String?
    var lgDown: Boolean?
    var lgUp: Boolean?
    var mdDown: Boolean?
    var mdUp: Boolean?
    var only: Any?
    var smDown: Boolean?
    var smUp: Boolean?
    var xlDown: Boolean?
    var xlUp: Boolean?
    var xsDown: Boolean?
    var xsUp: Boolean?
}

@Suppress("UnsafeCastFromDynamic")
private val hiddenComponent: RClass<HiddenProps> = hiddenModule.default

fun RBuilder.hidden(block: HiddenElementBuilder.() -> Unit)
    = child(HiddenElementBuilder(hiddenComponent).apply(block).create())
