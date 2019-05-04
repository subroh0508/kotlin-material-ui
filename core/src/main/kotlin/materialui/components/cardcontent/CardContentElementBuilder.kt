package materialui.components.cardcontent

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.MMaterialElementBuilder
import react.RClass

class CardContentElementBuilder<T: Tag> internal constructor(
    type: RClass<CardContentProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MMaterialElementBuilder<T, CardContentProps>(type, classMap, factory)