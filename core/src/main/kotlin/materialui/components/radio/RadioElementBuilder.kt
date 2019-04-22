package materialui.components.radio

import materialui.components.internal.SwitchBaseElementBuilder
import materialui.components.radio.enums.RadioColor
import materialui.components.radio.values.RadioValue
import kotlinx.html.Tag
import react.RComponent
import react.RProps
import react.RState

class RadioElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : SwitchBaseElementBuilder<RadioValue>(type) {

    var Tag.color: RadioColor
        get() = RadioColor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["color"])
        set(value) { setProp("color", value.toString()) }
    override var Tag.value: RadioValue
        get() = RadioValue.fromDynamic(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["value"])
        set(value) { setProp("value", value.value) }
}