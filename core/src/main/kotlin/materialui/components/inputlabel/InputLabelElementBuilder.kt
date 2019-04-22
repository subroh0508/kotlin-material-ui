package materialui.components.inputlabel

import materialui.components.consumers
import materialui.components.formlabel.FormLabelElementBuilder
import materialui.components.inputlabel.enums.InputLabelMargin
import materialui.components.inputlabel.enums.InputLabelVariant
import kotlinx.html.Tag
import kotlinx.html.TagConsumer
import react.RComponent
import react.RProps
import react.RState
import kotlin.reflect.KClass

class InputLabelElementBuilder<T: Tag> internal constructor(
    type: RComponent<RProps, RState>,
    tag: KClass<T>,
    factory: (TagConsumer<Unit>) -> T = consumers(tag)
) : FormLabelElementBuilder<T>(type, tag, factory) {

    var Tag.disableAnimation: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableAnimation"]
        set(value) { setProp("disableAnimation", value) }
    var Tag.FormLabelClasses: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["FormLabelClasses"]
        set(value) { setProp("FormLabelClasses", value) }
    var Tag.margin: InputLabelMargin
        get() = InputLabelMargin.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["margin"])
        set(value) { setProp("margin", value.toString()) }
    var Tag.shrink: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["shrink"]
        set(value) { setProp("shrink", value) }
    var Tag.variant: InputLabelVariant
        get() = InputLabelVariant.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["variant"])
        set(value) { setProp("variant", value.toString()) }
}