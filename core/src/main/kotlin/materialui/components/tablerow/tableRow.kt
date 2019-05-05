package materialui.components.tablerow

import kotlinx.css.Display
import kotlinx.html.TR
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.tablerow.enums.TableRowStyle
import react.*
import kotlin.reflect.KClass

@JsModule("@material-ui/core/TableRow")
private external val tableRowModule: dynamic

external interface TableRowProps : StandardProps {
    var hover: Boolean?
    var selected: Boolean?
}

@Suppress("UnsafeCastFromDynamic")
private val tableRowComponent: RClass<TableRowProps> = tableRowModule.default

fun RBuilder.tableRow(vararg classMap: Pair<TableRowStyle, String>, block: TableRowElementBuilder<TR>.() -> Unit)
    = child(TableRowElementBuilder(tableRowComponent, classMap.toList()) { TR(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.tableRow(vararg classMap: Pair<TableRowStyle, String>, factory: (TagConsumer<Unit>) -> T, block: TableRowElementBuilder<T>.() -> Unit)
    = child(TableRowElementBuilder(tableRowComponent, classMap.toList(), factory).apply(block).create())
