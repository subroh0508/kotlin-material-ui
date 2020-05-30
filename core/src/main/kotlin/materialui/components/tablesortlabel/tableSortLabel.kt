package materialui.components.tablesortlabel

import kotlinx.html.SPAN
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.TableSortLabel
import materialui.components.buttonbase.ButtonBaseProps
import materialui.components.buttonbase.enums.ButtonBaseStyle
import react.RBuilder

external interface TableSortLabelProps : ButtonBaseProps {
    var active: Boolean?
    var direction: String?
    var hideSortIcon: Boolean?
    var IconComponent: dynamic
}

fun RBuilder.tableSortLabel(vararg classMap: Pair<ButtonBaseStyle, String>, block: TableSortLabelElementBuilder<SPAN>.() -> Unit)
    = child(TableSortLabelElementBuilder(TableSortLabel, classMap.toList()) { SPAN(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.tableSortLabel(vararg classMap: Pair<ButtonBaseStyle, String>, factory: (TagConsumer<Unit>) -> T, block: TableSortLabelElementBuilder<T>.() -> Unit )
    = child(TableSortLabelElementBuilder(TableSortLabel, classMap.toList(), factory).apply(block).create())
