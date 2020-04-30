package materialui.components.breadcrumbs

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.breadcrumbs.enums.BreadcrumbsStyle
import materialui.components.getValue
import materialui.components.setValue
import react.RClass
import react.ReactElement

class BreadcrumbsElementBuilder<T : Tag> internal constructor(
    type: RClass<BreadcrumbsProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, BreadcrumbsProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<BreadcrumbsStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.separator: ReactElement? by materialProps
    var Tag.maxItems: Int? by materialProps
    var Tag.itemsAfterCollapse: Int? by materialProps
    var Tag.itemsBeforeCollapse: Int? by materialProps
    var Tag.expandText: String? by materialProps
}