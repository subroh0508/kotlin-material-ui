package components.tablecell

import kotlinx.html.TD
import kotlinx.html.TH
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

fun RBuilder.thCell(block: TableCellElementBuilder<TH>.() -> Unit)
    = child(TableCellElementBuilder(tableCellComponent, TH::class) { TH(mapOf(), it) }.apply(block).create())

fun RBuilder.tdCell(block: TableCellElementBuilder<TD>.() -> Unit)
    = child(TableCellElementBuilder(tableCellComponent, TD::class) { TD(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.tableCell(tag: KClass<T>, block: TableCellElementBuilder<T>.() -> Unit)
    = child(TableCellElementBuilder(tableCellComponent, tag).apply(block).create())
