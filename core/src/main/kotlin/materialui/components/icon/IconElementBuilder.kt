package materialui.components.icon

import materialui.components.MaterialElementBuilder
import materialui.components.consumers
import materialui.components.icon.enums.IconColor
import materialui.components.icon.enums.IconFontSize
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class IconElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

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