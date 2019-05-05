package materialui.components.avatar

import kotlinext.js.js
import kotlinx.html.IMG
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import kotlinx.html.stream.createHTML
import materialui.components.MaterialElementBuilder
import materialui.components.avatar.enum.AvatarStyle
import materialui.components.getValue
import materialui.components.setValue
import react.RClass
import react.RProps

class AvatarElementBuilder<T: Tag> internal constructor(
    type: RClass<AvatarProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T, AvatarProps>(type, classMap, factory) {
    fun Tag.classes(vararg classMap: Pair<AvatarStyle, String>) {
        classes(classMap.map { it.first to it.second })
    }

    var Tag.imgProps: RProps? by materialProps
    var Tag.alt: String? by materialProps
    var Tag.childrenClassName: String? by materialProps
    var Tag.sizes: String? by materialProps
    var Tag.src: String? by materialProps
    var Tag.srcSet: String? by materialProps

    fun Tag.imgProps(block: IMG.() -> Unit) {
        val props = js {  }

        IMG(mapOf(), createHTML()).apply(block).attributesEntries.forEach { (key, value) ->
            props[key] = value
        }

        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        imgProps = props as RProps
    }
}