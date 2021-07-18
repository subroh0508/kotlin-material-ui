package materialui.lab.components.timelineoppositecontent

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.lab.components.timelineoppositecontent.enums.TimelineOppositeContentStyle
import react.ComponentType

class TimelineOppositeContentElementBuilder<T: Tag> internal constructor(
    type: ComponentType<TimelineOppositeContentProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, TimelineOppositeContentProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<TimelineOppositeContentStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

}
