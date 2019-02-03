package components.buttonbase

import components.consumers
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import reacttransiton.RTransitionGroupBuilder
import kotlin.reflect.KClass

class TouchRippleElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : RTransitionGroupBuilder<T>(type, factory) {

    var Tag.center: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["center"]
        set(value) { setProp("center", value) }
    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
}