package materialui.components.svgicon

import kotlinx.css.Color
import kotlinx.html.SVG
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.svgicon.enums.SvgIconStyle
import materialui.styles.ColorDelegate
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/SvgIcon")
private external val svgIconModule: dynamic

external interface SvgIconProps : StandardProps {
    var color: String?
    var fontSize: String?
    var shapeRendering: String?
    var titleAccess: String?
    var viewBox: String?
}

var SvgIconProps.nativeColor: Color? by ColorDelegate

@Suppress("UnsafeCastFromDynamic")
private val svgIconComponent: RClass<SvgIconProps> = svgIconModule.default

fun RBuilder.svgIcon(vararg classMap: Pair<SvgIconStyle, String>, block: SvgIconElementBuilder<SVG>.() -> Unit)
    = child(SvgIconElementBuilder(svgIconComponent, classMap.toList()) { SVG(mapOf(), it) }.apply(block).create())

fun <T: Tag> RBuilder.svgIcon(vararg classMap: Pair<SvgIconStyle, String>, factory: (TagConsumer<Unit>) -> T, block: SvgIconElementBuilder<T>.() -> Unit)
    = child(SvgIconElementBuilder(svgIconComponent, classMap.toList(), factory).apply(block).create())
