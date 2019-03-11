package components.buttonbase

import components.MaterialElementBuilder
import components.buttonbase.enums.ButtonBaseStyle
import components.buttonbase.enums.ButtonType
import components.consumers
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import org.w3c.dom.events.Event
import react.RComponent
import react.RProps
import react.RRef
import react.RState
import kotlin.reflect.KClass

open class ButtonBaseElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    var Tag.buttonRef: RRef
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["buttonRef"]
        set(value) { setProp("buttonRef", value) }
    var Tag.centerRipple: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["centerRipple"]
        set(value) { setProp("centerRipple", value) }
    fun Tag.classes(vararg classMap: Pair<ButtonBaseStyle, String>) = setClasses(*classMap)
    var Tag.disabled: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disabled"]
        set(value) { setProp("disabled", value) }
    var Tag.disableRipple: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableRipple"]
        set(value) { setProp("disableRipple", value) }
    var Tag.disableTouchRipple: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableTouchRipple"]
        set(value) { setProp("disableTouchRipple", value) }
    var Tag.focusRipple: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["focusRipple"]
        set(value) { setProp("focusRipple", value) }
    var Tag.focusVisibleClassName: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["focusVisibleClassName"]
        set(value) { setProp("focusVisibleClassName", value) }
    var Tag.onFocusVisible: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onFocusVisible"]
        set(value) { setProp("onFocusVisible", value) }
    var Tag.touchRippleProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["touchRippleProps"]
        set(value) { setProp("touchRippleProps", value) }
    var Tag.type: ButtonType
        get() = ButtonType.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["type"])
        set(value) { setProp("type", value.toString()) }
}