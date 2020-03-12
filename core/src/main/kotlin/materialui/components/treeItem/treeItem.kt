package materialui.components.treeItem

import kotlinx.html.DIV
import kotlinx.html.RP
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.toolbar.enums.ToolbarStyle
import org.w3c.dom.events.Event
import react.*

@JsModule("@material-ui/lab/TreeItem")
private external val treeItemModule: dynamic

external interface TreeItemProps : StandardProps {
    var collapseIcon: ReactElement?
    var endIcon: ReactElement?
    var expandIcon: ReactElement?
    var icon: ReactElement?
    var label: ReactElement
    var nodeId: String
    var TransitionComponent: RComponent<RProps, RState>?
}

@Suppress("UnsafeCastFromDynamic")
private val treeItemComponent: RClass<TreeItemProps> = treeItemModule.default

fun RBuilder.treeItem(
    vararg classMap: Pair<ToolbarStyle, String>,
    block: TreeItemElementBuilder<DIV>.() -> Unit
) = child(TreeItemElementBuilder(treeItemComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T : Tag> RBuilder.treeItem(
    vararg classMap: Pair<ToolbarStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: TreeItemElementBuilder<T>.() -> Unit
) = child(TreeItemElementBuilder(treeItemComponent, classMap.toList(), factory).apply(block).create())
