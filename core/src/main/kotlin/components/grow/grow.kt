package components.grow

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Grow")
private external val growBarModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val growBarComponent: RComponent<RProps, RState> = growBarModule.default

fun RBuilder.grow(block: GrowElementBuilder.() -> Unit)
    = child(GrowElementBuilder(growBarComponent).apply(block).create())
