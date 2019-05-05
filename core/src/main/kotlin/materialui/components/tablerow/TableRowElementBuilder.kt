package materialui.components.tablerow

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.components.tablerow.enums.TableRowStyle
import react.RClass

class TableRowElementBuilder<T: Tag> internal constructor(
    type: RClass<TableRowProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, TableRowProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<TableRowStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.hover: Boolean? by materialProps
    var Tag.selected: Boolean? by materialProps
}