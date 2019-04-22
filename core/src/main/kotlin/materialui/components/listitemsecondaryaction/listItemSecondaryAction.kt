package materialui.components.listitemsecondaryaction

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/ListItemSecondaryAction")
private external val listItemSecondaryActionModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val listItemSecondaryActionComponent: RComponent<RProps, RState> = listItemSecondaryActionModule.default

fun RBuilder.listItemSecondaryAction(block: ListItemSecondaryActionElementBuilder.() -> Unit)
    = child(ListItemSecondaryActionElementBuilder(listItemSecondaryActionComponent).apply(block).create())
