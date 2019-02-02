package components.swipeabledrawer

import components.drawer.DrawerElementBuilder
import kotlinx.html.Tag
import org.w3c.dom.events.Event
import react.RComponent
import react.RProps
import react.RState

class SwipeableDrawerElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : DrawerElementBuilder(type) {

    var Tag.disableBackdropTransition: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableBackdropTransition"]
        set(value) { setProp("disableBackdropTransition", value) }
    var Tag.disableDiscovery: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableDiscovery"]
        set(value) { setProp("disableDiscovery", value) }
    var Tag.disableSwipeToOpen: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableSwipeToOpen"]
        set(value) { setProp("disableSwipeToOpen", value) }
    var Tag.hideBackdrop: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["hideBackdrop"]
        set(value) { setProp("hideBackdrop", value) }
    var Tag.hysteresis: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["hysteresis"]
        set(value) { setProp("hysteresis", value) }
    var Tag.minFlingVelocity: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["minFlingVelocity"]
        set(value) { setProp("minFlingVelocity", value) }
    var Tag.onOpen: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onOpen"]
        set(value) { setProp("onOpen", value) }
    var Tag.swipeAreaProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["SwipeAreaProps"]
        set(value) { setProp("SwipeAreaProps", value) }
    var Tag.swipeAreaWidth: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["swipeAreaWidth"]
        set(value) { setProp("swipeAreaWidth", value) }
}