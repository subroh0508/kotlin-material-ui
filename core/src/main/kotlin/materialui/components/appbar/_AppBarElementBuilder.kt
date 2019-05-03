package materialui.components.appbar

import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.appbar.enums.AppBarColor
import materialui.components.appbar.enums.AppBarPosition
import materialui.components.consumers
import materialui.components.paper._PaperElementBuilder
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class _AppBarElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : _PaperElementBuilder<T>(type, tag, factory) {

    var Tag.color: AppBarColor
        get() = AppBarColor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["color"])
        set(value) { setProp("color", value.toString()) }
    var Tag.position: AppBarPosition
        get() = AppBarPosition.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["position"])
        set(value) { setProp("position", value.toString()) }
}