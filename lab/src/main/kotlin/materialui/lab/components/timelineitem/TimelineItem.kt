package materialui.lab.components.timelineitem

import kotlinx.html.LI
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.lab.components.timelineitem.enums.TimelineItemStyle
import react.ComponentType
import react.RBuilder

@JsModule("@material-ui/lab/TimelineItem")
@JsNonModule
private external val timelineItemModule: dynamic

external interface TimelineItemProps : StandardProps

@Suppress("UnsafeCastFromDynamic")
private val timelineItemComponent: ComponentType<TimelineItemProps> = timelineItemModule.default

fun RBuilder.timelineItem(vararg classMap: Pair<TimelineItemStyle, String>, block: TimelineItemElementBuilder<LI>.() -> Unit)
        = child(TimelineItemElementBuilder(timelineItemComponent, classMap.toList()) { LI(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.timelineItem(vararg classMap: Pair<TimelineItemStyle, String>, factory: (TagConsumer<Unit>) -> T, block: TimelineItemElementBuilder<T>.() -> Unit)
        = child(TimelineItemElementBuilder(timelineItemComponent, classMap.toList(), factory).apply(block).create())
