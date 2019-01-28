package components.listitem

import react.RBuilder
import react.RComponent
import react.RState

@JsModule("@material-ui/core/ListItem")
private external val listItemModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val listItemComponent: RComponent<ListItemProps, RState> = listItemModule.default

fun RBuilder.listItem(block: ListItemElementBuilder.() -> Unit)
    = child(ListItemElementBuilder(listItemComponent).apply(block).create())