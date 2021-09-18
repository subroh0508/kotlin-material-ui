package materialui.components.gridlist

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import kotlinx.html.UL
import materialui.GridList
import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.*

external interface GridListProps : StandardProps {
    var cellHeight: Any?
    var cols: Number?
    var spacing: Number?
    var style: Any?
}

fun RBuilder.gridList(rootStyle: String? = null, block: GridListElementBuilder<UL>.() -> Unit) {
    child(GridListElementBuilder(GridList, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })) { UL(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.gridList(rootStyle: String? = null, factory: (TagConsumer<Unit>) -> T, block: GridListElementBuilder<T>.() -> Unit) {
    child(GridListElementBuilder(GridList, listOfNotNull(rootStyle?.let { MaterialStyle.root to it }), factory).apply(block).create())
}