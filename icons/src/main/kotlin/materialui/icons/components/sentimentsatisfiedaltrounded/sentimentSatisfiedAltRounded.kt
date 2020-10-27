package materialui.icons.components.sentimentsatisfiedaltrounded

import kotlinx.html.SVG
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.svgicon.enums.SvgIconStyle
import materialui.icons.SentimentSatisfiedAltRounded
import materialui.icons.components.svgicon.SvgIconElementBuilder
import react.RBuilder

fun RBuilder.sentimentSatisfiedAltRounded(
    vararg classMap: Pair<SvgIconStyle, String>,
    block: SvgIconElementBuilder<SVG>.() -> Unit
) = child(
    SvgIconElementBuilder(SentimentSatisfiedAltRounded, classMap.toList()) { SVG(mapOf(), it) }.apply(block)
        .create()
)

fun <T : Tag> RBuilder.sentimentSatisfiedAltRounded(
    vararg classMap: Pair<SvgIconStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: SvgIconElementBuilder<T>.() -> Unit
) = child(SvgIconElementBuilder(SentimentSatisfiedAltRounded, classMap.toList(), factory).apply(block).create())
