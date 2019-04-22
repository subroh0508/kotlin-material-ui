package materialui.components.tablefooter

import kotlinx.html.TFOOT
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/TableFooter")
private external val tableFooterModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val tableFooterComponent: RComponent<RProps, RState> = tableFooterModule.default

fun RBuilder.tableFooter(block: TableFooterElementBuilder<TFOOT>.() -> Unit)
    = child(TableFooterElementBuilder(tableFooterComponent, TFOOT::class) { TFOOT(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.tableFooter(tag: KClass<T>, block: TableFooterElementBuilder<T>.() -> Unit)
    = child(TableFooterElementBuilder(tableFooterComponent, tag).apply(block).create())