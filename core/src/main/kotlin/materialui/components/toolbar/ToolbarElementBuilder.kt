package materialui.components.toolbar

import materialui.components.MaterialElementBuilder
import materialui.components.consumers
import materialui.components.toolbar.enums.ToolbarVariant
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class ToolbarElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.disableGutters: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableGutters"]
        set(value) { setProp("disableGutters", value) }
    var Tag.variant: ToolbarVariant
        get() = ToolbarVariant.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["variant"])
        set(value) { setProp("variant", value.toString()) }
}