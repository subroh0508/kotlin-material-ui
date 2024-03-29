package materialui.components.card

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.getValue
import materialui.components.paper.PaperElementBuilder
import materialui.components.setValue
import react.ComponentType

class CardElementBuilder<T: Tag> internal constructor(
    type: ComponentType<CardProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : PaperElementBuilder<T, CardProps>(type, classMap, factory) {
    var Tag.raised: Boolean? by materialProps
}