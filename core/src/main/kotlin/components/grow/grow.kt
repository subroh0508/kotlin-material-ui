package components.grow

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Grow")
private external val growModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val growComponent: RComponent<RProps, RState> = growModule.default

fun RBuilder.grow(block: GrowElementBuilder.() -> Unit)
    = child(GrowElementBuilder(growComponent).apply(block).create())
