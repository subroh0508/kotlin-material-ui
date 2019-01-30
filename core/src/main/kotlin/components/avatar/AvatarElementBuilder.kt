package components.avatar

import components.MaterialElementBuilder
import components.consumers
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class AvatarElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    var Tag.alt: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["alt"]
        set(value) { setProp("alt", value) }
    var Tag.childrenClassName: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["childrenClassName"]
        set(value) { setProp("childrenClassName", value) }
    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.imgProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["imgProps"]
        set(value) { setProp("imgProps", value) }
    var Tag.sizes: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["sizes"]
        set(value) { setProp("sizes", value) }
    var Tag.src: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["src"]
        set(value) { setProp("src", value) }
    var Tag.srcSet: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["srcSet"]
        set(value) { setProp("srcSet", value) }
}