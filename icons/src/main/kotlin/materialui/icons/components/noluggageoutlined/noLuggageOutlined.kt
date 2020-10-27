package materialui.icons.components.noluggageoutlined

import kotlinx.html.SVG
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.svgicon.enums.SvgIconStyle
import materialui.icons.NoLuggageOutlined
import materialui.icons.components.svgicon.SvgIconElementBuilder
import react.RBuilder

fun RBuilder.noLuggageOutlined(
    vararg classMap: Pair<SvgIconStyle, String>,
    block: SvgIconElementBuilder<SVG>.() -> Unit
) = child(SvgIconElementBuilder(NoLuggageOutlined, classMap.toList()) { SVG(mapOf(), it) }.apply(block).create())

fun <T : Tag> RBuilder.noLuggageOutlined(
    vararg classMap: Pair<SvgIconStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: SvgIconElementBuilder<T>.() -> Unit
) = child(SvgIconElementBuilder(NoLuggageOutlined, classMap.toList(), factory).apply(block).create())
