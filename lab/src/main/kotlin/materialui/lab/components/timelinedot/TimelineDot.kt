package materialui.lab.components.timelinedot

import kotlinx.html.SPAN
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.lab.components.timelinedot.enums.TimelineDotStyle
import react.RBuilder
import react.RClass


@JsModule("@material-ui/lab/TimelineDot")
@JsNonModule
private external val timelineDotModule: dynamic

external interface TimelineDotProps : StandardProps {
    var variant: String?
    var color: String?
}

@Suppress("UnsafeCastFromDynamic")
private val timelineDotComponent: RClass<TimelineDotProps> = timelineDotModule.default

fun RBuilder.timelineDot(vararg classMap: Pair<TimelineDotStyle, String>, block: TimelineDotElementBuilder<SPAN>.() -> Unit)
        = child(TimelineDotElementBuilder(timelineDotComponent, classMap.toList()) { SPAN(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.timelineDot(vararg classMap: Pair<TimelineDotStyle, String>, factory: (TagConsumer<Unit>) -> T, block: TimelineDotElementBuilder<T>.() -> Unit)
        = child(TimelineDotElementBuilder(timelineDotComponent, classMap.toList(), factory).apply(block).create())
