package materialui.lab.components.timelineconnector

import kotlinx.html.SPAN
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.lab.components.timelineconnector.enums.TimelineConnectorStyle
import react.ComponentType
import react.RBuilder

@JsModule("@material-ui/lab/TimelineConnector")
@JsNonModule
private external val timelineConnectorModule: dynamic

external interface TimelineConnectorProps: StandardProps

@Suppress("UnsafeCastFromDynamic")
private val timelineConnectorComponent: ComponentType<TimelineConnectorProps> = timelineConnectorModule.default

fun RBuilder.timelineConnector(vararg classMap: Pair<TimelineConnectorStyle, String>, block: TimelineConnectorElementBuilder<SPAN>.() -> Unit)
        = child(TimelineConnectorElementBuilder(timelineConnectorComponent, classMap.toList()) { SPAN(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.timelineConnector(vararg classMap: Pair<TimelineConnectorStyle, String>, factory: (TagConsumer<Unit>) -> T, block: TimelineConnectorElementBuilder<T>.() -> Unit)
        = child(TimelineConnectorElementBuilder(timelineConnectorComponent, classMap.toList(), factory).apply(block).create())
