package components.menu

import components.MaterialElementBuilder
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import org.w3c.dom.events.Event
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement
import values.TransitionDuration
import values.TransitionDuration.Auto.value
import kotlin.reflect.KClass

class MenuElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T
) : MaterialElementBuilder<T>(type, factory) {

    var Tag.anchorEl: ReactElement?
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["anchorEl"]
        set(value) { setProp("anchorEl", value) }
    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.disableAutoFocusItem: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableAutoFocusItem"]
        set(value) { setProp("disableAutoFocusItem", value) }
    var Tag.menuListProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["MenuListProps"]
        set(value) { setProp("MenuListProps", value) }
    var Tag.onClose: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onClose"]
        set(value) { setProp("onClose", value) }
    var Tag.onEnter: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onEnter"]
        set(value) { setProp("onEnter", value) }
    var Tag.onEntered: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onEntered"]
        set(value) { setProp("onEntered", value) }
    var Tag.onEntering: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onEntering"]
        set(value) { setProp("onEntering", value) }
    var Tag.onExit: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onExit"]
        set(value) { setProp("onExit", value) }
    var Tag.onExited: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onExited"]
        set(value) { setProp("onExited", value) }
    var Tag.onExiting: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onExiting"]
        set(value) { setProp("onExiting", value) }
    var Tag.open: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["open"]
        set(value) { setProp("open", value) }
    var Tag.paperProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["PaperProps"]
        set(value) { setProp("PaperProps", value) }
    var Tag.theme: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["theme"]
        set(value) { setProp("theme", value) }
    var Tag.popoverClasses: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["PopoverClasses"]
        set(values) { setProp("PopoverClasses", value) }
    var Tag.transitionDuration: TransitionDuration
        get() = when (props.asDynamic()["transitionDuration"]) {
            "auto" -> TransitionDuration.Auto
            is Number -> TransitionDuration.Ms(props.asDynamic()["transitionDuration"] as Number)
            else -> TransitionDuration.EnterExit(
                enter = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["transitionDuration"].enter,
                exit = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["transitionDuration"].exit
            )
        }
        set(value) { setProp("transitionDuration", value.value) }
}