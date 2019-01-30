package components.menulist

import components.consumers
import components.list.ListElementBuilder
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class MenuListElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : ListElementBuilder<T>(type, tag, factory) {

    var Tag.disableListWrap: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableListWrap"]
        set(value) { setProp("disableListWrap", value) }
}