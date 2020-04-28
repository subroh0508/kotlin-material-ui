package materialui.lab.components.treeView

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.toolbar.enums.ToolbarStyle
import org.w3c.dom.events.Event
import react.RBuilder
import react.RClass
import react.ReactElement

@JsModule("@material-ui/lab/TreeView")
private external val treeViewModule: dynamic

external interface TreeViewProps : StandardProps {
    var defaultCollapseIcon: ReactElement?
    var defaultEndIcon: ReactElement?
    var defaultExpandIcon: ReactElement?
    var defaultParentIcon: ReactElement?
    var expanded: Array<String>?
    var defaultExpanded: Array<String>?
    var onNodeToggle: (event: Event, nodeIds: Array<String>) -> Unit?
}

@Suppress("UnsafeCastFromDynamic")
private val treeViewComponent: RClass<TreeViewProps> = treeViewModule.default

fun RBuilder.treeView(
    vararg classMap: Pair<ToolbarStyle, String>,
    block: TreeViewElementBuilder<DIV>.() -> Unit
) = child(TreeViewElementBuilder(treeViewComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T : Tag> RBuilder.treeView(
    vararg classMap: Pair<ToolbarStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: TreeViewElementBuilder<T>.() -> Unit
) = child(TreeViewElementBuilder(treeViewComponent, classMap.toList(), factory).apply(block).create())
