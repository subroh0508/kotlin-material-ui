package materialui.components.table

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.components.table.enums.TablePadding
import react.ComponentType

class TableElementBuilder<T: Tag> internal constructor(
    type: ComponentType<TableProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, TableProps>(type, classMap, factory) {

    var Tag.padding: TablePadding? by materialProps
}