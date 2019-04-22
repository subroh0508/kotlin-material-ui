package materialui.components.cardactionarea

import materialui.components.buttonbase.ButtonBaseElementBuilder
import materialui.components.consumers
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class CardActionAreaElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : ButtonBaseElementBuilder<T>(type, tag, factory)