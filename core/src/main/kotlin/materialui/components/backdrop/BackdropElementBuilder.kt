package materialui.components.backdrop

import materialui.components.MaterialElementBuilder
import materialui.components.backdrop.enum.BackdropStyle
import materialui.components.backdrop.values.TransitionDuration
import materialui.components.consumers
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import materialui.reacttransiton.RTransition
import materialui.reacttransiton.RTransitionBuilder
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

    fun Tag.classes(vararg classMap: Pair<BackdropStyle, String>) = setClasses(*classMap)

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