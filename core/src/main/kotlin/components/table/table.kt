package components.table

import kotlinx.html.TABLE
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/Table")
private external val tableModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val tableComponent: RComponent<RProps, RState> = tableModule.default

fun RBuilder.table(block: TableElementBuilder<TABLE>.() -> Unit)
    = child(TableElementBuilder(tableComponent, TABLE::class) { TABLE(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.table(tag: KClass<T>, block: TableElementBuilder<T>.() -> Unit)
    = child(TableElementBuilder(tableComponent, tag).apply(block).create())