package components.buttonbase

import react.RBuilder
import react.RComponent
import react.RState


@JsModule("@material-ui/core/Button")
private external val buttonModule: dynamic
private val buttonComponent: RComponent<ButtonBaseProps, RState> = buttonModule.default

fun RBuilder.buttonBase(block: ButtonBaseElementBuilder.() -> Unit)
    = child(ButtonBaseElementBuilder(buttonComponent).apply(block).create())