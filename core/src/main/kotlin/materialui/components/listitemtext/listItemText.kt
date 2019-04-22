package materialui.components.listitemtext

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/ListItemText")
private external val listItemTextModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val listItemTextComponent: RComponent<RProps, RState> = listItemTextModule.default

fun RBuilder.listItemText(block: ListItemTextElementBuilder.() -> Unit)
    = child(ListItemTextElementBuilder(listItemTextComponent).apply(block).create())
