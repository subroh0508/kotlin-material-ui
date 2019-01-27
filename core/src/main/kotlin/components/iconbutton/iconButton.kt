package components.iconbutton

import react.RBuilder
import react.RComponent
import react.RState

@JsModule("@material-ui/core/IconButton")
private external val iconButtonModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val iconButtonComponent: RComponent<IconButtonProps, RState> = iconButtonModule.default

fun RBuilder.iconButton(block: IconButtonElementBuilder.() -> Unit)
    = child(IconButtonElementBuilder(iconButtonComponent).apply(block).create())