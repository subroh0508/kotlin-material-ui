package components.tablehead

import kotlinx.html.THEAD
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/TableHead")
private external val tableHeadModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val tableHeadComponent: RComponent<RProps, RState> = tableHeadModule.default

fun RBuilder.tableHead(block: TableHeadElementBuilder<THEAD>.() -> Unit)
    = child(TableHeadElementBuilder(tableHeadComponent, THEAD::class) { THEAD(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.tableHead(tag: KClass<T>, block: TableHeadElementBuilder<T>.() -> Unit)
    = child(TableHeadElementBuilder(tableHeadComponent, tag).apply(block).create())

