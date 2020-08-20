package materialui.lab.components.treeItem

import kotlinx.html.LI
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.lab.components.treeItem.enums.TreeItemStyle
import react.*

@JsModule("@material-ui/lab/TreeItem")
@JsNonModule
private external val treeItemModule: dynamic

external interface TreeItemProps : StandardProps {
    var collapseIcon: ReactElement?
    var endIcon: ReactElement?
    var expandIcon: ReactElement?
    var icon: ReactElement?
    var label: ReactElement?
    var nodeId: String?
    @Suppress("PropertyName")
    var TransitionProp: dynamic
    @Suppress("PropertyName")
    var TransitionComponent: dynamic
}

@Suppress("UnsafeCastFromDynamic")
private val treeItemComponent: RClass<TreeItemProps> = treeItemModule.default

fun RBuilder.treeItem(
    vararg classMap: Pair<TreeItemStyle, String>,
    block: TreeItemElementBuilder<LI>.() -> Unit
) = child(TreeItemElementBuilder(treeItemComponent, classMap.toList()) { LI(mapOf(), it) }.apply(block).create())

fun <T : Tag> RBuilder.treeItem(
    vararg classMap: Pair<TreeItemStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: TreeItemElementBuilder<T>.() -> Unit
) = child(TreeItemElementBuilder(treeItemComponent, classMap.toList(), factory).apply(block).create())
