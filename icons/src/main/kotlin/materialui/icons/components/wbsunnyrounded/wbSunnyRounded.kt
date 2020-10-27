package materialui.icons.components.wbsunnyrounded

import kotlinx.html.SVG
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.svgicon.enums.SvgIconStyle
import materialui.icons.WbSunnyRounded
import materialui.icons.components.svgicon.SvgIconElementBuilder
import react.RBuilder

fun RBuilder.wbSunnyRounded(vararg classMap: Pair<SvgIconStyle, String>, block: SvgIconElementBuilder<SVG>.() -> Unit) =
    child(SvgIconElementBuilder(WbSunnyRounded, classMap.toList()) { SVG(mapOf(), it) }.apply(block).create())

fun <T : Tag> RBuilder.wbSunnyRounded(
    vararg classMap: Pair<SvgIconStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: SvgIconElementBuilder<T>.() -> Unit
) = child(SvgIconElementBuilder(WbSunnyRounded, classMap.toList(), factory).apply(block).create())
