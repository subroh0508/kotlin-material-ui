package materialui.lab.components.timelineoppositecontent

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.lab.components.timelineoppositecontent.enums.TimelineOppositeContentStyle
import react.ComponentType
import react.RBuilder

@JsModule("@material-ui/lab/TimelineOppositeContent")
@JsNonModule
private external val timelineOppositeContentModule: dynamic

external interface TimelineOppositeContentProps : StandardProps

@Suppress("UnsafeCastFromDynamic")
private val timelineOppositeContentComponent: ComponentType<TimelineOppositeContentProps> = timelineOppositeContentModule.default

fun RBuilder.timelineOppositeContent(vararg classMap: Pair<TimelineOppositeContentStyle, String>, block: TimelineOppositeContentElementBuilder<DIV>.() -> Unit)
        = child(TimelineOppositeContentElementBuilder(timelineOppositeContentComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.timelineOppositeContent(vararg classMap: Pair<TimelineOppositeContentStyle, String>, factory: (TagConsumer<Unit>) -> T, block: TimelineOppositeContentElementBuilder<T>.() -> Unit)
        = child(TimelineOppositeContentElementBuilder(timelineOppositeContentComponent, classMap.toList(), factory).apply(block).create())
