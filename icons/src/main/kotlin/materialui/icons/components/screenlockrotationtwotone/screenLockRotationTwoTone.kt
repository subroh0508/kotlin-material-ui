package materialui.icons.components.screenlockrotationtwotone

import kotlinx.html.SVG
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.svgicon.enums.SvgIconStyle
import materialui.icons.ScreenLockRotationTwoTone
import materialui.icons.components.svgicon.SvgIconElementBuilder
import react.RBuilder

fun RBuilder.screenLockRotationTwoTone(
    vararg classMap: Pair<SvgIconStyle, String>,
    block: SvgIconElementBuilder<SVG>.() -> Unit
) = child(
    SvgIconElementBuilder(ScreenLockRotationTwoTone, classMap.toList()) { SVG(mapOf(), it) }.apply(block)
        .create()
)

fun <T : Tag> RBuilder.screenLockRotationTwoTone(
    vararg classMap: Pair<SvgIconStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: SvgIconElementBuilder<T>.() -> Unit
) = child(SvgIconElementBuilder(ScreenLockRotationTwoTone, classMap.toList(), factory).apply(block).create())
