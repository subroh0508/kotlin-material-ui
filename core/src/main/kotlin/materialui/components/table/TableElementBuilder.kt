package materialui.components.table

import materialui.components.MaterialElementBuilder
import materialui.components.consumers
import materialui.components.table.enums.TablePadding
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class TableElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.padding: TablePadding
        get() = TablePadding.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["padding"])
        set(value) { setProp("padding", value.toString()) }
}