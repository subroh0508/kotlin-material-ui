package materialui.components.toolbar

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.Toolbar
import materialui.components.StandardProps
import materialui.components.toolbar.enums.ToolbarStyle
import react.*

external interface ToolbarProps : StandardProps {
    var disableGutters: Boolean?
    var variant: String?
}

fun RBuilder.toolbar(vararg classMap: Pair<ToolbarStyle, String>, block: ToolbarElementBuilder<DIV>.() -> Unit) {
    child(ToolbarElementBuilder(Toolbar, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.toolbar(vararg classMap: Pair<ToolbarStyle, String>, factory: (TagConsumer<Unit>) -> T, block: ToolbarElementBuilder<T>.() -> Unit) {
    child(ToolbarElementBuilder(Toolbar, classMap.toList(), factory).apply(block).create())
}