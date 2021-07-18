package materialui.lab.components.timeline

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import kotlinx.html.UL
import materialui.components.StandardProps
import materialui.lab.components.timeline.enums.TimelineStyle
import react.ComponentType
import react.RBuilder

@JsModule("@material-ui/lab/Timeline")
@JsNonModule
private external val timelineModule: dynamic

external interface TimelineProps : StandardProps {
    var align: String?
}

@Suppress("UnsafeCastFromDynamic")
private val timelineComponent: ComponentType<TimelineProps> = timelineModule.default

fun RBuilder.timeline(vararg classMap: Pair<TimelineStyle, String>, block: TimelineElementBuilder<UL>.() -> Unit)
        = child(TimelineElementBuilder(timelineComponent, classMap.toList()) { UL(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.timeline(vararg classMap: Pair<TimelineStyle, String>, factory: (TagConsumer<Unit>) -> T, block: TimelineElementBuilder<T>.() -> Unit)
        = child(TimelineElementBuilder(timelineComponent, classMap.toList(), factory).apply(block).create())
