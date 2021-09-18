package materialui.components.table

import kotlinx.html.TABLE
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.Table
import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.RBuilder

@JsModule("@material-ui/core/Table")
@JsNonModule
private external val tableModule: dynamic

external interface TableProps : StandardProps {
    var padding: String?
}

fun RBuilder.table(rootStyle: String? = null, block: TableElementBuilder<TABLE>.() -> Unit) {
    child(TableElementBuilder(Table, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })) { TABLE(mapOf(), it) }.apply(block).create())
}
fun <T: Tag> RBuilder.table(rootStyle: String? = null, factory: (TagConsumer<Unit>) -> T, block: TableElementBuilder<T>.() -> Unit) {
    child(TableElementBuilder(Table, listOfNotNull(rootStyle?.let { MaterialStyle.root to it }), factory).apply(block).create())
}