package components.tablepagination

import kotlinx.html.TD
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/TableCell")
private external val tableCellModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val tableCellComponent: RComponent<RProps, RState> = tableCellModule.default

@JsModule("@material-ui/core/TablePagination")
private external val tablePaginationModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val tablePaginationComponent: RComponent<RProps, RState> = tablePaginationModule.default

fun RBuilder.tablePagination(block: TablePaginationElementBuilder<TD>.() -> Unit)
    = child(TablePaginationElementBuilder(tableCellComponent, TD::class) { TD(mapOf(), it) }.apply {
        block()
        setProp("component", tableCellComponent)
    }.create())

fun <T: Tag> RBuilder.tablePagination(tag: KClass<T>, block: TablePaginationElementBuilder<T>.() -> Unit)
    = child(TablePaginationElementBuilder(tableCellComponent, tag).apply(block).create())
