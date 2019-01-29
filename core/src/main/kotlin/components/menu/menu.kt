package components.menu

import kotlinx.html.DIV
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Menu")
private external val menuModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val menuComponent: RComponent<RProps, RState> = menuModule.default

fun RBuilder.menu(block: MenuElementBuilder<DIV>.() -> Unit)
    = child(MenuElementBuilder(menuComponent, DIV::class) { DIV(mapOf(), it) }.apply(block).create())