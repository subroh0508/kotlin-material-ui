package materialui.components.backdrop

import kotlinx.html.DIV
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Backdrop")
private external val backdropModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val backdropComponent: RComponent<RProps, RState> = backdropModule.default

fun RBuilder.backdrop(block: BackdropElementBuilder<DIV>.() -> Unit)
    = child(BackdropElementBuilder(backdropComponent, DIV::class, { DIV(mapOf(), it) }).apply(block).create())
