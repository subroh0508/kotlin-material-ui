package materialui.icons.components.directionssubwaytwotone

import kotlinx.html.SVG
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.svgicon.enums.SvgIconStyle
import materialui.icons.DirectionsSubwayTwoTone
import materialui.icons.components.svgicon.SvgIconElementBuilder
import react.RBuilder

fun RBuilder.directionsSubwayTwoTone(
    vararg classMap: Pair<SvgIconStyle, String>,
    block: SvgIconElementBuilder<SVG>.() -> Unit
) = child(SvgIconElementBuilder(DirectionsSubwayTwoTone, classMap.toList()) { SVG(mapOf(), it) }.apply(block).create())

fun <T : Tag> RBuilder.directionsSubwayTwoTone(
    vararg classMap: Pair<SvgIconStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: SvgIconElementBuilder<T>.() -> Unit
) = child(SvgIconElementBuilder(DirectionsSubwayTwoTone, classMap.toList(), factory).apply(block).create())
