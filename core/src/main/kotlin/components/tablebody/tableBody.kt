package components.tablebody

import kotlinx.html.TBODY
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/TableBody")
private external val tableBodyModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val tableBodyComponent: RComponent<RProps, RState> = tableBodyModule.default

fun RBuilder.tableBody(block: TableBodyElementBuilder<TBODY>.() -> Unit)
    = child(TableBodyElementBuilder(tableBodyComponent, TBODY::class) { TBODY(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.tableBody(tag: KClass<T>, block: TableBodyElementBuilder<T>.() -> Unit)
    = child(TableBodyElementBuilder(tableBodyComponent, tag).apply(block).create())
