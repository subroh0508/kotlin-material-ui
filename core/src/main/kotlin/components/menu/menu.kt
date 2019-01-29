package components.menu

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Menu")
private external val menuModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val menuComponent: RComponent<RProps, RState> = menuModule.default

fun RBuilder.menu(block: MenuElementBuilder.() -> Unit)
    = child(MenuElementBuilder(menuComponent).apply(block).create())