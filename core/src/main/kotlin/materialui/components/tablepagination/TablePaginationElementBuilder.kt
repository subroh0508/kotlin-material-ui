package materialui.components.tablepagination

import kotlinx.html.BUTTON
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.getValue
import materialui.components.iconbutton.IconButtonElementBuilder
import materialui.components.iconbutton.iconButton
import materialui.components.select.SelectElementBuilder
import materialui.components.select.select
import materialui.components.setValue
import materialui.components.tablecell.TableCellElementBuilder
import materialui.components.tablepagination.enums.TablePaginationStyle
import org.w3c.dom.events.Event
import react.*
import kotlin.reflect.KClass

class TablePaginationElementBuilder<T: Tag> internal constructor(
    type: RClass<TablePaginationProps>,
    classMap: List<Pair<Enum<*>, String>>,
    factory: (TagConsumer<Unit>) -> T
) : TableCellElementBuilder<T, TablePaginationProps>(type, classMap, factory) {
    init {
        attrs.component = "TableCell"
    }

    fun Tag.classes(vararg classMap: Pair<TablePaginationStyle, String>) {
        classes(classMap.toList())
    }

    var Tag.backIconButtonProps: RProps? by materialProps
    var Tag.count: Int? by materialProps
    var Tag.labelDisplayedRows: ((LabelDisplayedRows) -> ReactElement)? by materialProps
    var Tag.labelRowsPerPage: ReactElement? by materialProps
    var Tag.nextIconButtonProps: RProps? by materialProps
    var Tag.onChangePage: ((Event, Int) -> Unit)? by materialProps
    var Tag.onChangeRowsPerPage: ((Event) -> Unit)? by materialProps
    var Tag.page: Int? by materialProps
    var Tag.rowsPerPage: Int? by materialProps
    var Tag.rowsPerPageOptions: Array<Int>? by materialProps
    var Tag.SelectProps: RProps? by materialProps

    fun <P: RProps, C: Component<P, *>> Tag.actionsComponent(kClass: KClass<C>) {
        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        @Suppress("UNCHECKED_CAST")
        materialProps.ActionsComponent = kClass.js as RClass<P>
    }
    fun Tag.actionsComponet(tagName: String) { materialProps.ActionsComponent = tagName }
    fun Tag.backIconButtonProps(block: IconButtonElementBuilder<BUTTON>.() -> Unit) {
        backIconButtonProps = RBuilder().iconButton(block = block).props
    }
    fun <T2: Tag> Tag.backIconButtonProps(factory: (TagConsumer<Unit>) -> T2, block: IconButtonElementBuilder<T2>.() -> Unit) {
        backIconButtonProps = RBuilder().iconButton(factory = factory, block = block).props
    }
    fun Tag.labelDisplayedRows(block: (from: Int, to: Int, count: Int, page: Int) -> ReactElement) {
        labelDisplayedRows = { obj -> block(obj.from, obj.to, obj.count, obj.page) }
    }
    fun Tag.labelRowsPerPage(block: RBuilder.() -> Unit) { labelRowsPerPage = buildElement(block) }
    fun Tag.nextIconButtonProps(block: IconButtonElementBuilder<BUTTON>.() -> Unit) {
        nextIconButtonProps = RBuilder().iconButton(block = block).props
    }
    fun <T2: Tag> Tag.nextIconButtonProps(factory: (TagConsumer<Unit>) -> T2, block: IconButtonElementBuilder<T2>.() -> Unit) {
        nextIconButtonProps = RBuilder().iconButton(factory = factory, block = block).props
    }
    fun Tag.onChangePerPage(block: (Event, Int) -> Unit) { onChangePage = block }
    fun Tag.onChangeRowsPerPage(block: (Event) -> Unit) { onChangeRowsPerPage = block }
    fun Tag.selectProps(block: SelectElementBuilder.() -> Unit) {
        SelectProps = RBuilder().select(block = block).props
    }
}