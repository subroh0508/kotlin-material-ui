package materialui.components.tablerow

import kotlinx.html.TR
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.TableRow
import materialui.components.StandardProps
import materialui.components.tablerow.enums.TableRowStyle
import react.*

external interface TableRowProps : StandardProps {
    var hover: Boolean?
    var selected: Boolean?
}

fun RBuilder.tableRow(vararg classMap: Pair<TableRowStyle, String>, block: TableRowElementBuilder<TR>.() -> Unit) {
    child(TableRowElementBuilder(TableRow, classMap.toList()) { TR(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.tableRow(vararg classMap: Pair<TableRowStyle, String>, factory: (TagConsumer<Unit>) -> T, block: TableRowElementBuilder<T>.() -> Unit) {
    child(TableRowElementBuilder(TableRow, classMap.toList(), factory).apply(block).create())
}