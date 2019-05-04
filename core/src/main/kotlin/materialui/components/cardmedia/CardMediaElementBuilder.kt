package materialui.components.cardmedia

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MMaterialElementBuilder
import materialui.components.cardmedia.enums.CardMediaStyle
import materialui.components.getValue
import materialui.components.setValue
import react.RClass

class CardMediaElementBuilder<T: Tag> internal constructor(
    type: RClass<CardMediaProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MMaterialElementBuilder<T, CardMediaProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<CardMediaStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.image: String? by materialProps
    var Tag.src: String? by materialProps
    var Tag.style: Any? by materialProps
}