package components.collapse

import components.consumers
import kotlinx.css.LinearDimension
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import reacttransiton.RTransitionBuilder
import kotlin.reflect.KClass

class CollapseElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : RTransitionBuilder<T>(type, factory) {

    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.collapsedHeight: LinearDimension
        get() = LinearDimension(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["collapsedHeight"])
        set(value) { setProp("collapsedHeight", value.value) }
    var Tag.style: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["style"]
        set(value) { setProp("style", value) }
    var Tag.theme: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["theme"]
        set(value) { setProp("theme", value) }
}