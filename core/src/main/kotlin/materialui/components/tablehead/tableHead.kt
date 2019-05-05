package materialui.components.tablehead

import kotlinx.html.THEAD
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.*
import kotlin.reflect.KClass

@JsModule("@material-ui/core/TableHead")
private external val tableHeadModule: dynamic

external interface TableHeaderProps : StandardProps

@Suppress("UnsafeCastFromDynamic")
private val tableHeadComponent: RClass<TableHeaderProps> = tableHeadModule.default

fun RBuilder.tableHead(rootStyle: String? = null, block: TableHeadElementBuilder<THEAD>.() -> Unit)
    = child(TableHeadElementBuilder(tableHeadComponent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })) { THEAD(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.tableHead(rootStyle: String? = null, factory: (TagConsumer<Unit>) -> T, block: TableHeadElementBuilder<T>.() -> Unit)
    = child(TableHeadElementBuilder(tableHeadComponent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it }), factory).apply(block).create())

