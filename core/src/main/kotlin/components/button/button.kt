package components.button

import react.RBuilder
import react.RComponent
import react.RState

@JsModule("@material-ui/core/Button")
private external val buttonModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val buttonComponent: RComponent<ButtonProps, RState> = buttonModule.default

fun RBuilder.button(caption: String = "", block: ButtonElementBuilder.() -> Unit)
        = child(ButtonElementBuilder(caption, buttonComponent).apply(block).create())