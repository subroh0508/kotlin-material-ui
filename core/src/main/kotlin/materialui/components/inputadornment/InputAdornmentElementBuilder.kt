package materialui.components.inputadornment

import materialui.components.MaterialElementBuilder
import materialui.components.consumers
import materialui.components.inputadornment.enums.InputAdornmentPosition
import materialui.components.inputadornment.enums.InputAdornmentVariant
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class InputAdornmentElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory){

    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.disablePointerEvents: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disablePointerEvents"]
        set(value) { setProp("disablePointerEvents", value) }
    var Tag.disableTypography: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableTypography"]
        set(value) { setProp("disableTypography", value) }
    var Tag.muiFormControl: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["muiFormControl"]
        set(value) { setProp("muiFormControl", value) }
    var Tag.position: InputAdornmentPosition
        get() = InputAdornmentPosition.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["position"])
        set(value) { setProp("position", value.toString()) }
    var Tag.variant: InputAdornmentVariant
        get() = InputAdornmentVariant.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["variant"])
        set(value) { setProp("variant", value.toString()) }
}