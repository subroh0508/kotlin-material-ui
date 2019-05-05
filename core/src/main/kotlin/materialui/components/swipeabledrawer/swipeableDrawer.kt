package materialui.components.swipeabledrawer

import materialui.components.drawer.DrawerProps
import org.w3c.dom.events.Event
import react.RBuilder
import react.RClass
import react.RProps

@JsModule("@material-ui/core/SwipeableDrawer")
private external val swipeableDrawerModule: dynamic

external interface SwipeableDrawerProps : DrawerProps {
    var disableBackdropTransition: Boolean?
    var disableDiscovery: Boolean?
    var disableSwipeToOpen: Boolean?
    var hideBackdrop: Boolean?
    var hysteresis: Number?
    var minFlingVelocity: Number?
    var onOpen: ((Event) -> Unit)?
    var SwipeAreaProps: RProps?
    var swipeAreaWidth: Number?
}

@Suppress("UnsafeCastFromDynamic")
private val swipeableDrawerComponent: RClass<SwipeableDrawerProps> = swipeableDrawerModule.default

fun RBuilder.swipeableDrawer(block: SwipeableDrawerElementBuilder.() -> Unit)
    = child(SwipeableDrawerElementBuilder(swipeableDrawerComponent, listOf()).apply(block).create())