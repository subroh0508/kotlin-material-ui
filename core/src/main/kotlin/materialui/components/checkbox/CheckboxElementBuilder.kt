package materialui.components.checkbox

import materialui.components.checkbox.enums.CheckboxColor
import materialui.components.internal.SwitchBaseElementBuilder
import kotlinx.html.Tag
import react.RComponent
import react.RProps
import react.RState
import react.ReactElement

class CheckboxElementBuilder internal constructor(
    type: RComponent<RProps, RState>
) : SwitchBaseElementBuilder<String>(type) {

    var Tag.color: CheckboxColor
        get() = CheckboxColor.valueOf(@Suppress("UnsafeCastFromDynamic") props.asDynamic()["color"])
        set(value) { setProp("color", value.toString()) }
    var Tag.indeterminate: Boolean
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["indeterminate"]
        set(value) { setProp("indeterminate", value) }
    var Tag.indeterminateIcon: ReactElement
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["indeterminateIcon"]
        set(value) { setProp("indeterminateIcon", value) }
    override var Tag.value: String
        get() = @Suppress("UnsafeCastFromDynamic") props.asDynamic()["value"]
        set(value) { setProp("value", value) }
}