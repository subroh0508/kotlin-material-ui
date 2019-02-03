package components.tablesortlabel

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

@JsModule("@material-ui/core/TableSortLabel")
private external val tableSortLabelModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val tableSortLabelComponent: RComponent<RProps, RState> = tableSortLabelModule.default

fun RBuilder.tableSortLabel(block: TableSortLabelElementBuilder<BUTTON>.() -> Unit)
    = child(TableSortLabelElementBuilder(tableSortLabelComponent, BUTTON::class) { BUTTON(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.tableSortLabel(tag: KClass<T>, block: TableSortLabelElementBuilder<T>.() -> Unit )
    = child(TableSortLabelElementBuilder(tableSortLabelComponent, tag).apply(block).create())
