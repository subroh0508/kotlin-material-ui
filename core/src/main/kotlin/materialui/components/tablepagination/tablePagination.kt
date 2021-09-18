package materialui.components.tablepagination

import kotlinx.html.TD
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.TablePagination
import materialui.components.tablecell.TableCellProps
import materialui.components.tablepagination.enums.TablePaginationStyle
import org.w3c.dom.events.Event
import react.RBuilder
import react.PropsWithChildren
import react.ReactElement

external interface TablePaginationProps : TableCellProps {
    var ActionsComponent: dynamic
    var backIconButtonProps: PropsWithChildren?
    var count: Int?
    var labelDisplayedRows: ((LabelDisplayedRows) -> ReactElement)?
    var labelRowsPerPage: ReactElement?
    var nextIconButtonProps: RProps?
    var onChangePage: ((Event, Int) -> Unit)?
    var onChangeRowsPerPage: ((Event) -> Unit)?
    var page: Int?
    var rowsPerPage: Int?
    var rowsPerPageOptions: Array<Int>?
    var SelectProps: RProps?
}

external interface LabelDisplayedRows {
    val from: Int
    val to: Int
    val count: Int
    val page: Int
}

fun RBuilder.tablePagination(vararg classMap: Pair<TablePaginationStyle, String>, block: TablePaginationElementBuilder<TD>.() -> Unit)
    = child(TablePaginationElementBuilder(TablePagination, classMap.toList()) { TD(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.tablePagination(vararg classMap: Pair<TablePaginationStyle, String>, factory: (TagConsumer<Unit>) -> T, block: TablePaginationElementBuilder<T>.() -> Unit)
    = child(TablePaginationElementBuilder(TablePagination, classMap.toList(), factory).apply(block).create())
