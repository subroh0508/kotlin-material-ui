package materialui.components.divider

import materialui.components.MaterialElementBuilder
import materialui.components.consumers
import materialui.components.divider.enums.DividerVariant
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class DividerElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    var Tag.absolute: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["absolute"]
        set(value) { setProp("absolute", value) }
    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.inset: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["inset"]
        set(value) { setProp("inset", value) }
    var Tag.light: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["light"]
        set(value) { setProp("light", value) }
    var Tag.variant: DividerVariant
        get() = DividerVariant.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["variant"])
        set(value) { setProp("variant", value.toString()) }
}