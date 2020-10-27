package materialui.icons.components.mailoutline

import kotlinx.html.SVG
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.svgicon.enums.SvgIconStyle
import materialui.icons.MailOutline
import materialui.icons.components.svgicon.SvgIconElementBuilder
import react.RBuilder

fun RBuilder.mailOutline(vararg classMap: Pair<SvgIconStyle, String>, block: SvgIconElementBuilder<SVG>.() -> Unit) =
    child(SvgIconElementBuilder(MailOutline, classMap.toList()) { SVG(mapOf(), it) }.apply(block).create())

fun <T : Tag> RBuilder.mailOutline(
    vararg classMap: Pair<SvgIconStyle, String>,
    factory: (TagConsumer<Unit>) -> T,
    block: SvgIconElementBuilder<T>.() -> Unit
) = child(SvgIconElementBuilder(MailOutline, classMap.toList(), factory).apply(block).create())
