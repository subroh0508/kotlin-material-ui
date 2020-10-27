package materialui.icons.components.imagetwotone

import kotlinx.html.SVG
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.svgicon.enums.SvgIconStyle
import materialui.icons.ImageTwoTone
import materialui.icons.components.svgicon.SvgIconElementBuilder
import react.RBuilder

fun RBuilder.imageTwoTone(vararg classMap: Pair<SvgIconStyle, String>, block: SvgIconElementBuilder<SVG>.() -> Unit) =
    child(SvgIconElementBuilder(ImageTwoTone, classMap.toList()) { SVG(mapOf(), it) }.apply(block).create())

fun <T : Tag> RBuilder.imageTwoTone(
    vararg classMap: Pair<SvgIconStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: SvgIconElementBuilder<T>.() -> Unit
) = child(SvgIconElementBuilder(ImageTwoTone, classMap.toList(), factory).apply(block).create())
