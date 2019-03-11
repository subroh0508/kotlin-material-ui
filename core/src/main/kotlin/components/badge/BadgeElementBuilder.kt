package components.badge

import components.MaterialElementBuilder
import components.badge.enums.BadgeColor
import components.badge.enums.BadgeStyle
import components.badge.enums.BadgeVariant
import components.consumers
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.*
import kotlin.reflect.KClass

class BadgeElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    fun Tag.classes(vararg classMap: Pair<BadgeStyle, String>) = setClasses(*classMap)
    fun Tag.badgeContent(handler: RBuilder.() -> Unit) = setProp("badgeContent", buildElement(handler))

    var Tag.color: BadgeColor
        get() = BadgeColor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["color"])
        set(value) { setProp("color", value.toString()) }
    var Tag.invisible: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["invisible"]
        set(value) { setProp("invisible", value) }
    var Tag.max: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["max"]
        set(value) { setProp("max", value) }
    var Tag.showZero: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["showZero"]
        set(value) { setProp("showZero", value) }
    var Tag.variant: BadgeVariant
        get() = BadgeVariant.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["variant"])
        set(value) { setProp("variant", value.toString()) }
}