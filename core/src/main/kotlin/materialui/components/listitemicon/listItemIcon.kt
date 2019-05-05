package materialui.components.listitemicon

import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/ListItemIcon")
private external val listItemIconModule: dynamic

external interface ListItemIconProps : StandardProps

@Suppress("UnsafeCastFromDynamic")
private val listItemIconComponent: RClass<ListItemIconProps> = listItemIconModule.default

fun RBuilder.listItemIcon(rootStyle: String? = null, block: ListItemIconElementBuilder.() -> Unit)
    = child(ListItemIconElementBuilder(listItemIconComponent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })).apply(block).create())
