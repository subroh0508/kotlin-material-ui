package components.badge

import components.MaterialElementBuilder
import components.badge.enums.BadgeColor
import components.badge.enums.BadgeVariant
import components.consumers
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement
import kotlin.reflect.KClass

class BadgeElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    var Tag.badgeContent: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["badgeContent"]
        set(value) { setProp("badgeContent", value) }
    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.color: BadgeColor
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["color"]
        set(value) { setProp("color", value) }
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
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["variant"]
        set(value) { setProp("variant", value) }
}