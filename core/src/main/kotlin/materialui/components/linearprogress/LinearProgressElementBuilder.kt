package materialui.components.linearprogress

import kotlinx.html.DIV
import kotlinx.html.Tag
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.linearprogress.enums.LinearProgressColor
import materialui.components.linearprogress.enums.LinearProgressStyle
import materialui.components.linearprogress.enums.LinearProgressVariant
import materialui.components.setValue
import react.RClass

class LinearProgressElementBuilder internal constructor(
    type: RClass<LinearProgressProps>,
    classMap: List<Pair<Enum<*>, String>>
) : MaterialElementBuilder<DIV, LinearProgressProps>(type, classMap, { DIV(mapOf(), it) }) {
    fun Tag.classes(vararg classMap: Pair<LinearProgressStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.color: LinearProgressColor? by materialProps
    var Tag.value: Number? by materialProps
    var Tag.valueBuffer: Number? by materialProps
    var Tag.variant: LinearProgressVariant? by materialProps
}