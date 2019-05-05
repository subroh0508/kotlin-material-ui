package materialui.components.toolbar

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.toolbar.enums.ToolbarStyle
import react.*

@JsModule("@material-ui/core/Toolbar")
private external val toolbarModule: dynamic

external interface ToolbarProps : StandardProps {
    var disableGutters: Boolean?
    var variant: String?
}

@Suppress("UnsafeCastFromDynamic")
private val toolbarComponent: RClass<ToolbarProps> = toolbarModule.default

fun RBuilder.toolbar(vararg classMap: Pair<ToolbarStyle, String>, block: ToolbarElementBuilder<DIV>.() -> Unit)
    = child(ToolbarElementBuilder(toolbarComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.toolbar(vararg classMap: Pair<ToolbarStyle, String>, factory: (TagConsumer<Unit>) -> T, block: ToolbarElementBuilder<T>.() -> Unit)
    = child(ToolbarElementBuilder(toolbarComponent, classMap.toList(), factory).apply(block).create())
