package materialui.components.tablehead

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import react.ComponentType

class TableHeadElementBuilder<T: Tag> internal constructor(
    type: ComponentType<TableHeadProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, TableHeadProps>(type, classMap, factory)
