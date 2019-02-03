package components.tablerow

import kotlinx.html.TR
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/TableRow")
private external val tableRowModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val tableRowComponent: RComponent<RProps, RState> = tableRowModule.default

fun RBuilder.tableRow(block: TableRowElementBuilder<TR>.() -> Unit)
    = child(TableRowElementBuilder(tableRowComponent, TR::class) { TR(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.tableRow(tag: KClass<T>, block: TableRowElementBuilder<T>.() -> Unit)
    = child(TableRowElementBuilder(tableRowComponent, tag).apply(block).create())
