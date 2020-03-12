package materialui.components.treeView

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.components.toolbar.enums.ToolbarStyle
import org.w3c.dom.events.Event
import react.RClass
import react.ReactElement

class TreeViewElementBuilder<T : Tag> internal constructor(
    type: RClass<TreeViewProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, TreeViewProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<ToolbarStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.defaultCollapseIcon: ReactElement? by materialProps
    var Tag.defaultEndIcon: ReactElement? by materialProps
    var Tag.defaultExpandIcon: ReactElement? by materialProps
    var Tag.defaultParentIcon: ReactElement? by materialProps
    var Tag.expanded: Array<String>? by materialProps
    var Tag.defaultExpanded: Array<String>? by materialProps
    var Tag.onNodeToggle: (event: Event, nodeIds: Array<String>) -> Unit by materialProps
}