package components.switches

import components.internal.SwitchBaseElementBuilder
import components.switches.enums.SwitchColor
import components.switches.values.SwitchValue
import kotlinx.html.Tag
import react.RComponent
import react.RProps
import react.RState

class SwitchElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : SwitchBaseElementBuilder<SwitchValue>(type) {

    var Tag.color: SwitchColor
        get() = SwitchColor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["color"])
        set(value) { setProp("color", value) }
    override var Tag.value: SwitchValue
        get() = SwitchValue.fromDynamic(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["value"])
        set(value) { setProp("value", value.value) }
}