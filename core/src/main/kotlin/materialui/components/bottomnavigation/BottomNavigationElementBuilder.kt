package materialui.components.bottomnavigation

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import react.RClass

class BottomNavigationElementBuilder<T: Tag> internal constructor(
    type: RClass<BottomNavigationProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, BottomNavigationProps>(type, classMap, factory) {
    var Tag.showLabels: Boolean? by materialProps
    var Tag.value: Any? by materialProps
}