package materialui.lab.components.timelineoppositecontent

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.lab.components.alert.enums.AlertColor
import materialui.lab.components.alert.enums.AlertSeverity
import materialui.lab.components.alert.enums.AlertStyle
import materialui.lab.components.alert.enums.AlertVariant
import materialui.components.getValue
import materialui.components.paper.PaperElementBuilder
import materialui.components.setValue
import materialui.lab.components.timeline.enums.TimelineAlign
import materialui.lab.components.timelineoppositecontent.enums.TimelineOppositeContentStyle
import org.w3c.dom.events.Event
import react.RBuilder
import react.RClass
import react.ReactElement
import react.buildElement

class TimelineOppositeContentElementBuilder<T: Tag> internal constructor(
    type: RClass<TimelineOppositeContentProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, TimelineOppositeContentProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<TimelineOppositeContentStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

}
