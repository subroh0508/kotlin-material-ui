package materialui.components.treeItem

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.components.toolbar.enums.ToolbarStyle
import materialui.components.treeView.TreeViewProps
import org.w3c.dom.events.Event
import react.*

class TreeItemElementBuilder<T : Tag> internal constructor(
    type: RClass<TreeItemProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, TreeItemProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<ToolbarStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.collapseIcon: ReactElement? by materialProps
    var Tag.endIcon: ReactElement? by materialProps
    var Tag.expandIcon: ReactElement? by materialProps
    var Tag.icon: ReactElement? by materialProps
    var Tag.label: ReactElement by materialProps
    var Tag.nodeId: String by materialProps
    var Tag.TransitionComponent: RComponent<RProps, RState>? by materialProps
}