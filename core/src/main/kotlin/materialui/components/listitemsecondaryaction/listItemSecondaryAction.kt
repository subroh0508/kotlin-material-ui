package materialui.components.listitemsecondaryaction

import materialui.ListItemSecondaryAction
import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.RBuilder

external interface ListItemSecondaryActionProps : StandardProps

fun RBuilder.listItemSecondaryAction(rootStyle: String? = null, block: ListItemSecondaryActionElementBuilder.() -> Unit)
    = child(ListItemSecondaryActionElementBuilder(ListItemSecondaryAction, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })).apply(block).create())
