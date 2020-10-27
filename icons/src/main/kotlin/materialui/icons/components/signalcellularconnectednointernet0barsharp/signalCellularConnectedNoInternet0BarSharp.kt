package materialui.icons.components.signalcellularconnectednointernet0barsharp

import kotlinx.html.SVG
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.svgicon.enums.SvgIconStyle
import materialui.icons.SignalCellularConnectedNoInternet0BarSharp
import materialui.icons.components.svgicon.SvgIconElementBuilder
import react.RBuilder

fun RBuilder.signalCellularConnectedNoInternet0BarSharp(
    vararg classMap: Pair<SvgIconStyle, String>,
    block: SvgIconElementBuilder<SVG>.() -> Unit
) = child(SvgIconElementBuilder(SignalCellularConnectedNoInternet0BarSharp, classMap.toList()) {
    SVG(
        mapOf(),
        it
    )
}.apply(block).create())

fun <T : Tag> RBuilder.signalCellularConnectedNoInternet0BarSharp(
    vararg classMap: Pair<SvgIconStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: SvgIconElementBuilder<T>.() -> Unit
) = child(
    SvgIconElementBuilder(SignalCellularConnectedNoInternet0BarSharp, classMap.toList(), factory).apply(block).create()
)
