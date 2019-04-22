package materialui.components.circularprogress

import materialui.components.MaterialElementBuilder
import materialui.components.circularprogress.enums.CircularProgressColor
import materialui.components.circularprogress.enums.CircularProgressVariant
import materialui.components.circularprogress.values.CircularProgressValue
import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RComponent
import react.RProps
import react.RState

class CircularProgressElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : MaterialElementBuilder<DIV>(type, { DIV(mapOf(), it) }) {

    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.color: CircularProgressColor
        get() = CircularProgressColor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["color"])
        set(value) { setProp("color", value.toString()) }
    var Tag.disableShrink: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["disableShrink"]
        set(value) { setProp("disableShrink", value) }
    var Tag.size: CircularProgressValue
        get() = CircularProgressValue.fromDynamic(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["size"])
        set(value) { setProp("size", value.value) }
    var Tag.style: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["style"]
        set(value) { setProp("style", value) }
    var Tag.thickness: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["thickness"]
        set(value) { setProp("thickness", value) }
    var Tag.value: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["value"]
        set(value) { setProp("value", value) }
    var Tag.variant: CircularProgressVariant
        get() = CircularProgressVariant.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["variant"])
        set(value) { setProp("variant", value.toString()) }
}