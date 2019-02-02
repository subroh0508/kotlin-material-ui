package components.backdrop

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Backdrop")
private external val backdropModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val backdropComponent: RComponent<RProps, RState> = backdropModule.default

fun RBuilder.backdrop(block: BackdropElementBuilder.() -> Unit)
    = child(BackdropElementBuilder(backdropComponent).apply(block).create())
