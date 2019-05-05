package materialui.components.tablecell

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.components.tablecell.enums.*
import react.RClass

open class TableCellElementBuilder<T: Tag, Props: TableCellProps> internal constructor(
    type: RClass<Props>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, Props>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<TableCellStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.align: TableCellAlign? by materialProps
    @Deprecated("Instead, use the `align` property.")
    var Tag.numeric: Boolean? by materialProps
    var Tag.padding: TableCellPadding? by materialProps
    var Tag.scope: String? by materialProps
    var Tag.sortDirection: TableCellSortDirection? by materialProps
    var Tag.variant: TableCellVariant? by materialProps
}