package components.formlabel

import components.MaterialElementBuilder
import components.consumers
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

open class FormLabelElementBuilder<T: Tag> internal constructor(
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
    var Tag.filled: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["filled"]
        set(value) { setProp("filled", value) }
    var Tag.focused: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["focused"]
        set(value) { setProp("focused", value) }
    var Tag.muiFormControl: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["muiFormControl"]
        set(value) { setProp("muiFormControl", value) }
    var Tag.required: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["required"]
        set(value) { setProp("required", value) }
}