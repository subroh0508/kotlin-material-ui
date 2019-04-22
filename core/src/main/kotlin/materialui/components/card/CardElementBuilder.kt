package materialui.components.card

import materialui.components.consumers
import materialui.components.paper.PaperElementBuilder
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class CardElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : PaperElementBuilder<T>(type, tag, factory) {

    var Tag.raised: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["raised"]
        set(value) { setProp("raised", value) }
}