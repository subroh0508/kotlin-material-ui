package materialui.components.tablefooter

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import react.ComponentType

class TableFooterElementBuilder<T: Tag> internal constructor(
    type: ComponentType<TableFooterProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, TableFooterProps>(type, classMap, factory)