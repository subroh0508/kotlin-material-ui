package materialui.components.tablesortlabel

import materialui.components.buttonbase.ButtonBaseElementBuilder
import materialui.components.consumers
import materialui.components.tablesortlabel.enums.TableSortLabelDirection
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class TableSortLabelElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : ButtonBaseElementBuilder<T>(type, tag, factory) {

    var Tag.active: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["active"]
        set(value) { setProp("active", value) }
    var Tag.direction: TableSortLabelDirection
        get() = TableSortLabelDirection.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["direction"])
        set(value) { setProp("direction", value.toString()) }
    var Tag.hideSortIcon: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["hideSortIcon"]
        set(value) { setProp("hideSortIcon", value) }
    var Tag.IconComponent: RComponent<RProps, RState>
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["IconComponent"]
        set(value) { setProp("IconComponent", value) }
}