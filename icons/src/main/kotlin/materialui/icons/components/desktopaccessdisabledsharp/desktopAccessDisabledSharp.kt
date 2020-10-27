package materialui.icons.components.desktopaccessdisabledsharp

import kotlinx.html.SVG
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.svgicon.enums.SvgIconStyle
import materialui.icons.DesktopAccessDisabledSharp
import materialui.icons.components.svgicon.SvgIconElementBuilder
import react.RBuilder

fun RBuilder.desktopAccessDisabledSharp(
    vararg classMap: Pair<SvgIconStyle, String>,
    block: SvgIconElementBuilder<SVG>.() -> Unit
) = child(
    SvgIconElementBuilder(DesktopAccessDisabledSharp, classMap.toList()) { SVG(mapOf(), it) }.apply(block)
        .create()
)

fun <T : Tag> RBuilder.desktopAccessDisabledSharp(
    vararg classMap: Pair<SvgIconStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: SvgIconElementBuilder<T>.() -> Unit
) = child(SvgIconElementBuilder(DesktopAccessDisabledSharp, classMap.toList(), factory).apply(block).create())
