package components.button

import components.MaterialElementStyles
import components.button.enums.ButtonColor
import components.button.enums.ButtonSize
import components.button.enums.ButtonStyle
import components.button.enums.ButtonVariant
import components.buttonbase.ButtonBaseElementBuilder
import components.consumers
import kotlinx.css.CSSBuilder
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class ButtonElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : ButtonBaseElementBuilder<T>(type, tag, factory) {

    var Tag.color: ButtonColor
        get() = ButtonColor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["color"])
        set(value) { setProp("color", value.toString()) }
    var Tag.fullWidth: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["fullWidth"]
        set(value) { setProp("fullWidth", value) }
    var Tag.href: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["href"]
        set(value) { setProp("href", value) }
    var Tag.mini: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["mini"]
        set(value) { setProp("mini", value) }
    var Tag.size: ButtonSize
        get() = ButtonSize.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["size"])
        set(value) { setProp("size", value.toString()) }
    var Tag.variant: ButtonVariant
        get() = ButtonVariant.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["variant"])
        set(value) { setProp("variant", value.toString()) }

    fun MaterialElementStyles.styles(attrName: ButtonStyle, handler: CSSBuilder.() -> Unit) {
        this[attrName.toString()] = CSSBuilder().apply(handler).toDynamic
    }
}