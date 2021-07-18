package materialui.lab.components.timelinedot

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
import materialui.lab.components.timelinedot.enums.TimelineDotColor
import materialui.lab.components.timelinedot.enums.TimelineDotStyle
import materialui.lab.components.timelinedot.enums.TimelineDotVariant
import org.w3c.dom.events.Event
import react.RBuilder
import react.RClass
import react.ReactElement
import react.buildElement

class TimelineDotElementBuilder<T: Tag> internal constructor(
    type: RClass<TimelineDotProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, TimelineDotProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<TimelineDotStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

    var Tag.color: TimelineDotColor by materialProps
    var Tag.variant: TimelineDotVariant by materialProps
}
