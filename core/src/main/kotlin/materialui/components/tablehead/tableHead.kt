package materialui.components.tablehead

import kotlinx.html.THEAD
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.TableHead
import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.*

external interface TableHeadProps : StandardProps

fun RBuilder.tableHead(rootStyle: String? = null, block: TableHeadElementBuilder<THEAD>.() -> Unit) {
    child(TableHeadElementBuilder(TableHead, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })) { THEAD(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.tableHead(rootStyle: String? = null, factory: (TagConsumer<Unit>) -> T, block: TableHeadElementBuilder<T>.() -> Unit) {
    child(TableHeadElementBuilder(TableHead, listOfNotNull(rootStyle?.let { MaterialStyle.root to it }), factory).apply(block).create())
}
