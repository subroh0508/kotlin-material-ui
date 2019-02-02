package components.gridlist

import components.MaterialElementBuilder
import components.consumers
import components.gridlist.values.GridListCellHeight
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class GridListElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    var Tag.cellHeight: GridListCellHeight
        get() = GridListCellHeight(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["cellHeight"])
        set(value) { setProp("cellHeight", value.value) }
    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.cols: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["cols"]
        set(value) { setProp("cols", value) }
    var Tag.spacing: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["spacing"]
        set(value) { setProp("spacing", value) }
    var Tag.style: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["style"]
        set(value) { setProp("style", value) }
}