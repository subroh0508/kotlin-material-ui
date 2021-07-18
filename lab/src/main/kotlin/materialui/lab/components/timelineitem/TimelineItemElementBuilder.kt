package materialui.lab.components.timelineitem

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.lab.components.timelineitem.enums.TimelineItemStyle
import react.*

class TimelineItemElementBuilder<T: Tag> internal constructor(
    type: ComponentType<TimelineItemProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, TimelineItemProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<TimelineItemStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

}
