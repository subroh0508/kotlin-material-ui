package components.hidden

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Hidden")
private external val hiddenModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val hiddenComponent: RComponent<RProps, RState> = hiddenModule.default

fun RBuilder.hidden(block: HiddenElementBuilder.() -> Unit)
    = child(HiddenElementBuilder(hiddenComponent).apply(block).create())
