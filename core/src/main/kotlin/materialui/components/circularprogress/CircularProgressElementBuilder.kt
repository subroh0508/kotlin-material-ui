package materialui.components.circularprogress

import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.components.MaterialElementBuilder
import materialui.components.circularprogress.enums.CircularProgressColor
import materialui.components.circularprogress.enums.CircularProgressStyle
import materialui.components.circularprogress.enums.CircularProgressVariant
import materialui.components.getValue
import materialui.components.setValue
import react.RClass

class CircularProgressElementBuilder internal constructor(
    type: RClass<CircularProgressProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, CircularProgressProps>(type, classMap.toList(), { DIV(mapOf(), it) }) {
    fun Tag.classes(vararg classMap: Pair<CircularProgressStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.color: CircularProgressColor? by materialProps
    var Tag.disableShrink: Boolean? by materialProps
    val Tag.size: String? by materialProps
    var Tag.style: Any? by materialProps
    var Tag.thickness: Number? by materialProps
    var Tag.value: Number? by materialProps
    var Tag.variant: CircularProgressVariant? by materialProps

    fun Tag.size(size: Number) { materialProps.size = size }
    fun Tag.size(size: String) { materialProps.size = size }
}