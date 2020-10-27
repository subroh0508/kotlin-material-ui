package materialui.icons.components.batterycharging20outlined

import kotlinx.html.SVG
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.svgicon.enums.SvgIconStyle
import materialui.icons.BatteryCharging20Outlined
import materialui.icons.components.svgicon.SvgIconElementBuilder
import react.RBuilder

fun RBuilder.batteryCharging20Outlined(
    vararg classMap: Pair<SvgIconStyle, String>,
    block: SvgIconElementBuilder<SVG>.() -> Unit
) = child(
    SvgIconElementBuilder(BatteryCharging20Outlined, classMap.toList()) { SVG(mapOf(), it) }.apply(block)
        .create()
)

fun <T : Tag> RBuilder.batteryCharging20Outlined(
    vararg classMap: Pair<SvgIconStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: SvgIconElementBuilder<T>.() -> Unit
) = child(SvgIconElementBuilder(BatteryCharging20Outlined, classMap.toList(), factory).apply(block).create())
