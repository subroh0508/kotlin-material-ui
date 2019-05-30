package materialui.components.listitem

import kotlinx.html.LI
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import materialui.components.StandardProps
import materialui.components.buttonbase.ButtonBaseProps
import materialui.components.listitem.enums.ListItemStyle
import react.RBuilder
import react.RClass
import react.RProps

@JsModule("@material-ui/core/ListItem")
private external val listItemModule: dynamic

external interface ListItemProps : StandardProps {
    var alignItems: String?
    var button: Boolean?
    var ContainerComponent: dynamic
    var ContainerProps: RProps?
    var dense: Boolean?
    var disabled: Boolean?
    var disableGutters: Boolean?
    var divider: Boolean?
    var selected: Boolean?
}

external interface ButtonListItemProps : ButtonBaseProps, ListItemProps

@Suppress("UnsafeCastFromDynamic")
private val listItemComponent: RClass<ListItemProps> = listItemModule.default

fun RBuilder.listItem(vararg classMap: Pair<ListItemStyle, String>, block: ListItemElementBuilder<LI, ListItemProps>.() -> Unit)
    = child(ListItemElementBuilder(listItemComponent, classMap.toList()) { LI(mapOf(), it) }.apply(block).create())

fun RBuilder.buttonListItem(vararg classMap: Pair<ListItemStyle, String>, block: ButtonListItemElementBuilder.() -> Unit)
    = child(ButtonListItemElementBuilder(listItemComponent, classMap.toList()).apply {
        block()
        attrs.button = true
    }.create())

fun <T: Tag> RBuilder.listItem(vararg classMap: Pair<ListItemStyle, String>, factory: (TagConsumer<Unit>) -> T, block: ListItemElementBuilder<T, ListItemProps>.() -> Unit)
    = child(ListItemElementBuilder(listItemComponent, classMap.toList(), factory).apply(block).create())