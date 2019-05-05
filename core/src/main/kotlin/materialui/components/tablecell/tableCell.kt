package materialui.components.tablecell

import kotlinx.html.TD
import kotlinx.html.TH
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.tablecell.enums.TableCellStyle
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/TableCell")
private external val tableCellModule: dynamic

external interface TableCellProps : StandardProps {
    var align: String?
    @Deprecated("Instead, use the `align` property.")
    var numeric: Boolean?
    var padding: String?
    var scope: String?
    var sortDirection: String?
    var variant: String?
}

@Suppress("UnsafeCastFromDynamic")
private val tableCellComponent: RClass<TableCellProps> = tableCellModule.default

fun RBuilder.thCell(vararg classMap: Pair<TableCellStyle, String>, block: TableCellElementBuilder<TH, TableCellProps>.() -> Unit)
    = child(TableCellElementBuilder(tableCellComponent, classMap.toList()) { TH(mapOf(), it) }.apply(block).create())

fun RBuilder.tdCell(vararg classMap: Pair<TableCellStyle, String>, block: TableCellElementBuilder<TD, TableCellProps>.() -> Unit)
    = child(TableCellElementBuilder(tableCellComponent, classMap.toList()) { TD(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.tableCell(vararg classMap: Pair<TableCellStyle, String>, factory: (TagConsumer<Unit>) -> T, block: TableCellElementBuilder<T, TableCellProps>.() -> Unit)
    = child(TableCellElementBuilder(tableCellComponent, classMap.toList(), factory).apply(block).create())
