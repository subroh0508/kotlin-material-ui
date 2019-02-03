package components.listitemicon

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/ListItemIcon")
private external val listItemIconModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val listItemIconComponent: RComponent<RProps, RState> = listItemIconModule.default

fun RBuilder.listItemIcon(block: ListItemIconElementBuilder.() -> Unit)
    = child(ListItemIconElementBuilder(listItemIconComponent).apply(block).create())
