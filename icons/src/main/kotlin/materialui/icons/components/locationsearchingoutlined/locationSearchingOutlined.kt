package materialui.icons.components.locationsearchingoutlined

import kotlinx.html.SVG
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.svgicon.enums.SvgIconStyle
import materialui.icons.LocationSearchingOutlined
import materialui.icons.components.svgicon.SvgIconElementBuilder
import react.RBuilder

fun RBuilder.locationSearchingOutlined(
    vararg classMap: Pair<SvgIconStyle, String>,
    block: SvgIconElementBuilder<SVG>.() -> Unit
) = child(
    SvgIconElementBuilder(LocationSearchingOutlined, classMap.toList()) { SVG(mapOf(), it) }.apply(block)
        .create()
)

fun <T : Tag> RBuilder.locationSearchingOutlined(
    vararg classMap: Pair<SvgIconStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: SvgIconElementBuilder<T>.() -> Unit
) = child(SvgIconElementBuilder(LocationSearchingOutlined, classMap.toList(), factory).apply(block).create())
