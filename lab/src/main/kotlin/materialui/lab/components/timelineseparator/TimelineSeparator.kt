package materialui.lab.components.timelineseparator

import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.lab.components.timelineseparator.enums.TimelineSeparatorStyle
import react.RBuilder
import react.RClass


@JsModule("@material-ui/lab/TimelineSeparator")
@JsNonModule
private external val timelineSeparatorModule: dynamic

external interface TimelineSeparatorProps : StandardProps

@Suppress("UnsafeCastFromDynamic")
private val timelineSeparatorComponent: RClass<TimelineSeparatorProps> = timelineSeparatorModule.default

fun RBuilder.timelineSeparator(vararg classMap: Pair<TimelineSeparatorStyle, String>, block: TimelineSeparatorElementBuilder<DIV>.() -> Unit)
        = child(TimelineSeparatorElementBuilder(timelineSeparatorComponent, classMap.toList()) { DIV(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.timelineSeparator(vararg classMap: Pair<TimelineSeparatorStyle, String>, factory: (TagConsumer<Unit>) -> T, block: TimelineSeparatorElementBuilder<T>.() -> Unit)
        = child(TimelineSeparatorElementBuilder(timelineSeparatorComponent, classMap.toList(), factory).apply(block).create())
