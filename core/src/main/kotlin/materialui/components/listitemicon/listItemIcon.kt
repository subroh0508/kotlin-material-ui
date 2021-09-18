package materialui.components.listitemicon

import materialui.ListItemIcon
import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.RBuilder

external interface ListItemIconProps : StandardProps

fun RBuilder.listItemIcon(rootStyle: String? = null, block: ListItemIconElementBuilder.() -> Unit) {
    child(ListItemIconElementBuilder(ListItemIcon, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })).apply(block).create())
}