package components.drawer

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/Drawer")
private external val drawerModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val drawerComponent: RComponent<RProps, RState> = drawerModule.default

fun RBuilder.drawer(block: DrawerElementBuilder.() -> Unit)
    = child(DrawerElementBuilder(drawerComponent).apply(block).create())
