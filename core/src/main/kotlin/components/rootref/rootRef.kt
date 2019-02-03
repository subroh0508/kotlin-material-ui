package components.rootref

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/RootRef")
private external val rootRefModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val rootRefComponent: RComponent<RProps, RState> = rootRefModule.default

fun RBuilder.rootRef(block: RootRefElementBuilder.() -> Unit)
    = child(RootRefElementBuilder(rootRefComponent).apply(block).create())
