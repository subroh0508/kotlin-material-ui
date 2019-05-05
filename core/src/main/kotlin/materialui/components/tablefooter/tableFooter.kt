package materialui.components.tablefooter

import kotlinx.html.TFOOT
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.*
import kotlin.reflect.KClass

@JsModule("@material-ui/core/TableFooter")
private external val tableFooterModule: dynamic

external interface TableFooterProps : StandardProps

@Suppress("UnsafeCastFromDynamic")
private val tableFooterComponent: RClass<TableFooterProps> = tableFooterModule.default

fun RBuilder.tableFooter(rootStyle: String? = null, block: TableFooterElementBuilder<TFOOT>.() -> Unit)
    = child(TableFooterElementBuilder(tableFooterComponent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })) { TFOOT(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.tableFooter(rootStyle: String? = null, factory: (TagConsumer<Unit>) -> T, block: TableFooterElementBuilder<T>.() -> Unit)
    = child(TableFooterElementBuilder(tableFooterComponent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it }), factory).apply(block).create())