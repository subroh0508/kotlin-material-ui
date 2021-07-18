package materialui.components.cardactionarea

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.buttonbase.ButtonBaseElementBuilder
import react.ComponentType

class CardActionAreaElementBuilder<T: Tag> internal constructor(
    type: ComponentType<CardActionAreaProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : ButtonBaseElementBuilder<T, CardActionAreaProps>(type, classMap, factory)