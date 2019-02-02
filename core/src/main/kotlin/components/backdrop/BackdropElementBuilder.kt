package components.backdrop

import components.MaterialElementBuilder
import components.backdrop.values.TransitionDuration
import components.consumers
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import reacttransiton.RTransition
import reacttransiton.RTransitionBuilder
import kotlin.reflect.KClass

class BackdropElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag),
    transition: RTransitionBuilder = RTransitionBuilder()
) : MaterialElementBuilder<T>(type, factory), RTransition by transition {
    init {
        transition.props = props
    }

    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.invisible: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["invisible"]
        set(value) { setProp("invisible", value) }
    var Tag.open: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["open"]
        set(value) { setProp("open", value) }
    var Tag.transitionDuration: TransitionDuration
        get() = TransitionDuration.fromDynamic(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["transitionDuration"])
        set(value) { setProp("transitionDuration", value.value) }
}