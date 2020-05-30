package materialui.components.swipeabledrawer

import materialui.SwipeableDrawer
import materialui.components.drawer.DrawerProps
import org.w3c.dom.events.Event
import react.RBuilder
import react.RProps

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

fun RBuilder.swipeableDrawer(block: SwipeableDrawerElementBuilder.() -> Unit)
    = child(SwipeableDrawerElementBuilder(SwipeableDrawer, listOf()).apply(block).create())
