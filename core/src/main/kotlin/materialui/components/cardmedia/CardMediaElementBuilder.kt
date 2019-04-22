package materialui.components.cardmedia

import materialui.components.MaterialElementBuilder
import materialui.components.consumers
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class CardMediaElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.image: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["image"]
        set(value) { setProp("image", value) }
    var Tag.src: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["src"]
        set(value) { setProp("src", value) }
    var Tag.style: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["style"]
        set(value) { setProp("style", value) }
}