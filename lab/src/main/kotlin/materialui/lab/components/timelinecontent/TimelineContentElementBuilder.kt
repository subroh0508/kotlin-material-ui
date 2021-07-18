package materialui.lab.components.timelinecontent

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.lab.components.timelinecontent.enums.TimelineContentStyle
import react.*

class TimelineContentElementBuilder<T: Tag> internal constructor(
    type: ComponentType<TimelineContentProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, TimelineContentProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<TimelineContentStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

}
