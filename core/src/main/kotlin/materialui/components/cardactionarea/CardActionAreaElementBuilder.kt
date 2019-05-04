package materialui.components.cardactionarea

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.buttonbase.ButtonBaseElementBuilder
import react.RClass

class CardActionAreaElementBuilder<T: Tag> internal constructor(
    type: RClass<CardActionAreaProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : ButtonBaseElementBuilder<T, CardActionAreaProps>(type, classMap, factory)