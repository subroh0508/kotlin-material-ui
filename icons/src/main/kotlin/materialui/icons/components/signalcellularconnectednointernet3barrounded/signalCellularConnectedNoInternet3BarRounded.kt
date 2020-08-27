package materialui.icons.components.signalcellularconnectednointernet3barrounded

import kotlinx.html.SVG
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.svgicon.enums.SvgIconStyle
import materialui.icons.SignalCellularConnectedNoInternet3BarRounded
import materialui.icons.components.svgicon.SvgIconElementBuilder
import react.RBuilder

fun RBuilder.signalCellularConnectedNoInternet3BarRounded(
    vararg classMap: Pair<SvgIconStyle, String>,
    block: SvgIconElementBuilder<SVG>.() -> Unit
) = child(SvgIconElementBuilder(SignalCellularConnectedNoInternet3BarRounded, classMap.toList()) {
    SVG(
        mapOf(),
        it
    )
}.apply(block).create())

fun <T : Tag> RBuilder.signalCellularConnectedNoInternet3BarRounded(
    vararg classMap: Pair<SvgIconStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: SvgIconElementBuilder<T>.() -> Unit
) = child(
    SvgIconElementBuilder(SignalCellularConnectedNoInternet3BarRounded, classMap.toList(), factory).apply(block)
        .create()
)
