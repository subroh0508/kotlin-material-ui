package components.formcontrol

import components.MaterialElementBuilder
import components.consumers
import components.formcontrol.enums.FormControlMargin
import components.formcontrol.enums.FormControlVariant
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class FormControlElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.disabled: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disabled"]
        set(value) { setProp("disabled", value) }
    var Tag.error: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["error"]
        set(value) { setProp("error", value) }
    var Tag.fullWidth: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["fullWidth"]
        set(value) { setProp("fullWidth", value) }
    var Tag.margin: FormControlMargin
        get() = FormControlMargin.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["margin"])
        set(value) { setProp("margin", value.toString()) }
    var Tag.required: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["required"]
        set(value) { setProp("required", value) }
    var Tag.variant: FormControlVariant
        get() = FormControlVariant.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["variant"])
        set(value) { setProp("variant", value.toString()) }
}