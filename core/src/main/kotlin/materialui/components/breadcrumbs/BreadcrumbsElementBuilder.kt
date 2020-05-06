package materialui.components.breadcrumbs

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.breadcrumbs.enums.BreadcrumbsStyle
import materialui.components.getValue
import materialui.components.setValue
import org.w3c.dom.Node
import react.RBuilder
import react.RClass
import react.ReactElement
import react.buildElement

class BreadcrumbsElementBuilder<T : Tag> internal constructor(
    type: RClass<BreadcrumbsProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, BreadcrumbsProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<BreadcrumbsStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.separator: Any? by materialProps
    var Tag.maxItems: Int? by materialProps
    var Tag.itemsAfterCollapse: Int? by materialProps
    var Tag.itemsBeforeCollapse: Int? by materialProps
    var Tag.expandText: String? by materialProps

    fun Tag.separator(node: Node) { separator = node }
    fun Tag.separator(block: RBuilder.() -> Unit) { separator = buildElement(block) }
}
