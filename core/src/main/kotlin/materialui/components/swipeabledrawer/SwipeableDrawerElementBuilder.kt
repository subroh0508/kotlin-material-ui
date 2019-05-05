package materialui.components.swipeabledrawer

import kotlinext.js.js
import kotlinx.html.DIV
import kotlinx.html.Tag
import kotlinx.html.stream.createHTML
import materialui.components.drawer.DrawerElementBuilder
import materialui.components.getValue
import materialui.components.setValue
import org.w3c.dom.events.Event
import react.RClass
import react.RProps

class SwipeableDrawerElementBuilder internal constructor(
    type: RClass<SwipeableDrawerProps>,
    classMap: List<Pair<Enum<*>, String>>
) : DrawerElementBuilder<SwipeableDrawerProps>(type, classMap) {

    var Tag.disableBackdropTransition: Boolean? by materialProps
    var Tag.disableDiscovery: Boolean? by materialProps
    var Tag.disableSwipeToOpen: Boolean? by materialProps
    var Tag.hideBackdrop: Boolean? by materialProps
    var Tag.hysteresis: Number? by materialProps
    var Tag.minFlingVelocity: Number? by materialProps
    var Tag.onOpen: ((Event) -> Unit)? by materialProps
    var Tag.SwipeAreaProps: RProps? by materialProps
    var Tag.swipeAreaWidth: Number? by materialProps

    fun Tag.swipeAreaProps(block: DIV.() -> Unit) {
        val props = js {  }

        DIV(mapOf(), createHTML()).apply(block).attributesEntries.forEach { (key, value) ->
            props[key] = value
        }

        @Suppress("UNCHECKED_CAST_TO_EXTERNAL_INTERFACE")
        SwipeAreaProps = props as RProps
    }
}