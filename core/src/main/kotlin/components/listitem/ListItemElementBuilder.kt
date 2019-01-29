package components.listitem

import components.MaterialElementBuilder
import components.consumers
import components.listitem.enums.ListItemAlignItem
import components.listitemsecondaryaction.ListItemSecondaryActionProps
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class ListItemElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<Tag>(type, factory) {

    var Tag.alignItems: ListItemAlignItem
        get() = ListItemAlignItem.value(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["alignItems"])
        set(value) { setProp("alignItems", value.value) }
    var Tag.button: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["button"]
        set(value) { setProp("button", value) }
    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.containerComponent: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["containerComponent"]
        set(value) { setProp("ContainerComponent", value) }
    var Tag.containerProps: ListItemSecondaryActionProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["containerProps"]
        set(value) { setProp("ContainerProps", value) }
    var Tag.dense: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["dense"]
        set(value) { setProp("dense", value) }
    var Tag.disabled: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disabled"]
        set(value) { setProp("disabled", value) }
    var Tag.disableGutters: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableGutters"]
        set(value) { setProp("disableGutters", value) }
    var Tag.divider: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["divider"]
        set(value) { setProp("divider", value) }
    var Tag.selected: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["selected"]
        set(value) { setProp("selected", value) }
}