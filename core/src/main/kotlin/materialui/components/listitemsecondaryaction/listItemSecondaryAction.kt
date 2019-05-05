package materialui.components.listitemsecondaryaction

import materialui.components.MaterialStyle
import materialui.components.StandardProps
import react.RBuilder
import react.RClass

@JsModule("@material-ui/core/ListItemSecondaryAction")
private external val listItemSecondaryActionModule: dynamic

external interface ListItemSecondaryActionProps : StandardProps

@Suppress("UnsafeCastFromDynamic")
private val listItemSecondaryActionComponent: RClass<ListItemSecondaryActionProps> = listItemSecondaryActionModule.default

fun RBuilder.listItemSecondaryAction(rootStyle: String? = null, block: ListItemSecondaryActionElementBuilder.() -> Unit)
    = child(ListItemSecondaryActionElementBuilder(listItemSecondaryActionComponent, listOfNotNull(rootStyle?.let { MaterialStyle.root to it })).apply(block).create())
