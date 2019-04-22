package materialui.components.tablecell

import materialui.components.MaterialElementBuilder
import materialui.components.consumers
import materialui.components.tablecell.enums.TableCellAlign
import materialui.components.tablecell.enums.TableCellPadding
import materialui.components.tablecell.enums.TableCellSortDirection
import materialui.components.tablecell.enums.TableCellVariant
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

open class TableCellElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    var Tag.align: TableCellAlign
        get() = TableCellAlign.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["align"])
        set(value) { setProp("align", value.toString()) }
    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    @Deprecated("Instead, use the `align` property.")
    var Tag.numeric: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["numeric"]
        set(value) { setProp("numeric", value) }
    var Tag.padding: TableCellPadding
        get() = TableCellPadding.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["padding"])
        set(value) { setProp("padding", value.toString()) }
    var Tag.scope: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["scope"]
        set(value) { setProp("scope", value) }
    var Tag.sortDirection: TableCellSortDirection
        get() = TableCellSortDirection.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["sortDirection"])
        set(value) { setProp("sortDirection", value.toString()) }
    var Tag.variant: TableCellVariant
        get() = TableCellVariant.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["variant"])
        set(value) { setProp("variant", value.toString()) }
}