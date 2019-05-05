package materialui.components.tablebody

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MMaterialElementBuilder
import react.RClass

class TableBodyElementBuilder<T: Tag> internal constructor(
    type: RClass<TableBodyProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MMaterialElementBuilder<T, TableBodyProps>(type, classMap, factory)