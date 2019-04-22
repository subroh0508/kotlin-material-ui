package materialui.components.listsubheader

import materialui.components.MaterialElementBuilder
import materialui.components.consumers
import materialui.components.listsubheader.enums.MenuListColor
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class ListSubheaderElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.color: MenuListColor
        get() = MenuListColor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["color"])
        set(value) { setProp("color", value.toString()) }
    var Tag.disableGutters: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableGutters"]
        set(value) { setProp("disableGutters", value) }
    var Tag.disableSticky: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableSticky"]
        set(value) { setProp("disableSticky", value) }
    var Tag.inset: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["inset"]
        set(value) { setProp("inset", value) }

}