package materialui.components.toolbar

import kotlinx.html.DIV
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Toolbar")
private external val toolbarModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val toolbarComponent: RComponent<RProps, RState> = toolbarModule.default

fun RBuilder.toolbar(block: ToolbarElementBuilder<DIV>.() -> Unit)
    = child(ToolbarElementBuilder(toolbarComponent, DIV::class) { DIV(mapOf(), it) }.apply(block).create())