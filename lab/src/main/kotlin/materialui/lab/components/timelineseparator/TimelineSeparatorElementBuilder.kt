package materialui.lab.components.timelineseparator

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.lab.components.timelineseparator.enums.TimelineSeparatorStyle
import react.ComponentType

class TimelineSeparatorElementBuilder<T: Tag> internal constructor(
    type: ComponentType<TimelineSeparatorProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, TimelineSeparatorProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<TimelineSeparatorStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }
}
