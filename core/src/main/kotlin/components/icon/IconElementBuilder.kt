package components.icon

import components.MaterialElementBuilder
import components.consumers
import components.icon.enums.IconColor
import components.icon.enums.IconFontSize
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.*
import kotlin.reflect.KClass

class IconElementBuilder<T: Tag> internal constructor(
    var iconName: String,
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    override fun create(): ReactElement = createElement(type, props, childList.apply { add(iconName) })

    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.color: IconColor
        get() = IconColor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["color"])
        set(value) { setProp("color", value.toString()) }
    var Tag.fontSize: IconFontSize
        get() = IconFontSize.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["fontSize"])
        set(value) { setProp("iconFontSize", value.toString()) }
}