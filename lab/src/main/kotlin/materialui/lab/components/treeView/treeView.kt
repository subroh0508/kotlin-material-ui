package materialui.lab.components.treeView

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import kotlinx.html.UL
import materialui.components.StandardProps
import materialui.lab.components.treeView.enums.TreeViewStyle
import org.w3c.dom.events.Event
import react.RBuilder
import react.RClass
import react.ReactElement

@JsModule("@material-ui/lab/TreeView")
@JsNonModule
private external val treeViewModule: dynamic

external interface TreeViewProps : StandardProps {
    var defaultCollapseIcon: ReactElement?
    var defaultEndIcon: ReactElement?
    var defaultExpandIcon: ReactElement?
    var defaultParentIcon: ReactElement?
    var expanded: Array<String>?
    var defaultExpanded: Array<String>?
    var onNodeToggle: (event: Event, nodeIds: Array<String>) -> Unit?
    var defaultSelected: dynamic
    var multiSelect: Boolean?
    var selected: dynamic
    var onNodeSelect:(event: Event, value: dynamic) -> Unit?
}

@Suppress("UnsafeCastFromDynamic")
private val treeViewComponent: RClass<TreeViewProps> = treeViewModule.default

fun RBuilder.treeView(
    vararg classMap: Pair<TreeViewStyle, String>,
    multiSelect: Boolean = false,
    block: TreeViewElementBuilder<UL>.() -> Unit
) = child(
    when (multiSelect) {
        true -> MultiSelectTreeViewElementBuilder(treeViewComponent, classMap.toList()) { UL(mapOf(), it) }
        false -> SingleSelectTreeViewElementBuilder(treeViewComponent, classMap.toList()) { UL(mapOf(), it) }
    }.apply(block).create()
)

fun <T : Tag> RBuilder.treeView(
    vararg classMap: Pair<TreeViewStyle, String>,
    multiSelect: Boolean = false,
    factory: (TagConsumer<Unit>) -> T,
    block: TreeViewElementBuilder<T>.() -> Unit
) = child(
    when (multiSelect) {
        true -> MultiSelectTreeViewElementBuilder(treeViewComponent, classMap.toList(), factory)
        false -> SingleSelectTreeViewElementBuilder(treeViewComponent, classMap.toList(), factory)
    }.apply(block).create()
)
