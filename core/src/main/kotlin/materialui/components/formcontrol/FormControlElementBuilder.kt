package materialui.components.formcontrol

import materialui.components.MaterialElementBuilder
import materialui.components.consumers
import materialui.components.formcontrol.enums.FormControlMargin
import materialui.components.formcontrol.enums.FormControlStyle
import materialui.components.formcontrol.enums.FormControlVariant
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

open class FormControlElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : MaterialElementBuilder<T>(type, factory) {

    fun Tag.classes(vararg classMap: Pair<FormControlStyle, String>) = setClasses(*classMap)
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