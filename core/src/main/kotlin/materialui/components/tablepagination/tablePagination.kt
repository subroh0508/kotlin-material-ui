package materialui.components.tablepagination

import kotlinx.html.TD
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.tablecell.TableCellProps
import materialui.components.tablepagination.enums.TablePaginationStyle
import org.w3c.dom.events.Event
import react.RBuilder
import react.RClass
import react.RProps
import react.ReactElement

@JsModule("@material-ui/core/TablePagination")
private external val tablePaginationModule: dynamic

external interface TablePaginationProps : TableCellProps {
    var ActionsComponent: dynamic
    var backIconButtonProps: RProps?
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

@Suppress("UnsafeCastFromDynamic")
private val tablePaginationComponent: RClass<TablePaginationProps> = tablePaginationModule.default

fun RBuilder.TablePagination(vararg classMap: Pair<TablePaginationStyle, String>, block: TablePaginationElementBuilder<TD>.() -> Unit)
    = child(TablePaginationElementBuilder(tablePaginationComponent, classMap.toList()) { TD(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.tablePagination(vararg classMap: Pair<TablePaginationStyle, String>, factory: (TagConsumer<Unit>) -> T, block: TablePaginationElementBuilder<T>.() -> Unit)
    = child(TablePaginationElementBuilder(tablePaginationComponent, classMap.toList(), factory).apply(block).create())
