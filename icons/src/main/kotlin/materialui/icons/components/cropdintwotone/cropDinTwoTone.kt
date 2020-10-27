package materialui.icons.components.cropdintwotone

import kotlinx.html.SVG
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.svgicon.enums.SvgIconStyle
import materialui.icons.CropDinTwoTone
import materialui.icons.components.svgicon.SvgIconElementBuilder
import react.RBuilder

fun RBuilder.cropDinTwoTone(vararg classMap: Pair<SvgIconStyle, String>, block: SvgIconElementBuilder<SVG>.() -> Unit) =
    child(SvgIconElementBuilder(CropDinTwoTone, classMap.toList()) { SVG(mapOf(), it) }.apply(block).create())

fun <T : Tag> RBuilder.cropDinTwoTone(
    vararg classMap: Pair<SvgIconStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: SvgIconElementBuilder<T>.() -> Unit
) = child(SvgIconElementBuilder(CropDinTwoTone, classMap.toList(), factory).apply(block).create())
