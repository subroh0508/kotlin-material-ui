package materialui.components.table

import kotlinx.html.TABLE
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/Table")
private external val tableModule: dynamic

external interface TableProps : StandardProps {
    var padding: String?
}

@Suppress("UnsafeCastFromDynamic")
private val tableComponent: RClass<TableProps> = tableModule.default

fun RBuilder.table(rootStyle: String? = null, block: TableElementBuilder<TABLE>.() -> Unit)
    = child(TableElementBuilder(tableComponent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })) { TABLE(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.table(rootStyle: String? = null, factory: (TagConsumer<Unit>) -> T, block: TableElementBuilder<T>.() -> Unit)
    = child(TableElementBuilder(tableComponent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it }), factory).apply(block).create())