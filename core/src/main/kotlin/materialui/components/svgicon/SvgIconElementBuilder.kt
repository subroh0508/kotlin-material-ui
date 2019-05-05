package materialui.components.svgicon

import kotlinx.css.Color
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import materialui.components.svgicon.enums.SvgIconColor
import materialui.components.svgicon.enums.SvgIconFontSize
import materialui.components.svgicon.enums.SvgIconStyle
import react.RClass

class SvgIconElementBuilder<T: Tag> internal constructor(
    type: RClass<SvgIconProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, SvgIconProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<SvgIconStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.color: SvgIconColor? by materialProps
    var Tag.fontSize: SvgIconFontSize? by materialProps
    var Tag.nativeColor: Color?
        get() = materialProps.nativeColor
        set(value) { materialProps.nativeColor = value }
    var Tag.shapeRendering: String? by materialProps
    var Tag.titleAccess: String? by materialProps
    var Tag.viewBox: String? by materialProps
}