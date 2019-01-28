package components.toolbar

import react.RBuilder
import react.RComponent
import react.RState

@JsModule("@material-ui/core/Toolbar")
private external val toolbarModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val toolbarComponent: RComponent<ToolbarProps, RState> = toolbarModule.default

fun RBuilder.toolbar(block: ToolbarElementBuilder.() -> Unit)
    = child(ToolbarElementBuilder(toolbarComponent).apply(block).create())