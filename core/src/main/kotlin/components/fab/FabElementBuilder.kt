package components.fab

import components.button.enums.ButtonColor
import components.button.enums.ButtonSize
import components.buttonbase.ButtonBaseElementBuilder
import components.consumers
import components.fab.enums.FabVariant
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class FabElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : ButtonBaseElementBuilder<T>(type, tag, factory){

    var Tag.color: ButtonColor
        get() = ButtonColor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["color"])
        set(value) { setProp("color", value.toString()) }
    var Tag.href: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["href"]
        set(value) { setProp("href", value) }
    var Tag.size: ButtonSize
        get() = ButtonSize.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["size"])
        set(value) { setProp("size", value.toString()) }
    var Tag.variant: FabVariant
        get() = FabVariant.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["variant"])
        set(value) { setProp("variant", value.toString()) }
}