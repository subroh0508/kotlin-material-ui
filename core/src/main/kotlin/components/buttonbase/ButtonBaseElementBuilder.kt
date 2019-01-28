package components.buttonbase

import components.MaterialElementBuilder
import components.buttonbase.enums.ButtonType
import kotlinx.html.Tag
import org.w3c.dom.events.Event
import react.RComponent
import react.RProps
import react.RRef
import react.RState
import kotlin.reflect.KClass

open class ButtonBaseElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>
) : MaterialElementBuilder<T>(type, tag), ButtonBaseAttributes {

    override var buttonRef: RRef
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["buttonRef"]
        set(value) { setProp("buttonRef", value) }
    override var centerRipple: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["centerRipple"]
        set(value) { setProp("centerRipple", value) }
    override var classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    override var disabled: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disabled"]
        set(value) { setProp("disabled", value) }
    override var disableRipple: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableRipple"]
        set(value) { setProp("disableRipple", value) }
    override var disableTouchRipple: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableTouchRipple"]
        set(value) { setProp("disableTouchRipple", value) }
    override var focusRipple: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["focusRipple"]
        set(value) { setProp("focusRipple", value) }
    override var focusVisibleClassName: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["focusVisibleClassName"]
        set(value) { setProp("focusVisibleClassName", value) }
    override var onFocusVisible: (Event) -> Unit
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["onFocusVisible"]
        set(value) { setProp("onFocusVisible", value) }
    override var touchRippleProps: RProps
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["touchRippleProps"]
        set(value) { setProp("touchRippleProps", value) }
    override var buttonType: ButtonType
        get() = ButtonType.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["type"])
        set(value) { setProp("type", value.toString()) }
}