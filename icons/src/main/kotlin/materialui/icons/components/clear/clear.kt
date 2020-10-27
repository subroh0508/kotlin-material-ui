package materialui.icons.components.clear

import kotlinx.html.SVG
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.svgicon.enums.SvgIconStyle
import materialui.icons.Clear
import materialui.icons.components.svgicon.SvgIconElementBuilder
import react.RBuilder

fun RBuilder.clear(vararg classMap: Pair<SvgIconStyle, String>, block: SvgIconElementBuilder<SVG>.() -> Unit) =
    child(SvgIconElementBuilder(Clear, classMap.toList()) { SVG(mapOf(), it) }.apply(block).create())

fun <T : Tag> RBuilder.clear(
    vararg classMap: Pair<SvgIconStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: SvgIconElementBuilder<T>.() -> Unit
) = child(SvgIconElementBuilder(Clear, classMap.toList(), factory).apply(block).create())
