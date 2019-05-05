package materialui.components.tablefooter

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MMaterialElementBuilder
import react.RClass

class TableFooterElementBuilder<T: Tag> internal constructor(
    type: RClass<TableFooterProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MMaterialElementBuilder<T, TableFooterProps>(type, classMap, factory)