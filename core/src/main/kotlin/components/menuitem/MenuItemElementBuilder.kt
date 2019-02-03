package components.menuitem

import components.consumers
import components.listitem.ListItemElementBuilder
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class MenuItemElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : ListItemElementBuilder<T>(type, tag, factory) {

    var Tag.role: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["role"]
        set(value) { setProp("role", value) }
}