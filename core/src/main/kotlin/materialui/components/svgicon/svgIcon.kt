package materialui.components.svgicon

import kotlinx.css.Color
import kotlinx.html.SVG
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.SvgIcon
import materialui.components.StandardProps
import materialui.components.svgicon.enums.SvgIconStyle
import materialui.styles.ColorDelegate
import react.RBuilder

external interface SvgIconProps : StandardProps {
    var color: String?
    var fontSize: String?
    var shapeRendering: String?
    var titleAccess: String?
    var viewBox: String?
}

var SvgIconProps.htmlColor: Color? by ColorDelegate

fun RBuilder.svgIcon(vararg classMap: Pair<SvgIconStyle, String>, block: SvgIconElementBuilder<SVG>.() -> Unit)
    = child(SvgIconElementBuilder(SvgIcon, classMap.toList()) { SVG(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.svgIcon(vararg classMap: Pair<SvgIconStyle, String>, factory: (TagConsumer<Unit>) -> T, block: SvgIconElementBuilder<T>.() -> Unit)
    = child(SvgIconElementBuilder(SvgIcon, classMap.toList(), factory).apply(block).create())
