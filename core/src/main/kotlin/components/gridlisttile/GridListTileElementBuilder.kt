package components.gridlisttile

import components.MaterialElementBuilder
import components.consumers
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class GridListTileElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.cols: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["cols"]
        set(value) { setProp("cols", value) }
    var Tag.rows: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["rows"]
        set(value) { setProp("rows", value) }
}