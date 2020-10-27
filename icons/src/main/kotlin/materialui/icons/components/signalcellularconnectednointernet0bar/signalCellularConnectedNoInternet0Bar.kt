package materialui.icons.components.signalcellularconnectednointernet0bar

import kotlinx.html.SVG
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.svgicon.enums.SvgIconStyle
import materialui.icons.SignalCellularConnectedNoInternet0Bar
import materialui.icons.components.svgicon.SvgIconElementBuilder
import react.RBuilder

fun RBuilder.signalCellularConnectedNoInternet0Bar(
    vararg classMap: Pair<SvgIconStyle, String>,
    block: SvgIconElementBuilder<SVG>.() -> Unit
) = child(
    SvgIconElementBuilder(SignalCellularConnectedNoInternet0Bar, classMap.toList()) { SVG(mapOf(), it) }.apply(
        block
    ).create()
)

fun <T : Tag> RBuilder.signalCellularConnectedNoInternet0Bar(
    vararg classMap: Pair<SvgIconStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: SvgIconElementBuilder<T>.() -> Unit
) = child(
    SvgIconElementBuilder(SignalCellularConnectedNoInternet0Bar, classMap.toList(), factory).apply(block).create()
)
