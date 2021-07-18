package materialui.lab.components.timelinecontent

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.lab.components.timelinecontent.enums.TimelineContentStyle
import react.ComponentType
import react.RBuilder

@JsModule("@material-ui/lab/TimelineContent")
@JsNonModule
private external val timelineContentModule: dynamic

external interface TimelineContentProps: StandardProps

@Suppress("UnsafeCastFromDynamic")
private val timelineContentComponent: ComponentType<TimelineContentProps> = timelineContentModule.default

fun RBuilder.timelineContent(vararg classMap: Pair<TimelineContentStyle, String>, block: TimelineContentElementBuilder<DIV>.() -> Unit)
        = child(TimelineContentElementBuilder(timelineContentComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.timelineContent(vararg classMap: Pair<TimelineContentStyle, String>, factory: (TagConsumer<Unit>) -> T, block: TimelineContentElementBuilder<T>.() -> Unit)
        = child(TimelineContentElementBuilder(timelineContentComponent, classMap.toList(), factory).apply(block).create())
