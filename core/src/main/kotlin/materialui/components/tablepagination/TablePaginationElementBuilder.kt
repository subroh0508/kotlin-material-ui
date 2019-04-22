package materialui.components.tablepagination

import materialui.components.consumers
import materialui.components.tablecell.TableCellElementBuilder
import materialui.components.tablepagination.values.DisplayedRows
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import org.w3c.dom.events.Event
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement
import kotlin.reflect.KClass

class TablePaginationElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : TableCellElementBuilder<T>(type, tag, factory) {

    var Tag.ActionsComponent: RComponent<RProps, RState>
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["ActionsComponent"]
        set(value) { setProp("ActionsComponent", value) }
    var Tag.backIconButtonProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["backIconButtonProps"]
        set(value) { setProp("backIconButtonProps", value) }
    var Tag.colSpan: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["colSpan"]
        set(value) { setProp("colSpan", value) }
    var Tag.count: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["count"]
        set(value) { setProp("count", value) }
    var Tag.labelDisplayedRows: (DisplayedRows) -> ReactElement?
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["labelDisplayedRows"]
        set(value) { setProp("labelDisplayedRows", value) }
    var Tag.labelRowsPerPage: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["labelRowsPerPage"]
        set(value) { setProp("labelRowsPerPage", value) }
    var Tag.nextIconButtonProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["nextIconButtonProps"]
        set(value) { setProp("nextIconButtonProps", value) }
    var Tag.onChangePage: (Event, Number) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onChangePage"]
        set(value) { setProp("onChangePage", value) }
    var Tag.onChangeRowsPerPage: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onChangeRowsPerPage"]
        set(value) { setProp("onChangeRowsPerPage", value) }
    var Tag.page: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["page"]
        set(value) { setProp("page", value) }
    var Tag.rowsPerPage: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["rowsPerPage"]
        set(value) { setProp("rowsPerPage", value) }
    var Tag.rowsPerPageOptions: List<Int>
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["rowsPerPageOptions"]
        set(value) { setProp("rowsPerPageOptions", value) }
    var Tag.SelectProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["SelectProps"]
        set(value) { setProp("SelectProps", value) }
}