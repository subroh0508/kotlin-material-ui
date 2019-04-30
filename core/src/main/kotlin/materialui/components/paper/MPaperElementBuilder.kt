package materialui.components.paper

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MMaterialElementBuilder
import materialui.components.getValue
import materialui.components.paper.enums.PaperStyle
import materialui.components.setValue
import react.RComponent
import react.RState

open class MPaperElementBuilder<T: Tag> internal constructor(
    type: RComponent<PaperProps, RState>,
    classMap: List<Pair<PaperStyle, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MMaterialElementBuilder<T, PaperProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<PaperStyle, String>) {
        type.props.classes(classMap)
    }
    var Tag.elevation: Number by type.props
    var Tag.square: Boolean by type.props
}