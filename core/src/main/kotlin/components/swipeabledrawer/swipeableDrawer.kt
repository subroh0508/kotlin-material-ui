package components.swipeabledrawer

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

@JsModule("@material-ui/core/SwipeableDrawer")
private external val swipeableDrawerModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val swipeableDrawerComponent: RComponent<RProps, RState> = swipeableDrawerModule.default

fun RBuilder.swipeableDrawer(block: SwipeableDrawerElementBuilder.() -> Unit)
    = child(SwipeableDrawerElementBuilder(swipeableDrawerComponent).apply(block).create())