package components.list

import components.MaterialElementBuilder
import components.consumers
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement
import kotlin.reflect.KClass

class ListElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.dense: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["dense"]
        set(value) { setProp("dense", value) }
    var Tag.disablePadding: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disablePadding"]
        set(value) { setProp("disablePadding", value) }
    var Tag.subheader: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["subheader"]
        set(value) { setProp("subheader", value) }
}