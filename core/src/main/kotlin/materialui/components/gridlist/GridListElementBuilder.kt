package materialui.components.gridlist

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import react.RClass

class GridListElementBuilder<T: Tag> internal constructor(
    type: RClass<GridListProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, GridListProps>(type, classMap, factory) {
    val Tag.cellHeight: Any? by materialProps
    var Tag.cols: Number? by materialProps
    var Tag.spacing: Number? by materialProps
    var Tag.style: Any? by materialProps

    fun Tag.cellHeight(v: String = "auto") { materialProps.cellHeight = v }
    fun Tag.cellHeight(v: Number) { materialProps.cellHeight = v }
}