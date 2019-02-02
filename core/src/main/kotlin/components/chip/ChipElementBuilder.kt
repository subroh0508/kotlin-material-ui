package components.chip

import components.MaterialElementBuilder
import components.chip.enums.ChipColor
import components.chip.enums.ChipVariant
import components.consumers
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import org.w3c.dom.events.Event
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement
import kotlin.reflect.KClass

class ChipElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    var Tag.avatar: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["avatar"]
        set(value) { setProp("avatar", value) }
    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.clickable: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["clickable"]
        set(value) { setProp("clickable", value) }
    var Tag.color: ChipColor
        get() = ChipColor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["color"])
        set(value) { setProp("color", value.toString()) }
    var Tag.deleteIcon: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["deleteIcon"]
        set(value) { setProp("deleteIcon", value) }
    var Tag.icon: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["icon"]
        set(value) { setProp("icon", value) }
    var Tag.label: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["label"]
        set(value) { setProp("label", value) }
    var Tag.onDelete: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onDelete"]
        set(value) { setProp("onDelete", value) }
    var Tag.tabIndex: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["tabIndex"]
        set(value) { setProp("tabIndex", value) }
    var Tag.variant: ChipVariant
        get() = ChipVariant.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["variant"])
        set(value) { setProp("variant", value.toString()) }
}