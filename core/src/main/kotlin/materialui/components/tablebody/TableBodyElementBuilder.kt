package materialui.components.tablebody

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import react.ComponentType

class TableBodyElementBuilder<T: Tag> internal constructor(
    type: ComponentType<TableBodyProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, TableBodyProps>(type, classMap, factory)