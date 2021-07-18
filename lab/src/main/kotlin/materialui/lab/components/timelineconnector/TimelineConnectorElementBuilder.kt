package materialui.lab.components.timelineconnector

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.lab.components.timelineconnector.enums.TimelineConnectorStyle
import react.*

class TimelineConnectorElementBuilder<T: Tag> internal constructor(
    type: ComponentType<TimelineConnectorProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, TimelineConnectorProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<TimelineConnectorStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

}
