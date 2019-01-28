package components.list

import react.RBuilder
import react.RComponent
import react.RState

@JsModule("@material-ui/core/List")
private external val listModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val listComponent: RComponent<ListProps, RState> = listModule.default

fun RBuilder.list(block: ListElementBuilder.() -> Unit)
    = child(ListElementBuilder(listComponent).apply(block).create())