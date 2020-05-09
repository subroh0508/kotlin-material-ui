package materialui.lab.components.treeView

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.lab.components.treeView.enums.TreeViewStyle
import org.w3c.dom.events.Event
import react.RBuilder
import react.RClass
import react.ReactElement
import react.buildElement

abstract class TreeViewElementBuilder<T : Tag> internal constructor(
    type: RClass<TreeViewProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T,
    multiSelect: Boolean
) : MaterialElementBuilder<T, TreeViewProps>(type, classMap, factory) {
    init { materialProps.multiSelect = multiSelect }

    fun Tag.classes(vararg classMap: Pair<TreeViewStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.defaultCollapseIcon: ReactElement? by materialProps
    var Tag.defaultEndIcon: ReactElement? by materialProps
    var Tag.defaultExpandIcon: ReactElement? by materialProps
    var Tag.defaultParentIcon: ReactElement? by materialProps
    var Tag.expanded: Array<String>? by materialProps
    var Tag.defaultExpanded: Array<String>? by materialProps
    var Tag.onNodeToggle: (event: Event, nodeIds: Array<String>) -> Unit by materialProps
    var Tag.multiSelect: Boolean? by materialProps
    var Tag.selected: String? by materialProps

    fun Tag.defaultCollapseIcon(block: RBuilder.() -> Unit) {
        defaultCollapseIcon = buildElement(block)
    }
    fun Tag.defaultEndIcon(block: RBuilder.() -> Unit) {
        defaultEndIcon = buildElement(block)
    }
    fun Tag.defaultExpandIcon(block: RBuilder.() -> Unit) {
        defaultExpandIcon = buildElement(block)
    }
    fun Tag.defaultParentIcon(block: RBuilder.() -> Unit) {
        defaultParentIcon = buildElement(block)
    }

    protected var Tag.onNodeSelect:(event: Event, value: dynamic) -> Unit? by materialProps
}

class SingleSelectTreeViewElementBuilder<T : Tag> internal constructor(
    type: RClass<TreeViewProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : TreeViewElementBuilder<T>(type, classMap, factory, false) {
    var Tag.defaultSelected: String? by materialProps

    fun Tag.onNodeSelect(block: (Event, String) -> Unit) { onNodeSelect = block }
}

class MultiSelectTreeViewElementBuilder<T : Tag> internal constructor(
    type: RClass<TreeViewProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : TreeViewElementBuilder<T>(type, classMap, factory, true) {
    var Tag.defaultSelected: Array<String>? by materialProps

    fun Tag.onNodeSelect(block: (Event, Array<String>) -> Unit) { onNodeSelect = block }
}
