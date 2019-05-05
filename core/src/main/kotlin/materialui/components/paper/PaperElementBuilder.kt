package materialui.components.paper

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MaterialElementBuilder
import materialui.components.getValue
import materialui.components.paper.enums.PaperStyle
import materialui.components.setValue
import react.RClass

open class PaperElementBuilder<T: Tag, Props: PaperProps> internal constructor(
    type: RClass<Props>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, Props>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<PaperStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

    var Tag.elevation: Number? by materialProps
    var Tag.square: Boolean? by materialProps
}