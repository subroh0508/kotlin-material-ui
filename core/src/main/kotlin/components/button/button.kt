package components.button

import react.RBuilder
import react.RComponent
import react.RState

@JsModule("@material-ui/core/Button")
private external val buttonModule: dynamic
private val buttonComponent: RComponent<ButtonProps, RState> = buttonModule.default

fun RBuilder.button(block: ButtonElementBuilder.() -> Unit)
        = child(ButtonElementBuilder(buttonComponent).apply(block).create())