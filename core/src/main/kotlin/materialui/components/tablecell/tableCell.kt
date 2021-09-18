package materialui.components.tablecell

import kotlinx.html.TD
import kotlinx.html.TH
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.TableCell
import materialui.components.StandardProps
import materialui.components.tablecell.enums.TableCellStyle
import react.RBuilder

external interface TableCellProps : StandardProps {
    var align: String?
    var padding: String?
    var scope: String?
    var sortDirection: String?
    var size: String?
    var variant: String?
}

fun RBuilder.thCell(vararg classMap: Pair<TableCellStyle, String>, block: TableCellElementBuilder<TH, TableCellProps>.() -> Unit) {
    child(TableCellElementBuilder(TableCell, classMap.toList()) { TH(mapOf(), it) }.apply(block).create())
}
fun RBuilder.tdCell(vararg classMap: Pair<TableCellStyle, String>, block: TableCellElementBuilder<TD, TableCellProps>.() -> Unit) {
    child(TableCellElementBuilder(TableCell, classMap.toList()) { TD(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.tableCell(vararg classMap: Pair<TableCellStyle, String>, factory: (TagConsumer<Unit>) -> T, block: TableCellElementBuilder<T, TableCellProps>.() -> Unit) {
    child(TableCellElementBuilder(TableCell, classMap.toList(), factory).apply(block).create())
}