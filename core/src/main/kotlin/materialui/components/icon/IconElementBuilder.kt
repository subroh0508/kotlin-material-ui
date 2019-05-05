package materialui.components.icon

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.icon.enums.IconColor
import materialui.components.icon.enums.IconFontSize
import materialui.components.icon.enums.IconStyle
import materialui.components.setValue
import react.RClass

class IconElementBuilder<T: Tag> internal constructor(
    type: RClass<IconProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, IconProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<IconStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.color: IconColor? by materialProps
    var Tag.fontSize: IconFontSize? by materialProps
}