package materialui.components.rootref

import react.*

@JsModule("@material-ui/core/RootRef")
private external val rootRefModule: dynamic

external interface RootRefProps : RProps {
    var rootRef: RRef?
}

@Suppress("UnsafeCastFromDynamic")
private val rootRefComponent: RClass<RootRefProps> = rootRefModule.default

fun RBuilder.rootRef(block: RootRefElementBuilder.() -> Unit)
    = child(RootRefElementBuilder(rootRefComponent).apply(block).create())
