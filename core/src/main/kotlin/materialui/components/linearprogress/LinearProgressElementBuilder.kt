package materialui.components.linearprogress

import materialui.components.MaterialElementBuilder
import materialui.components.linearprogress.enums.LinearProgressColor
import materialui.components.linearprogress.enums.LinearProgressVariant
import kotlinx.html.DIV
import kotlinx.html.Tag
import react.RComponent
import react.RProps
import react.RState

class LinearProgressElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : MaterialElementBuilder<DIV>(type, { DIV(mapOf(), it) }) {

    var Tag.classes: Any
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["classes"]
        set(value) { setProp("classes", value) }
    var Tag.color: LinearProgressColor
        get() = LinearProgressColor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["color"])
        set(value) { setProp("color", value.toString()) }
    var Tag.value: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["value"]
        set(value) { setProp("value", value) }
    var Tag.valueBuffer: Number
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["valueBuffer"]
        set(value) { setProp("valueBuffer", value) }
    var Tag.variant: LinearProgressVariant
        get() = LinearProgressVariant.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["variant"])
        set(value) { setProp("variant", value.toString()) }
}