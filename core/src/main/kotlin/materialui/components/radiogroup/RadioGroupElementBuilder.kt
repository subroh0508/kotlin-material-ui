package materialui.components.radiogroup

import materialui.components.formgroup.FormGroupElementBuilder
import materialui.components.radio.values.RadioValue
import kotlinx.html.Tag
import react.RComponent
import react.RProps
import react.RState

class RadioGroupElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : FormGroupElementBuilder(type) {

    var Tag.defaultValue: RadioValue
        get() = RadioValue.fromDynamic(props.asDynamic()["defaultValue"])
        set(value) { setProp("defaultValue", value.value) }
    var Tag.name: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["name"]
        set(value) { setProp("name", value) }
    var Tag.value: RadioValue
        get() = RadioValue.fromDynamic(props.asDynamic()["value"])
        set(value) { setProp("value", value.value) }
}