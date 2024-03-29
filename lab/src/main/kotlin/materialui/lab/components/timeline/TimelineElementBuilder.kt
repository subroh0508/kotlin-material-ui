package materialui.lab.components.timeline

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.lab.components.timeline.enums.TimelineAlign
import materialui.lab.components.timeline.enums.TimelineStyle
import react.*

class TimelineElementBuilder<T: Tag> internal constructor(
    type: ComponentType<TimelineProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, TimelineProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<TimelineStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

    var Tag.align: TimelineAlign by materialProps
}
