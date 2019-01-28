package components.appbar

import react.RBuilder
import react.RComponent
import react.RState

@JsModule("@material-ui/core/AppBar")
private external val appBarModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val appBarComponent: RComponent<AppBarProps, RState> = appBarModule.default

fun RBuilder.appBar(block: AppBarElementBuilder.() -> Unit)
    = child(AppBarElementBuilder(appBarComponent).apply(block).create())