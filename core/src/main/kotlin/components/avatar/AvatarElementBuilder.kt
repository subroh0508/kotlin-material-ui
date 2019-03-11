package components.avatar

import components.MaterialElementBuilder
import components.avatar.enum.AvatarStyle
import components.consumers
import kotlinx.html.IMG
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import kotlinx.html.stream.createHTML
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class AvatarElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    fun Tag.classes(vararg classMap: Pair<AvatarStyle, String>) = setClasses(*classMap)
    fun Tag.imgProps(block: IMG.() -> Unit) = setProp("imgProps", IMG(mapOf(), createHTML()).apply(block))

    var Tag.alt: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["alt"]
        set(value) { setProp("alt", value) }
    var Tag.childrenClassName: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["childrenClassName"]
        set(value) { setProp("childrenClassName", value) }
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