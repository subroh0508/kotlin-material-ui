package materialui.components.tablebody

import kotlinx.html.TBODY
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/TableBody")
private external val tableBodyModule: dynamic

external interface TableBodyProps : StandardProps

@Suppress("UnsafeCastFromDynamic")
private val tableBodyComponent: RClass<TableBodyProps> = tableBodyModule.default

fun RBuilder.tableBody(rootStyle: String? = null, block: TableBodyElementBuilder<TBODY>.() -> Unit)
    = child(TableBodyElementBuilder(tableBodyComponent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })) { TBODY(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.tableBody(rootStyle: String? = null, factory: (TagConsumer<Unit>) -> T, block: TableBodyElementBuilder<T>.() -> Unit)
    = child(TableBodyElementBuilder(tableBodyComponent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it }), factory).apply(block).create())
