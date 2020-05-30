package materialui.components.tablefooter

import kotlinx.html.TFOOT
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.TableFooter
import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.*

external interface TableFooterProps : StandardProps

fun RBuilder.tableFooter(rootStyle: String? = null, block: TableFooterElementBuilder<TFOOT>.() -> Unit)
    = child(TableFooterElementBuilder(TableFooter, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })) { TFOOT(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.tableFooter(rootStyle: String? = null, factory: (TagConsumer<Unit>) -> T, block: TableFooterElementBuilder<T>.() -> Unit)
    = child(TableFooterElementBuilder(TableFooter, listOfNotNull(rootStyle?.let { MaterialStyle.root to it }), factory).apply(block).create())
