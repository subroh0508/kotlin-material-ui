package components.buttonbase

import react.RBuilder
import react.RComponent
import react.RState


@JsModule("@material-ui/core/ButtonBase")
private external val buttonBaseModule: dynamic
private val buttonBaseComponent: RComponent<ButtonBaseProps, RState> = buttonBaseModule.default

fun RBuilder.buttonBase(block: ButtonBaseElementBuilder.() -> Unit)
    = child(ButtonBaseElementBuilder(buttonBaseComponent).apply(block).create())