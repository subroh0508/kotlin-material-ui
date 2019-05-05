package materialui.components.tablehead

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import react.RClass

class TableHeadElementBuilder<T: Tag> internal constructor(
    type: RClass<TableHeaderProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, TableHeaderProps>(type, classMap, factory)
