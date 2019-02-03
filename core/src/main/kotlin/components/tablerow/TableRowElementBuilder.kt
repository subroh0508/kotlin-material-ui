package components.tablerow

import components.MaterialElementBuilder
import components.consumers
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class TableRowElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.hover: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["hover"]
        set(value) { setProp("hover", value) }
    var Tag.selected: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["selected"]
        set(value) { setProp("selected", value) }
}